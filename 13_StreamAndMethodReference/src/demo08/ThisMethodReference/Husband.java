package demo08.ThisMethodReference;

/**
 * 通过 this 饮用本来的成员方法
 */
public class Husband {

    public void buyHouse()
    {
        System.out.println("北京二环内买一套四合院！");
    }

    //定义一个结婚方法，参数传递Richable接口
    public void marry(Richable r)
    {
        r.buy();
    }

    //定义一个非常高兴的方法
    public void soHappy(){
        //结婚方法，方法的参数是Richable是一个函数式接口，传递Lambda表达式
//        marry(() -> {
//            this.buyHouse();
//        });


        /**
         *  使用方法引用优化Lambda表达式
         *  this 是已经存在的
         *  本类方法buyHouse() 也是存在的
         *  所以i我们可以直接使用this引用本类的成员方法buyHouse
         */

        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
