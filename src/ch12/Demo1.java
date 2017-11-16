package ch12;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 序列化之将字符串写入文本文件
 * 目的是让其他可能是非Java的程序读取
 * 例如你的Servlet(在web服务器上执行的java程序)
 * 会读取用户在网页上输入的数据，并将它写入文本文件
 * 以让管理人能够用电子表格式来分析数据
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("foo.txt");

        writer.write("hello Foo");//直接写入到文件中
        writer.write("hello Foo");//直接写入到文件中
        writer.write("hello Foo");//直接写入到文件中
        writer.write("hello Foo");//直接写入到文件中
        //这种方法有个弊端:
        //

        writer.close();
    }
}