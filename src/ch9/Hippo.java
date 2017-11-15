package ch9;

/**
 * this(),super()都用于同一类中，但不能共存
 * this()调自己的构造方法
 * super()调父级的构造方法
 * 默认情况
 * 编译器自动添加super()调的是父级的无参构造方法
 * 如果手动加了任意一个，编译器就不会加了
 */
public class Hippo extends Animal {

    public Hippo(String name) {
        super("Animal的名字"+name);
    }

    public Hippo(int size) {
        super("Animal的名字自动补充");
        System.out.println("Hippo的size"+size);
    }

    public Hippo() {
        this(12);
        System.out.println("Hippo的无参构造函数");
    }
}