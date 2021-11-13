package Bai8.TachPhuongThuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }

    private static double getPerimeter(int radfius) {
        double perimeter = 2 * Math.PI  * radfius;
        return perimeter;
    }


}
