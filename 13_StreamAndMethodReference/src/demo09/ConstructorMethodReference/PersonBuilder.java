package demo09.ConstructorMethodReference;

/**
 * 定一个创建Person对象的函数式接口
 */

public interface PersonBuilder {

    /**
     * 定义一个方法，根据传递的姓名，创建Person对象返回
     */

    Person builderPerson(String name);
}
