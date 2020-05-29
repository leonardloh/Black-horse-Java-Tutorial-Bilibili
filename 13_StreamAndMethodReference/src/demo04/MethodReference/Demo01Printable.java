package demo04.MethodReference;

public class Demo01Printable {

    public static void printString(Printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

        /**
         * 分析：
         *  把参数s,传递给了System.out对象，调用out对象中的方法println对字符串进行输出
         *  注意：
         *      1. System.out对象是已经存在的
         *      2. println方法也是已经存在
         *  所以我们可以使用方法来优化lamba表达方式
         *  可以使用System.out方法直接(调用)println方法
         **/

        printString(System.out::println);
    }
}
