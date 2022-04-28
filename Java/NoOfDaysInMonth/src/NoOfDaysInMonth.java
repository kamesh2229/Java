public class NoOfDaysInMonth {


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }


    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1");
            return -1;
        } else if (isLeapYear(year)) {
            switch (month) {
                case  1 : case 3: case 5: case 7: case 8 : case 10 : case 12 : System.out.println(31);
                break;
                case 2 : System.out.println(29);
                break;
                case 4 : case 6 : case 9 : case 11 : System.out.println(30);
                break;
                default : System.out.println("Invalid Month");
                break;
            }
        } else if (!isLeapYear(year)) {

                switch (month) {
                    case 1: case 3 : case 5 : case 7 : case 8: case 10 : case 12 : System.out.println(31);
                    break;
                    case 2 : System.out.println(28);
                    break;
                    case 4 : case 6 : case 9 : case 11 : System.out.println(30);
                    break;
                    default: System.out.println("Invalid month");

                }
            } else {
                System.out.println("Invalid");


            }
            return -1;
        }
    }
