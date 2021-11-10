package Bai6.Triangle;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }
    @Override
    public String toString(){
        return "Mau sac la"+color;
    };
}
