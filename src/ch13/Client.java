package ch13;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;

    public Client(){
        try {
            socket = new Socket("localhost", 8088);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(){

        try{
            //返回套接字的输出流
            OutputStream out = socket.getOutputStream();
            //字符流通向字节流的桥梁
            OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
            PrintWriter pw = new PrintWriter(osw, true);
            pw.println("你好！服务器！");
//            创建Scanner读取用户输入内容
            Scanner scanner = new Scanner(System.in);
            while(true){
                //scan.nextLine();
                pw.println(scanner.nextLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(socket != null){
                try{
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Client client = new Client();
        client.start();
    }

}