package ch9;

/**
 *
 */
abstract class Parent {
    public Parent() {
        System.out.println("无参数的Parent构造方法");
    }

    public Parent(int aa) {
        System.out.println("有参数"+aa+"的Parent构造方法");
    }
}