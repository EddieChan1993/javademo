package ch7;

/**
 * 编译器是根据引用类型来判断有哪些方法可以调用的，而不是根据对象类型
 * 引用类型方法调用可以这样抽象理解：
 * 遥控器，父类的遥控器功能少
 * 子类的遥控器功能多，因为他继承父类的遥控器
 */
public class Test {
    public static void main(String args[]) {
        A c = new C();
//        c.sayHello();编译通不过
        c.m1();

        C c2 = new C();
        c2.m2();
        c2.sayHello();
    }
}