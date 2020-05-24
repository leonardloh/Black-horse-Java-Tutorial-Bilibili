import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("FileWriter\\d.txt");
        fw.write("hello");
        fw.close();

    }
}
