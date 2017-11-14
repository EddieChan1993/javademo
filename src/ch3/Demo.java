package ch3;

import ch2.Dog;

/**
 * 变量有两种:
 * primitive主数据类型变量
 * 引用变量
 * 命名
 * 字母,_,$开头
 */
public class Demo {
    /**
     * primitive主数据类型变量
     */
    boolean isFun = true;//true,false

    byte b = 89;//-128~127
    short a = 12;//-32768~32767
    int x = 232;//-2147483648~2147483648
    long big = 34332;//-很大~+很大

    double d = 3456.96;
    float f = 32.5f;

    char c = 'f';

    /**
     * Dog myDog
     * Dog为引用类型
     * 声明一个引用变量
     * java虚拟机分配存储空间给引用变量，命名为myDog,该变量固定为Dog类型
     * new Dog()
     * Dog为对象类型
     * java虚拟机分配堆空间给新建立的Dog对象(Dog内容+他的继承类的内容)
     * =
     * 将该对象的引用地址赋值给mydog
     */
    Dog myDog = new Dog();

    /**
     * 当上面新建的对象没有变量引用时，就会被回收
     * 例如:myDog=null,myDog指向另一个同类型对象
     */
}