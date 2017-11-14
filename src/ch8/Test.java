package ch8;

/**
 * 必须在这里实现A1接口的方法，这是合约规定
 *
 * 如何判断应该是设计类/子类/抽象类/接口
 * 1.如果新的类无法对其他的类通过IS-A测试时
 * 就设计不继承其他类的类
 *
 * 2.只有在需要某类的特殊化版本时，已覆盖或
 * 增加的方法来集成现在的类
 *
 * 3.当年你需要定义一群子类的模板，又不想让
 * 程序员初始化此模板时，设计出抽象的类给他们用
 *
 * 4.如果想要定义出类可以扮演的角色，使用接口
 */
public class Test implements A1,A2 {

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void A2Func() {

    }
}