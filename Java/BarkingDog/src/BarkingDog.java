public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        {
            if (hourOfDay > 23 || hourOfDay < 0) {
                System.out.println("This is my false code");
                return false;

            } else {
                System.out.println("This is my true code");
                return barking && (hourOfDay < 8 || hourOfDay > 22);
            }

        }
    }
}







