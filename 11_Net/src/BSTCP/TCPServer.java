package BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket,和系统只懂得端口
        ServerSocket server = new ServerSocket(8888);

        Socket socket = server.accept();

        InputStream inputStream = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read读取客户端请求信息
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while((len = inputStream.read(bytes)) != -1){
//            System.out.println(new String(bytes, 0, len));
//        }

        //把is网络字节输入流转换成字符串缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        //把客户端请求信息的第一行读取出来 GET //11_net/web/index.html HTTP/1.1
        String line = br.readLine();
        //把读取的信息切割，只要中间部分 //11_net/web/index.html
        String[] arr = line.split(" ");
        //再把路径前面的 / 去除掉, 进行截取
        String htmlPath = arr[1].substring(1);
        File htmlFile = new File(System.getProperty("user.dir"), htmlPath);
        String absolutePath = htmlFile.getAbsolutePath();

        //创建一个本地的字节输入流，构造方法种绑定要读取的html路径
        FileInputStream fis = new FileInputStream(absolutePath);
        //使用socket中的方法getoutputstream 获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();

        //以下为固定写法
        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写复制文件，把服务器读取的html文件回写客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ( (len = fis.read(bytes))!= -1){
            os.write(bytes, 0, len);
        }

        //释放资源
        fis.close();
        socket.close();
        server.close();
    }
}
