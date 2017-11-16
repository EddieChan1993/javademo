package ch13.ch;

/**
 * 线程会产生并发性问题
 * 例如两个线程会同时取单一对象的数据，
 * 引发数据损毁
 * 从而引发恐慌
 *
 */
public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("Alpha thread");
        beta.setName("Beta thread");

        alpha.start();
        beta.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name+"is running");
        }
    }
}