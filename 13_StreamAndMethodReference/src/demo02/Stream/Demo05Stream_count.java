package demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Count 是一个终结方法，返回值是一个long类型的整数
 * 所以不能再继续调用Stream流中的其它方法了
 */
public class Demo05Stream_count {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);

    }
}
