package demo02.Stream;

import java.util.stream.Stream;

public class Demo03Stream_filter {

    public static void main(String[] args) {
        //创建一个stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //对stream流中的元素进行过滤，只要姓张的人
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //遍历stream2
        stream2.forEach(name -> System.out.println(name));
        /**
         * Stream属于管道流，只能被消费一次
         * 第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
         * 而这时第一个Stream流已经使用完毕，就会关闭了
         * 所以第一个Stream流就不能够在调用方法了
         * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
         */
//        stream.forEach(name -> System.out.println(name));
    }
}
