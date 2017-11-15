package ch9;

/**
 * 构造器
 * 同一个类中每一个构造函数都会默认有super()，默认调用父类
 * 如果自己写了构造方法，编译器就不会自动添加无参构造方法
 *
 * 1.既然编译器会帮我们写，那为何还要自己写构造函数?
 * 如果你需要通过用户输入来完成对象的创建
 * 2.如何分辨构造函数和方法？
 * java可以有与类同名的方法而不会变成构造函数，其中
 * 差别构造函数不会有返回类型
 */
public class Duck extends Parent{
    int size=100;

    //重载构造函数,保证参数类型不同和顺序
    public Duck(int duckSize) {
        super();//编译器会自动帮我们加上，且是构造函数的第一个语句，调用父级构造函数(无参数的)
        System.out.println("天鹅,我是");
        size = duckSize;
        System.out.println("size is " + size);
    }

    public Duck() {
        super(22);
        System.out.println("天鹅,我是");
        System.out.println("size is " + size);
    }


}