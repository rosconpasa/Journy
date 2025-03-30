package Threads;

public class Main {
    public static void main(String[] args) {
        MyRunnable hilo1 = new MyRunnable("Hilo 1");
        Thread thread1 = new Thread(hilo1);
        Thread thread2 = new Thread(new MyRunnable("Hilo 2"));

        thread1.start();
        thread2.start();

    }

}
