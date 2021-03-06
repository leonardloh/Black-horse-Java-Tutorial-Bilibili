package demo06.StaticMethodReference;

/**
 * 通过类名引用静态成员方法
 * 类已经存在，静态方法已经存在
 * 就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {

    //定义一个方法，方法的参数传递要计算绝对值的整数，和函数式接口Calcable

    public static int method(int number, Calcable c){
        return c.calcsAbs(number);
    }

    public static void main(String[] args) {

        //调用method的方法，传递计算绝对值的整数和Lambda表达式
        int number = method(-10, (n) -> {
            //对参数惊醒绝对值的计算并返回结果
            return Math.abs(n);
        });

        System.out.println(number);

        /**
         * 使用方法引用优化Lambda表达式
         * Math类是存在的
         * abs计算绝对值的静态方法也是存在的
         * 所以我们可以直接通过类名应用静态方法
         */

        int method2 = method(-10, Math::abs);
        System.out.println(method2);

    }
}
