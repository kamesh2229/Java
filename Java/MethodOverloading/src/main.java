public class main {
    public static void main(String[] args) {
        double result = MethodOverloading.calcFeetAndInchesToCentimeters(-10,5);
        System.out.print("The feet to Inch conversion is " + result);
        System.out.println();
        double inchConversionResult = MethodOverloading.calcFeetAndInchesToCentimeter(-10);
        System.out.print("The inch and centimeter conversion is " + inchConversionResult);

    }
}
