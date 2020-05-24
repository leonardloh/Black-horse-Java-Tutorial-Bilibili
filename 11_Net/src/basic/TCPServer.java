package basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 通信的服务器端： 接受客户端的请求，读取客户端的数据，回写给客户端
 */

public class TCPServer {
    public static void main(String[] args) throws IOException {

        // 1. create ServerSocket object and fix port number
        ServerSocket server = new ServerSocket(8888);
        // 2. use the accept method from serversocket to get the socket object from client
        Socket socket = server.accept();
        //3 use getInputStream() from socket to gain stream data
        InputStream is = socket.getInputStream();
        // 4 use
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());

        socket.close();
        server.close();
    }

}
