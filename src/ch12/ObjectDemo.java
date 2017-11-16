package ch12;

import java.io.Serializable;

/**
 * implements Serializable
 * 没有方法需要被是西安，只是用来告诉Jav虚拟机可以被徐磊华
 */
public class ObjectDemo implements Serializable {
    private int width=123;
    transient private int height = 12;//标记为不需要序列号
    static String name = "asdf";

    public static String getName() {
        return name;
    }
    //为什么有些变量不能被序列化
    //可能设计者忘记实现Serializeble。
    //或者动态数据只可以在执行时求出而不能或不必存储。

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}