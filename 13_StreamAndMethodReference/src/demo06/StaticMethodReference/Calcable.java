package demo06.StaticMethodReference;

@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对一个整数进行绝对值计算并返回
    int calcsAbs(int number);
}
