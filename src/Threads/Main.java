package Threads;

public class Main {
    public static void main(String[] args){
        MyRunnable hilo1 = new MyRunnable();
        Thread thread1 = new Thread(hilo1);
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

    }

}
