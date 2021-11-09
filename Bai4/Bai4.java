package Bai4;

public class Bai4 {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(3, true, 10, "yellow");
        Fan Fan2 = new Fan(2, false, 5, "blue");
        Fan1.String();
        Fan2.String();
    }
}

class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void String() {
        if (this.on) {
            System.out.println("speed is " + this.speed + " color is " + this.color + " radius is " + this.radius + ". Fan is on.");
        } else {
            System.out.println("color is " + this.color + " radius is " + this.radius + ". Fan is off.");
        }
    }
}
