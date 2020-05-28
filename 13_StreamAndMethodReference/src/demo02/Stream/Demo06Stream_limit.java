package demo02.Stream;

import java.util.stream.Stream;

public class Demo06Stream_limit {

    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream2 = stream.limit(3);
        //遍历stream2
        stream2.forEach(name -> System.out.println(name));
    }
}
