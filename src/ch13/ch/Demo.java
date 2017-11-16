package ch13.ch;

/**
 * 线程(多个处理器，否则Java上新的线程其实不会是运行在操作系统上独立的进程)
 * 虽然感觉很像
 * <p>
 * 线程是独立的线程，它代表独立的执行空间。
 * 每个Java应用程序都会启动一个主线程
 * 将main()放在它自己执行空间的最开始处
 * 程序员负责启动自己的线程
 * <p>
 * 原理
 * java虚拟机调用main
 * main启动新的线程。新的线程启动期间main的线程会暂时停止执行
 * java虚拟机会在线程与原来的主线程间奇幻知道两者都完成为止
 * <p>
 * Thread对象需要任务，不然就是植物人，直接被废弃
 * 任务是线程启动时去执行的工作。该任务是新线程空间上
 * 的第一个方法，且它一定要长得像下面这样
 * public void run(){}
 * <p>
 * 线程怎么会知道要先放上哪个方法？
 * 因为Runnable定义了一个协约。
 * 线程只在乎传入给Thread的构造函数的参数是否为实现Runnable的类
 * <p>
 * Runable这个接口只有一个方法
 * public void run（）
 *
 * 一旦线程进入执行状态，它会在可执行与执行中
 * 两种状态中来来去去，同时也有另一种状态：暂时不可执行(堵塞状态)
 *
 * 线程会在可执行与执行中两种状态来回交通，因为Java虚拟机的线程
 * 调度会吧线程跳出来运行又把它踢回去以让其他的线程有执行机会
 *
 * 下面情况会导致线程暂时被挡住
 * 闲置。等待其他线程完成。等待串流的数据。等待被占用的对象解锁
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyRunable threadJob = new MyRunable();
        Thread myThread = new Thread(threadJob);
        Thread.sleep(2000);
        myThread.start();//在start之前那myThread只是个实例不是线程

            System.out.println("back in main");
    }
}