package demo07.SuperMethodReference;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello i am man");
    }

    //定义一个方法，参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法，方法的参数Greetable是一个函数式的接口,所以可以传递Lambda表达式
//        method(()->{
//            Human h = new Human();
//            //调用父类的sayHello方法
//            h.sayHello();
//        });

        //因为有子父类关系，所以存在一个关键字super,代表父类,所以我们可以直接使用super调用父类的成员方法
//        method(() -> {
//            super.sayHello();
//        });

        /*
        使用super引用成员方法
        super已经是存在的
        父类的成员方法sayHello也是存在的
        所以我们可以直接使用super引用父类的成员方法
         */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();

    }
}
