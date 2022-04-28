public class DecimalComparator {

       public static boolean areEqualByThreeDecimalPlaces(double paramOne, double paramTwo){
           int convertedParamOne = (int) (paramOne * 1000);
           System.out.print("The first value is " + convertedParamOne);
           int convertedParamTwo = (int) (paramTwo * 1000);
           System.out.print("The second value is " + convertedParamTwo);
        if(convertedParamOne == convertedParamTwo) {
            System.out.print("The value is true ");
            return true;
        }
        else {
            System.out.print("The value is false");
            return false;
        }

        }
    }

