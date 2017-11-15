package ch2;

/**
 * Created by Administrator on 2017-11-13.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        //创建Dog对象,ch3会详细说明这里，对象创建的过程就是实例化的过程
        Dog d = new Dog();

        //调用该对象的变量和方法
        d.size = 40;
        d.bark("asdf");
    }
}