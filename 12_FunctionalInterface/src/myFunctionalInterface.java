/**
 * 函数式接口：有且只有一个抽象方法的接口，称之为函数式接口 functional interface
 * 当然接口中可以包含其他的方法（默认方法，静态方法，私有方法）
 * @FunctionalInterface 检测接口是否是函数式口耳口：
 *  是： 编译成空
 *  否：编译失败（接口中没有抽象方法的个数多于一个）
 */
@FunctionalInterface
public interface myFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}
