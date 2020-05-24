package basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP通信的客户端L向服务器发送连接请求，给服务器发送数据，读取服务器回写数据
 *  表示客户端的类：
 *      java.net.Socket: 此类实现客户端套接字 (也可以叫 “套接字”)
 *
 *   构造方法:
 *      Socket (String host, int port)
 *      Param: host - ip and port
 *
 */

public class TCPClient {




    public static void main(String[] args) throws IOException {
        //1. 创建一个客户端对象 Socket, 钩爪方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        //2. 使用socket对象中的方法getOutputStream()获取网络字节输出流OutputStream 对象
        OutputStream outputStream = socket.getOutputStream();
        //3. 使用网络字节输出流OutputStream对象中的方法Write,给服务器发送数据
        outputStream.write("你好服务器".getBytes());

        //4 使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //5 使用网络字节输出流INputStream对象中的方法read,读取服务器回写数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();
    }

}
