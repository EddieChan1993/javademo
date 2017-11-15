package ch10;

/**
 * 静态方法，直接用类名字调用，没有对象创建
 * 无法调用非静态变量
 * 无法调用非静态方法
 *
 * 静态变量：直接用类名字调用
 * 被同类的所有对象(实例)共享的变量
 *
 * 静态变量实在类被加载前初始化的
 * 类被加载的两种情况
 * 1.第一次创建新的实例
 * 2.或使用静态方法或变量
 *
 * 静态的final变量是常量
 * 一旦被初始化之后就不能改动
 *

 */
public class Song {
    private int size;
    public static final int FOO_X=123;//大写，并且_分隔
//    public static final int FOO_Y;//没有初始化

    private static final double BAR_SIGN;

    //这段程序会在类被加载时执行
    static{
        BAR_SIGN = (double) Math.random();
    }
    public static int duckCount = 0;//此静态变量只会在类第一次载入的时候初始化

    public static void getSize() {
//        this.size;//无法从静态方法中获取该对象的实例变量，因为，调用静态方法时，根本就没有创建对象，编译器无法知道是哪个对象的size
    }

    public Song() {
        duckCount++;
//        BAR_SIGN++;编译不通过，无法改动
    }
}