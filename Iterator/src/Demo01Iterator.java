import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        //创建集合对象，collection
        ArrayList<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("麦迪");
        coll.add("艾弗森");

        Iterator<String> iterator = coll.iterator();

    }
}
