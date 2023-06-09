package appleTask;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apple {

    private int weight;
    private Color color;

    public Apple (int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
//
//    public int getWeight () {
//        return weight;
//    }
//
//    public void setWeight (int weight) {
//        this.weight = weight;
//    }
//
//    public Color getColor () {
//        return color;
//    }
//
//    public void setColor (Color color) {
//        this.color = color;
//    }
//
//    @Override
//    public String toString () {
//        return "appleTask.Apple{" +
//                "weight=" + weight +
//                ", appleTask.Color=" + color +
//                '}';
//    }
}
