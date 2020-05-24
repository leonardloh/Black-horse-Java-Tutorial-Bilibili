package FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Document upload to server: read files uploaded by the client and save to server hard disk
 */

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("D:\\Upload");
        if(!file.exists())
        {
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");
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
        server.close();

    }
}
