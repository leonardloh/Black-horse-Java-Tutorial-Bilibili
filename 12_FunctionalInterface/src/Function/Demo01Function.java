package Function;

import java.util.function.Function;

public class Demo01Function {
    /**
     * Use apply in function interface to convert String to Integer
     */

    public static void change(String s, Function<String, Integer> func)
    {
        int in = func.apply(s); //autounboxing
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s, (String str)->{
            return Integer.parseInt(s);
        });
    }
}
