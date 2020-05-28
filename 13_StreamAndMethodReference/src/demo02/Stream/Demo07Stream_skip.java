package demo02.Stream;

import java.util.stream.Stream;

public class Demo07Stream_skip {

    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用skip方法跳过前3个
        Stream<String> stream2 = stream.skip(3);
        //遍历stream2
        stream2.forEach(name -> System.out.println(name));
    }
}
