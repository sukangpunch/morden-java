package modern.chapter2.quiz2_1;

public class Apple {
    private int weight = 0;
    private Color color;

    public Apple(int weight, Color color){
        this.weight =weight;
        this.color = color;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
