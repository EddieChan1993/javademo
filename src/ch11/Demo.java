package ch11;

/**
 * 异常
 * 异常就是对象，只是他是抛出来的
 * 编译器会核对每件事，除了RuntimeExceptions(逻辑错误，开发中就会第一时间解决的)之外
 *
 * 处理多个异常
 */
public class Demo {
    //声明他会抛出
    public static void takeRisk(int nums) throws BadException{
        if (nums>=0) {
//            创建Exception对象,并抛出
            throw new BadException();
        }else{
            System.out.println("这个数小于0");
        }
    }
}