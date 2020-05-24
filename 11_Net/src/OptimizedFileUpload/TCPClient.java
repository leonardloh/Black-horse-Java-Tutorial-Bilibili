package OptimizedFileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Read local file, upload to server and read back the data sent by the server
 *
 * data source: C:\\1.jpg
 * destination: server
 *

 */

public class TCPClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\1.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();

        int len = 0;
        byte[] bytes = new byte[1024];
        while ( (len = fis.read(bytes)) != -1)
        {
            os.write(bytes, 0, len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ( (len = is.read(bytes)) != -1)
        {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }
}
