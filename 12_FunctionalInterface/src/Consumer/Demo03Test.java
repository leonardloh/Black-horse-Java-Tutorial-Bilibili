package Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            //use andThen to join 2 consumer interfaces
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Loh JZ,male", "Jane,female", "Ali,male"};
        printInfo(arr,
                (message)->{
                    String name = message.split(",")[0];
                    System.out.println("Name: " + name );
                },
                (message)->{
                    String gender = message.split(",")[1];
                    System.out.println("Gender: " + gender );
                });
    }
}
