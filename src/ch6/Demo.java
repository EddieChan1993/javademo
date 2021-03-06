package ch6;

import ch2.Dog;

import java.util.ArrayList;

/**
 * ArrayList是javaAPI类
 * 1.可以自动调整大小
 * 2.只能那个携带对象,但编译器能够在i懂将primitive主数据类型包装成Object
 * 3.ArrayList<Object>取出的Object都会被当作是Object这个类的实例，而不管原来是什么
 * Arraylist<Animal> animal=new ArrayList<Animal>
 *     animal.add(new Dog())//多态，ok
 *     Dog samedog=animal.get(0)//编译报错
 *     Animal samedog=animal.get(0)//ok
 *
 * ArrayList不是唯一的集合
 * 虽然Array List会最常用，但偶尔还是会有特殊情况
 * (LIST:对付顺序的好帮手)
 * (SET:注重独一无二的性质)
 * (MAP:用key来搜索的专家)
 *
 * TreeSet-以有序状态保持并可防止重复
 * HashMap-可用成对的key/value来保存与取出
 * LinkedList-针对经常插入和删除中间元素所涉及的高效率集合
 * HashSet-防止重复的集合，可快速地寻找相符的元素
 * LinkedHashMap-类似HashMap，但可记住元素插入的顺序，也可以设定成依照元素上次存取的先后来排序
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