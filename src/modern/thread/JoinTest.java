package modern.thread;

public class JoinTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        long startTime = System.currentTimeMillis();

        try{
            thread1.join(); //메인 쓰레드가 thread1의 작업이 끝날 때 까지 기다린다.
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //thread1의 작업이 끝난 뒤 출력
        System.out.println("소요 시간: " + (System.currentTimeMillis() - startTime));
    }
}

class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i =0; i<200; i++){
            System.out.println("-");
        }
    }
}
