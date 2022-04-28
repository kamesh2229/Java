package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue = 'F';

        switch(charValue) {

            case 'A':
                System.out.println("The value is A");
                break;

            case 'B':
                System.out.println("The value is B");
                break;

            case 'C':
                System.out.println("The value is C");
                break;

            case 'D':
                System.out.println("The value is D");
                break;

            case 'E':
                System.out.println("The value is E");
                break;

            default:
                System.out.println("The value is not A or B or C or D or E");
                break;



        }

        String month = "JANUARY";

        switch(month.toLowerCase()) {

            case "January" :
                System.out.println("Month is " + month);
                break;

            case "February" :
                System.out.println("Month is " + month);
                break;

            default :
                System.out.println("Not a month");
                break;

        }
    }
}