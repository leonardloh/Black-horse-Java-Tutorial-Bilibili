package lambda;

/**
 * 日志案例
 *
 * 发现以下代码存在性能浪费的问题
 * 调用showlog方法，传递的第二个函数是一个拼接后的字符串
 * 先把字符串拼接好，然后再调用showLog方法
 * showLog 方法中如果传递的日志等级不是1级
 * 所以感觉字符串白拼接了
 */
public class Demo01Logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String msg)
    {
        //对日志的等级进行判断，如果是1，输出日志信息
        if (level == 1)
        {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        //定义3个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlog方法，传递日志信息
        showLog(2, msg1 + " " + msg2 + " " + msg3);
    }
}
