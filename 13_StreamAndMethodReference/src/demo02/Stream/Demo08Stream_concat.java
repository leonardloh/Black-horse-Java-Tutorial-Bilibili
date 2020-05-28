package demo02.Stream;

import java.util.stream.Stream;

public class Demo08Stream_concat {
    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(name -> System.out.println(name));
    }
}
