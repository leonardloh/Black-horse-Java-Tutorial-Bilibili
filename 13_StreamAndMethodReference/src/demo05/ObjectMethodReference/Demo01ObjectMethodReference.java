package demo05.ObjectMethodReference;

/**
 * 通过对象名应用成员方法
 * 使用前提是对象名是已经存在的，成员方法也是存在的
 * 就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    //定义一个方法，方法参数传递一个Printable接口
    public static void printString(Printable p)
    {
        p.print("hello world!");
    }
    public static void main(String[] args) {
        //调用printString 方法，发表方法的参数printable是一个接口普，所以可以传递Lambda表达式
        printString((s) -> {
            MethodRefObj obj = new MethodRefObj();
            obj.printUpperCaseString(s);
        });

        /**
         * 使用方法引用来优化
         * 对象是已经存在了MethodRefObj
         * 成员方法也是已经存在的 printUpperCaseString
         * 所以我们可以使用对象名引用成员方法
         */
        MethodRefObj obj = new MethodRefObj();
        printString(obj :: printUpperCaseString);

    }
}
