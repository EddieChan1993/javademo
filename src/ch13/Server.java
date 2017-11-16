package ch13;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(){
        try{
            serverSocket = new ServerSocket(8088);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void start(){
        try{
            System.out.println("等待客户端连接。。。");
            //方法会产生阻塞，直到某个Socket连接，返回请求连接的Socket
            Socket socket = serverSocket.accept();
            System.out.println("客户端已连接！");
            //返回套接字的输入流
            InputStream in = socket.getInputStream();
            //是字节流通向字符流的桥梁
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            //每次调用 InputStreamReader 中的一个 read() 方法都会导致从底层输入流读取一个或多个字节。
            // 要启用从字节到字符的有效转换，可以提前从底层流读取更多的字节，使其超过满足当前读取操作所需的字节
            //为了达到最高效率，可要考虑在 BufferedReader 内包装 InputStreamReader
            BufferedReader br = new BufferedReader(isr);
            //读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行
            System.out.println("客户端说：" + br.readLine());
            //不断读取客户端数据
            while(true){
                System.out.println("客户端说：" + br.readLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Server server = new Server();
        server.start();
    }

}