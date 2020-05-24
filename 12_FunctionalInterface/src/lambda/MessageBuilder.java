package lambda;
@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接消息的抽象方法，返回定义的消息
    public abstract String builderMessage();
}
