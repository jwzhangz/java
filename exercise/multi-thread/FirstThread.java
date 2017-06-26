
import java.lang.Thread;

class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}

class MyThread1 extends Thread{
    private int i;

    public MyThread1(int i){
        super();
        this.i = i;
    }

    @Override
    public void run(){
        System.out.println(i);
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("MyRunnable");
    }
}

public class FirstThread {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // myThread.start();
        // System.out.println("finished");
        // MyThread1 t1 = new MyThread1(1);
        // MyThread1 t2 = new MyThread1(2);
        // MyThread1 t3 = new MyThread1(3);
        // MyThread1 t4 = new MyThread1(4);
        // MyThread1 t5 = new MyThread1(5);
        // MyThread1 t6 = new MyThread1(6);
        // MyThread1 t7 = new MyThread1(7);
        // MyThread1 t8 = new MyThread1(8);
        // MyThread1 t9 = new MyThread1(9);
        //
        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();
        // t6.start();
        // t7.start();
        // t8.start();
        // t9.start();

        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
