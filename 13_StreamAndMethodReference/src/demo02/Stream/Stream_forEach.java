package demo02.Stream;

import java.util.stream.Stream;

/**
 * forEach 方法接受Consumer接口函数，会将每一个流元素交给该函数进行处理
 * Consumer接口是一个消费型接口，可以传递Lambda表达式,消费数据
 *
 * 简单记：
 *      forEach 方法，用来遍历流中的数据
 *      是一个终结方法，遍历之后不能继续调用Stream流中的其他方法
 */
public class Stream_forEach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用Stream流中的方法forEach对Stream流中的数据进行便利
//        stream.forEach((String name)->{
//            System.out.println(name);
//        });

        //优化
        stream.forEach(name-> System.out.println(name));

    }
}
