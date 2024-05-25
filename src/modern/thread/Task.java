package modern.thread;

public class Task implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for(int index = 0; index < 10; index++){
            sum += index;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread()+ "최종 합 :" + sum);
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            int sum = 0;
            for (int index = 0; index < 10; index++){
                sum += index;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread() + "최종 합:" + sum);
        };

        Thread subThread1 = new Thread(task);
        Thread subThread2 = new Thread(task);
        subThread1.start();
        subThread2.start();
    }
}
