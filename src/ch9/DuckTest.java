package ch9;

/**
 *子类创建出实例时，他继承的父类也会依次执行new操作
 * 虽然抽象类不能new，但是抽象类也有构造函数
 *
 * 堆栈块：
 * new Duck的动作，Hippo()的构造函数进入堆栈的最上方
 * Duck调用父类的构造方法导致Parent()进入栈顶
 * Parent调用父类的构造方法导致Object()进入栈顶
 * Object执行完毕，他的堆块链弹出，接着继续执行Parent..
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new Duck(10);
        Duck duck2 = new Duck();
    }
}