package Supplier;

import java.util.function.Supplier;

public class Demo02Supplier {

    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr ={ 100, 0, 50, 99, 33,-30};

        int maxValue = getMax(()->{
            int maxNum = arr[0];
            for (int i : arr) {
                if(i > maxNum)
                {
                    maxNum = i;
                }
            }
            return maxNum;
        });

        System.out.println(maxValue);
    }


}
