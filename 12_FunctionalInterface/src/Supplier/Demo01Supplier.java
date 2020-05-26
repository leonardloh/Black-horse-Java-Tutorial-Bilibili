package Supplier;

import java.util.function.Supplier;

/**
 * 常用的函数式接口
 * java.util.funcitonal.Supplier<T> 接口只报刊一个无参数的方法: T get()
 */
public class Demo01Supplier {
    //定义一个方法，方法的参数Supplier<T>接口，泛型执行String, get 方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法,方法的参数Supplier是一个函数式接口，所以可以用Lambda表达式
        String s = getString(()->{
           return "胡歌";
        });
        System.out.println(s);

        //优化
        String s2 = getString(()->"胡歌");
        System.out.println(s2);
    }
}
