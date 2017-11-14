package ch6;

import ch2.Dog;

import java.util.ArrayList;

/**
 * ArrayList是javaAPI类
 * 1.可以自动调整大小
 * 2.只能那个携带对象,但编译器能够在i懂将primitive主数据类型包装成Object
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Dog> myList = new ArrayList<Dog>();
        Dog s = new Dog();
        Dog b = new Dog();

//        myList.add(s);
        myList.add(b);

        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.contains(s));
        System.out.println(myList.indexOf(s));//查询位置0~size-1，没有则为-1
        System.out.println(myList.isEmpty());
        System.out.println(myList.remove(s));

        /**
         * ArrayList和数组对比
         * ArrayList是高级类，比数组更加强悍
         */
        ArrayList<String> str = new ArrayList<String>();

        str.add("asdf");
        str.add("2323");
        System.out.println(str.size());

        String[] str2 = {"asd", "bbb", "aaa"};
        System.out.println(str2.length);
    }
}