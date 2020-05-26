package Consumer;

import java.util.function.Consumer;

/**
 * Combine 2 consumer interface together using andThen
 *
 * Eg:
 *  Consumer<String> con1
 *  Consumer<String> con2
 *  String s = "hello"
 *  con1.accept(s)
 *  con2.accept(s)
 *
 *  joint 2 Consumer interfaces and accept
 *  con1.andThen(con2).accept(s);
 */
public class Demo02AndThen {
    //define a method, parameter : 2 consumer interfaces
    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
//
        //use AndThen method, combine both consumer interfaces together
        con1.andThen(con2).accept(s); //execute con1 then execute con2
    }

    public static void main(String[] args) {
        //use method
        method("hello",
                (t)->{
                    //change to upperCase
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }
}
