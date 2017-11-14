package ch7;

/**
 * Created by Administrator on 2017-11-14.
 */
public class C extends A {
    public void sayHello() {
        System.out.print("heloo");
    }

    @Override
    void m1() {
        super.m1();//扩充父型的功能
        System.out.println("C's m1");
    }

    @Override
    void m2() {
        System.out.println("C's m2");
    }
}