package Bai5.StaticProperty;

public class Car {
    public static int numberOfCars;
    private final String name;
    private final String engine;

    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }
}
