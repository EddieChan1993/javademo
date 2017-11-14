package ch7;

/**
 * 编译器是根据引用类型来判断有哪些方法可以调用的，而不是根据对象类型
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