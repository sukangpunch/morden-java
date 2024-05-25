package modern.chapter2.quiz2_1;

import java.util.Arrays;
import java.util.List;

public class Quiz {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(160, Color.GREEN),
                new Apple(80, Color.GREEN),
                new Apple(200,Color.RED)
        );

        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
