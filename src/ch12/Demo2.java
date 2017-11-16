package ch12;

import java.io.*;

/**
 * Created by Administrator on 2017-11-16.
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("foo.txt");
        //FileReader是字符的链接到文本文件的串流
        FileReader fileReader = new FileReader(file);
        //将FileReader链接到BufferedReader以获取更高的效率
        //他只会在缓冲区读空的时候才能回头去磁盘读取
        BufferedReader reader = new BufferedReader(fileReader);

        //用String变量来承接所有读取的结果
        String line = null;

        while ((line = reader.readLine()) != null) {
            //一行一行的读
            System.out.println(line);
        }

        reader.close();
    }
}