import java.awt.*;

public class YearsAndDays {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            double hours = minutes / 60;
            System.out.println("Hours " + hours);
            double days = hours / 24;
            System.out.println("Days " + days);
            int year = (int) (days / 365);
            System.out.println("Years " + year);
            int remainingDays = (int) (days % 365);
            System.out.println(minutes + " min "  + "= " + year + " y " + "and " + remainingDays + " d " );
        }
    }
}
