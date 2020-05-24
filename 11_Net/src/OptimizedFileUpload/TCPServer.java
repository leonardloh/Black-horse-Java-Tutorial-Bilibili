package OptimizedFileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Document upload to server: read files uploaded by the client and save to server hard disk
 */

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        /**
         * 让服务器一直处于监听状态（死循环accept)
         * 有一个客户端上传文件，就保存一个文件
         */

        while(true) {
            Socket socket = server.accept();
            /**
             * 使用多线程提高效率
             * 有一个客户端上传文件，就开启一个线程，完成文件上传
             */
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("D:\\Upload");
                        if(!file.exists())
                        {
                            file.mkdirs();
                        }

                        /**
                         * 自定义名字规则
                         * 规则:域名 + 毫秒值 +随机数
                         */
                        String fileName= "itcast" + System.currentTimeMillis() + new Random().nextInt(999999)+".jpg";

                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName + ".jpg");
                        int len =0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes)) != -1)
                        {
                            fos.write(bytes, 0, len);
                        }



                        OutputStream os = socket.getOutputStream();
                        os.write("upload successfully".getBytes());

                        fos.close();
                        socket.close();
                    }
                    catch (IOException e)
                    {
                        System.out.println(e.toString());
                    }
                }
            }).start();
        }

        //服务器不用关闭
//        server.close();

    }
}
