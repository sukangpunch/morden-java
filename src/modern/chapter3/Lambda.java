package modern.chapter3;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello");
        r.run();

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );

        List<Apple> greenApples= filter(inventory, (Apple a) -> a.getColor() == Color.GREEN);
        System.out.println(greenApples);

        //a1과 a2의 무게를 뺍니다. 이 값이 양수이면 a1이 a2보다 무겁고, 음수이면 a1이 a2보다 가볍습니다.
        //결과적으로 이 값은 정렬 순서를 결정합니다.
        Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight();

        //sort(c): inventory 리스트를 Comparator<Apple> 객체 c를 사용하여 정렬합니다
        inventory.sort(c);
        System.out.println(inventory);
    }


    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate{
        boolean test(Apple a);
    }
}
