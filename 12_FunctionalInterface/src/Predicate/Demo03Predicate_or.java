package Predicate;

import java.util.function.Predicate;

public class Demo03Predicate_or {
    /**
     * Define a method, pass in 2 consumer interfaces:
     *  condition 1: length of String > 5
     *  condition 2: String contains 'a'
     */

    public static boolean checkString(String s, Predicate<String> pred1, Predicate<String> pred2) {
        //return pred1.test(s) || pred2.test(s);
        return pred1.or(pred2).test(s); // equals to return pred1.test(s) || pred2.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        //call checkString method
        boolean b = checkString(s,
                (String str)->{
                    return str.length()>5;
                },
                (String str)->{
                    return str.contains("a");
                });
        System.out.println(b);
    }
}
