package ch13.ch;

/**
 * Created by Administrator on 2017-11-16.
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        go();
    }

    private void go() {
        doMore();
    }

    private void doMore() {
        for (int i=0;i<50;i++) {
            System.out.println("MyRunable");
        }
    }
}