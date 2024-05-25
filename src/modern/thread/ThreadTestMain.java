package modern.thread;

public class ThreadTestMain extends Thread{
    public static void main(String[] args) {
        ThreadTestMain test = new ThreadTestMain();
        test.run();
        for (int i = 0; i < 50; i++){
            System.out.println(Thread.currentThread().getName()+" : " + i);
        }
    }
    @Override
    public void run(){
        System.out.println("print....." + Thread.currentThread().getName());
        for(int i = 0; i< 50; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
