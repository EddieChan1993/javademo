package ch2;

/**
 * Dog类仅仅是对象的模板，他会告诉虚拟机如何创建某种类型的对象
 */
public class Dog {
    //实例变量
    int size;
    String breed;
    String name;

    //方法
    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}