package modern.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {
   //ExecuteAround 클래스의 클래스 로더를 사용하여 클래스패스에서 ./data.txt 파일을 찾습니다. getResource 메서드는 URL 객체를 반환합니다.
   private static final String FILE = ExecuteAround.class.getResource("/modern/chapter3/data.txt").getFile();

    public static void main(String[] args) throws IOException {
        String result = processFileLimited();
        System.out.println("파일경로: "+ FILE);
        System.out.println(result);

        System.out.println("---");

        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLines);
    }

    public static String processFileLimited() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))){
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            return p.process(br);
        }
    }

    public interface BufferedReaderProcessor{
        String process(BufferedReader b) throws IOException;
    }
}
