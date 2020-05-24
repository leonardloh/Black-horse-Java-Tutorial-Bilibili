package lambda;

/**
 * 使用lambda 优化日志案列
 * Lambda的特点，延迟加载
 * lambda的使用前提，必须存在函数式接口
 */
public class Demo02Lambda {

    //定义一个显示日志的方法,方法的参数传递日志的等级和MessageBuilder 接口
    public static void showLog(int level, MessageBuilder mb)
    {
        //对日志的等级进行判断，如果是一级，则调用MessageBuilder接口中的builderMessage方法
        if(level ==1)
        {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义3个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showLog方法
        showLog(1, () ->{
          //返回一个拼接好的字母串
          return msg1 + " " + msg2 + " " + msg3;
        });

        /**
         * 使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
         * 只有满足条件，日志的等级是1级，
         *  才会调用接口中的MessageBuilder中的方法builderMessage,才会拼接字符
         */
    }
}
