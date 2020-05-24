package lambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    //定义一个方法，方法的返回值使用函数式接口，comparator
    public static Comparator<String> getComparator(){
        //方法的返回值的类型是一个接口，那么我们可以返回这个接口的内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串的排序方法
//                return o1.length() - o2.length();
//            }
//        };

//        //方法的返回值的类型是一个函数式接口，我们可以使用Lambda表达式
//        return (String o1, String o2)->{
//            //按照字符串的降序排列
//            return o1.length() - o2.length();
//        };

        //继续优化Lambda表达式
        return (String o1, String o2)-> o2.length() - o1.length();
    }

    public static void main(String[] args) {
            String[] arr = {"aaa", "b", "ccccccc", "ddddddddddddddddd"};
            System.out.println(Arrays.toString(arr));

            //调用Arrays中的sort方法进行排序
            Arrays.sort(arr, getComparator());
            System.out.println(Arrays.toString(arr));
    }

}
