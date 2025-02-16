package modern.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"),
                new Apple(75,"brown")
        );

//        List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
//        System.out.println(greenApples);
//
//        List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
//        System.out.println(heavyApples);

        List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(greenApples2);

        List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
        System.out.println(weirdApples);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }

//    public static boolean isGreenApple(Apple apple){
//        return "green".equals(apple.getColor());
//    }
//
//    public static boolean isHeavyApple(Apple apple){
//        return apple.getWeight() > 150;
//    }

    //Predicate는 함수형 인터페이스로서, 하나의 입력 매개변수를 받아서 논리적인 조건을 판단하고 그 결과를 불리언 값으로 반환하는 'test' 메서드를 정의하고 있습니다.
    //주로 컬렉션의 요소를 필터링하거나 조건을 검증하는 데 사용됩니다.
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple{
        private int weight = 0;
        private String color = "";
        
        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }
        public int getWeight(){
            return weight;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString(){
            return String.format("Apple{color='%s', weight=%d}", color, weight);
        }



    }
}
