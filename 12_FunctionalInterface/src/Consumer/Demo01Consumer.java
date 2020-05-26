package Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {

    public static void method(String name, Consumer<String> consumer)
    {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        //调用 method 传递字符串姓名，方法的另一个参数是Consumer接口，是一个函数式接口
        method("罗大友", (String name) ->{
           //消费方式，直接输出字符串
            // System.out.println(name);

            //字符串进行反转输出
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
