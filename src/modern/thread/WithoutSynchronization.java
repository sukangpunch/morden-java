package modern.thread;

public class WithoutSynchronization {
    public static void main(String[] args) {
        Count count = new Count();
        MyThread1 t1 = new MyThread1(count);
        MyThread2 t2 = new MyThread2(count);
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    Count c;
    public MyThread1(Count c){
        this.c = c;
    }

    @Override
    public void run(){
        c.print(5);
    }
}

class MyThread2 extends Thread{
    Count c;
    public MyThread2(Count c){
        this.c = c;
    }

    @Override
    public void run(){
        c.print(100);
    }
}

class Count{
   synchronized void print(int n){  //동기화 메서드
        for (int i=1; i<=5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
