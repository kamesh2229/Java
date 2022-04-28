public class MethodOverloading {


        public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
            if(feet <=0 || inches <0 || inches >12) {
                System.out.println("Invalid feet and inches");
                return -1;
            } else {
              double centimeters = (feet * 30.48) + (inches * 2.54);
              return centimeters;
            }


            }

        public static double calcFeetAndInchesToCentimeter(double inches) {
            if(inches < 0 ) {
                return -1;
            } else {
                double inchesToFeet = (int) (inches/12);
                double remainingInches = (int) (inches % 12);
                System.out.println(inches + " equal " + inchesToFeet + " feet " + " and " + remainingInches + " Inch ");

               double convertedResult = calcFeetAndInchesToCentimeters(inchesToFeet,remainingInches);
                return convertedResult;
        }
        }

        }



