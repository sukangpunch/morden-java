package modern.thread;

public class Application extends Thread{
    public static void main(String[] args) {
        Application application = new Application();
        application.setDaemon(true);
        application.start();
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("메인 쓰레드 실행: " + i);
        }
    }

    @Override
    public void run(){
       while(true){
           try {
               Thread.sleep(2000);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
               System.out.println("데몬 쓰레드  실행");
       }
    }
}
