package modern.thread;

public class ThreadTestThread extends Thread{
    public static void main(String[] args) {
        ThreadTestThread test = new ThreadTestThread();
        test.start();
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
