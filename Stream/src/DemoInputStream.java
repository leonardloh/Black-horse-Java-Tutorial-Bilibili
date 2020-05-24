import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Stream\\b.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char)len);
        }
    }
}
