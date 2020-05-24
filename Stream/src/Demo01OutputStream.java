import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("Stream\\a.txt");
//        fos.write(666);
//        fos.close();
//
//
//        FileOutputStream fos2 = new FileOutputStream("Stream\\b.txt");
//        fos2.write(new byte[]{65, 66, 67, 68, 69});
//        fos2.close();


        FileOutputStream fos3 = new FileOutputStream("Stream\\c.txt");
        byte[] words = "你好".getBytes();
        fos3.write(words);
        fos3.close();
    }
}
