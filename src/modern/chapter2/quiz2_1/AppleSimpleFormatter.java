package modern.chapter2.quiz2_1;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
