package ch11.demo;

/**
 * 继承的异常抛出顺序
 * 子类->父类。同类顺序无关
 */
public class Test {
    public static void main(String[] args) {
        try {
            Demo1.doLaundry(345234);
        } catch (DressShirtException e) {
            e.OneError();
//            e.printStackTrace();
        } catch (ShirtException e) {
            e.OneError();
//            e.printStackTrace();
        } catch (ClothingException e) {
            e.OneError();
//            e.printStackTrace();
        }
    }
}