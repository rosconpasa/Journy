package Threads;

public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name){
        this.name=name;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutandose "+getName()+": "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getName(){
        return name;
    }

}
