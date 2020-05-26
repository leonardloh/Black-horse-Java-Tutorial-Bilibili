package demo02.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02getStream {

    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<String>();
        Stream<String> stream =list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<String,String>();
        //key stream
        Stream<String> stream3 = map.keySet().stream();
        //获取值，转到一个Collection集合中
        Stream<String> values = map.values().stream();
        //obtain key and value pair (entrySey)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //array to stream
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] array = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(array);
        String[] arr2 = {"a", "b", "c", "d", "e"};
        Stream<String> stream8 = Stream.of(arr2);
    }
}
