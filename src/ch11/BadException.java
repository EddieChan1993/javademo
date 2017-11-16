package ch11;

/**
 * Created by Administrator on 2017-11-16.
 */
public class BadException extends Exception {
    public void OneError() {
        System.out.println("这个数不能大于等于0");
    }
}