import java.awt.*;

public class IsLeapYear {

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 != 0) {
            System.out.println("This is not a leap year and it has 365 days");
            return false;
        } else if (year % 100 != 0) {
            System.out.println("This is a leap year and it has 366 days");
            return true;
        } else if (year % 400 !=0 ) {
            System.out.println("This is not a leap year and it has 365 days");
            return false;
        }
        return true;
    }
}