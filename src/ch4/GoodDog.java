package ch4;

/**
 * 封装的基本原则
 * 将你的实例变量标记为私有的
 * 并提供公有的getter和setter来控制存取动作
 */
public class GoodDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}