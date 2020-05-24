package demo04.lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦");
            }
        });

        invokeCook(()->{
            System.out.println("吃饭啦");
        });
    }

    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口的方法makeFood
    public static void invokeCook(Cook cook)
    {
        cook.makeFood();
    }


}
