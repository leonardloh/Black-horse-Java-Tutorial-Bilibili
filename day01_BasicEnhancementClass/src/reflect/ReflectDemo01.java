package reflect;

import domain.Person;

public class ReflectDemo01 {
    /*
    获取Class对象方式
     */

    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")
        Class<?> cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        //2. 类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        //对象.getClass()
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        //比较3个对象
        System.out.println(cls1==cls2); //true
        System.out.println(cls1==cls3); //true
    }
}
