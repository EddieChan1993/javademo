package ch8;

/**
 ********************
 *      抽象类      *
 ********************
 * 产生于:
 * 继承中为了限制只有其子类才能被初始化，因为抽象类是没有具体对象的，所以new 抽象类。毫无意义
 *
 * 这个类无法被new出来,但可以作为引用类型
 * abstract public class Canine extends Animal
 *{
 *     public oid roam(){}
 *}
 *
 * public class MakeCanine{
 *     public void go(){
 *         Canine c;
 *         c=new Dog();
 *         c=new Canine();//编译通不过，因为该类是抽象类
 *     }
 * }
 *
 * 抽象方法
 * 将可继承的方法体(也就是有内容的方法)放在父类中是个好主意
 * 但有时就是没有办法做出给任何子类都有意义的共同程序代码
 *
 *  抽象方法的意义
 * 即便无法实现出方法的内容，但还是可以定义出一组子型共同的协议
 *
 * 好处：
 * 就是多态，记住，你想达到的目标是要使用父型作为方法的参数‘返回类型或者数组的类型。
 * 通过这个机制，你可以加入新的子型到程序中，却又不必重写或处理这些类型的程序。想象
 * 一下如果不是使用Animal作为Vuet的方法参数程序会写成什么样子。。。你必须为每一种
 * 动物写出不同的方法！因此堕胎的好处就在于所有子型都会有那些抽象的方法
 *
 * 抽象方法没有实体
 * 因为抽象方法一定会被覆盖的，所以书写程序代码没有任何意义，他只是标记出多态而存在
 * 这表示，继承树结构下的第一个具体类必须要实现出所有的抽象方法
 * public abstract void eat();<没有方法体>
 *
 * 你必须实现所有的抽象方法,强制性的
 *
 *
 *********************
 *   Object万用类    *
 *********************
 * 所有类都集成于Object类
 * 没有直接继承过其他类的类会是隐含的继承对象
 *
 * Object 类的方法
 * <o.equals(Object o)连个对象是否想相等>
 *     Dog a=new Dog());
 *     Cat c=new Cat();
 *     if(a.equals(c)){}
 *
 * <getClass() 此对象被初始化的位置>
 *     Cat c=new Cat();
 *     System.out.println(c.getClass)
 *
 * <hashCode() 此对象的hash代码>
 *     Cat c=new Cat();
 *     System.out.println(c.hashCode());
 *
 * <toString() 列出此对象的名称和我们不关心的数字>
 *     Cat c=new Cat();
 *     System.out.println(c.toString())
 *
 * Object类是具体类
 * 所以可以自己创建自己，常见的用法使用在线程的同步化上面<ch15>
 *
 * Object的主要目的
 * 1.作为多态，让方法可以应付多种类型的机制
 * 2.与线程有关
 *
 * Object代价
 * Dog不再是dog
 * public void go(){
 *     Dog aDog=new Dog();
 *     //getObject(aDog)使用多态特型调用的，继承关系，调用这儿是没问题的
 *     Dog sameDog=getObject(aDog);//编译通不过
 *     Object sameDog=getObject(aDog);//编译通过
 * }
 *
 * public Object getObject(Object o){
 *     return o;//返回同一个引用，但是类型已经转换成Object引用类型
 * }
 *
 * 类型转换
 * ArrayList<Object> a1=new ArrayList</Object>
 * a1.add(new Dog())
 * Object o=a1.get(index)
 * Dog d=(Dog)o
 */
public abstract class Demo {

}