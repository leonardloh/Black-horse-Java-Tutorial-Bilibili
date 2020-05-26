package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ExercisePredicate {

    public static boolean check(String s, Predicate<String> pred1, Predicate<String> pred2)
    {
        return pred1.and(pred2).test(s);
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> result = new ArrayList();
        for (String data : arr) {
            boolean b = check(data,
                    (String str)->{
                        return str.split(",")[1].equals("女");
                    },
                    (String str)->{
                        return str.split(",")[0].length() == 4;
                    });

            if (b) {result.add(data);}
        }

        System.out.println(result);
    }
}
