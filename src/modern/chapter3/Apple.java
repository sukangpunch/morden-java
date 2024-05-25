package modern.chapter3;

public class Apple {
    private int weight = 0;
    private Color color;
    public Apple(int weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //이 어노테이션은 컴파일러에게 특정 경고를 무시하라고 지시합니다.
    //boxing 경고: 기본형(primitive type)을 객체형(wrapper type)으로 자동 변환하는 과정을 "boxing"이라고 합니다.
    //예를 들어, int를 Integer로 변환하는 것이 boxing입니다.
    @SuppressWarnings("boxing")
    @Override
    public String toString(){
        return String.format("Apple{color = %s, weight = %d}", color, weight);
    }
}
