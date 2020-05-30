package demo10.ArrayMethodReference;

import java.util.Arrays;

public class Demo {

    //定义一个方法，方法的参数传递创建数组的长度和ArrayBuilder接口，方法内部根据传递长度使用ArrayBuilder中的方法创建数组并返回
    public static int[] createArray(int length, ArrayBuilder ab)
    {
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        //调用createArray方法，调用数组长度和Lambda表达式
        int[] arr1 = createArray(10, (len) -> {
            return new int[len];
        });

        System.out.println(arr1.length);

        //use method reference to optimize lambda,
        // we know the thing to construct is int[]
        // length of the array is known
        // use method reference
        // int[] reference new,

        int[] arr2 = createArray(10, int[] :: new);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
    }
}
