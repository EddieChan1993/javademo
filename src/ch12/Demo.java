package ch12;

import java.io.*;

/**
 * 序列化对象
 * 用途：存储和恢复数据
 * 游戏中的应用,保存游戏进度，和人物当前状态，
 * 下次进去之后，继续读取上次状态。
 *
 * 为什么要连接起来？
 * 流必须要连接某处才能算是流
 *
 * 静态变量会被序列化吗？
 * 不会，要记得static代表“每个类一个”而不是“每个对象一个”
 * 当对象被还原时，静态变量会维持类中原本的样子，而不是存储
 * 时的样子
 */
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化(写入对象到文件)
        ObjectDemo od = new ObjectDemo();
        od.setWidth(10000);

        //创建存取文件的FileOutputStream对象，如果文件不存在，他会自动创建
        FileOutputStream fileStream = new FileOutputStream("MyGame.ser");
        //创建了fileOutputStream和ObjectOutputStream的连接，他知道如何写入
        ObjectOutputStream os = new ObjectOutputStream(fileStream);
        //将变量所引用的对象序列化并写入MyGame.txt文件
        // 任何放在此处的对象都必须要实现序列化
        //否则在执行期一定会出问题
        os.writeObject(od);


        //反序列化(还原对象)
        FileInputStream fileInput = new FileInputStream("MyGame.ser");
        //读取对象
        ObjectInputStream oi = new ObjectInputStream(fileInput);
        Object one = oi.readObject();//从stream中读出对象ObjectDemo

        ObjectDemo objectDemo = (ObjectDemo) one;

        System.out.println(objectDemo.getHeight());
        System.out.println(objectDemo.getWidth());
        System.out.println(objectDemo.getName());

        os.close();
    }
}