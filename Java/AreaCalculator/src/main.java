public class main {
    public static void main(String[] args) {
        double areaCalculatorOne = AreaCalculator.area(5.0);
        double areaCalculatorTwo = AreaCalculator.area(-1);
        double areaOfRectangleOne = AreaCalculator.area(5.0,4.0);
        double areaOfRectangleTwo = AreaCalculator.area(-1,5);
        double areaOfRectangleThree = AreaCalculator.area(8,-3);


        System.out.println("Area of Circle is " + areaCalculatorOne);
        System.out.println("Area of Circle is " + areaCalculatorTwo);
        System.out.println("Area of Rectangle is " + areaOfRectangleOne);
        System.out.println("Area of Rectangle is " + areaOfRectangleTwo);
        System.out.println("Area of Rectangle is " + areaOfRectangleThree);
    }
}
