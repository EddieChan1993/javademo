package ch10;

/**
 * final
 * final变量需要在初始化前就被赋值
 * static变量不需要
 * 
 * 修饰实力变量，局部变量，方法参数，防止值被变动
 * 修饰方法，类。防止方法的覆盖或子类继承
 *
 * 为何需要将类标记为final？这不会破坏面向对象的目的吗？
 * 将类标记为final的主要目的是为了安全。例如String这个
 * 类假使有人继承过，弄了一个行为很不一致的版本，就会对
 * 预期操作String的程序产生很多问题
 *
 * 如果类已经是final的，在标记final的方法是不是很多与
 * 非常对于，如果一个类布恩那个别子类化，他的所有方法根
 * 本无法被覆盖，如果只想部分不能被覆盖，那就单独final
 */
public class Foof {
    public final int size = 3;

    final int whuffe;

    Foof() {
        whuffe = 23;
    }

    void doStuff(final int x) {
        //不能改变x
    }

    void doMore() {
        final int z = 7;
    }
}