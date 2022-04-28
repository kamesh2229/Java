public class AreaCalculator {

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        } else {
            double areaOfCircleIs = radius * radius * Math.PI;
            return areaOfCircleIs;
        }
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        } else {
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }

    }
}
