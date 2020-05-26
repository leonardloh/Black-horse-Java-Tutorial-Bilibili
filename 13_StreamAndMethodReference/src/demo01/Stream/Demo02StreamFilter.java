package demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream流是JDK 1.8后才出现的
 */
public class Demo02StreamFilter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");


        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() ==3)
                .forEach(name -> System.out.println(name));
    }
}
