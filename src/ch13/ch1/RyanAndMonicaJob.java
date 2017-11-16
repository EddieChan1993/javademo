package ch13.ch1;

/**
 * 钱被透支了
 * 解决思路，加锁
 *必须要能够在其他线程静茹之前把任务执行完毕=
 *
 * 所谓的原子，被誉为最小物质单位不可分割
 *
 * 每个java独享都有一个锁，每个锁只有一把钥匙
 * 通常对象都没有上锁，也没有人在乎这件事
 *但如果对象有同步化的方法，则线程只能在取得钥匙的情况
 * 下进入线程。也就是说并没有其他线程已经进入的情况下
 * 才能进入
 *
 * sleep让当前线程暂时睡去
 * 醒来在睡前数据的基础上干活
 * sleep是线程内部实现的放大版
 *
 * 同步是要付出代价的
 * 1.性能损耗
 * 2.强制线程排队，等待执行方法，速度降低
 * 3.最可怕的是，导致死锁现象
 *
 * 死锁：
 * 两个线程互相持有对方正在等待的东西
 * 只有两个对象和线程就可以引起死锁
 */
class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    @Override
    public void run() {
        for(int x=0;x<10;x++) {

//            synchronized (this) {
//                //this 代表当前对象
                makeWithdrawal(10);
//            }

            if (account.getBalance() < 0) {
                System.out.println(account.getBalance()+"已经没钱啦,你们两个逗逼别拿了!");
            }
        }
    }

    //synchronized同步
    //对象的锁只会在有同步化的方法上起作用
    //锁是配在对象上的，不是陪在方法上的
    //同步化的目的是保护重要数据
    //但是记住，你锁住的不是数据而是存取数据的方法
    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + "打算取钱");
            System.out.println(Thread.currentThread().getName() + "想睡一会儿");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "醒了");
                account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+"成功拿出这一笔");
        }else{
            System.out.println(account.getBalance()+"钱不够了!"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();
    }
}