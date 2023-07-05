package doublecolonoperator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private int make;
    private String model;

    public Car () {

    }

    public Car (Integer make) {
    }

    public Car (int make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car (String s, Integer integer) {
    }
}