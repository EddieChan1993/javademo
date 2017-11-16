package ch11.demo;

/**
 * 异常也是多态的
 */
public class Demo1 {
    //声明ClothingException对象
    public static void doLaundry(int i) throws ClothingException {
        switch (i) {
            case 1:
//                实例化他的所有子类
                throw new DressShirtException();
            case 2:
                throw new ShirtException();
            default:
                throw new ClothingException();
        }
    }
}