package demo02.Stream;

import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数，转换（映射）为Integer的整数
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });

        stream2.forEach(i -> System.out.println(i));
    }
}
