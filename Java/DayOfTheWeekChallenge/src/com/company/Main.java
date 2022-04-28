package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        dayOfTheWeek(0);
        dayOfTheWeek(5);
        dayOfTheWeek(-1);

        dayWeek(0);
        dayWeek(5);
        dayWeek(-2);

    }

    public static void dayOfTheWeek(int day) {

            switch (day) {

        case 0:
            System.out.println("The day is Sunday");
            break;

        case 1:
            System.out.println("The day is Monday");
            break;

        case 2:
            System.out.println("The day is Tuesday");
            break;

        case 3:
            System.out.println("The day is Wednesday");
            break;

        case 4:
            System.out.println("The day is Thursday");
            break;

        case 5:
            System.out.println("The day is Friday");
            break;

        case 6:
            System.out.println("The day is Saturday");
            break;

        default:
            System.out.println("Invalid Day");
            break;
    }
  }

  public static void dayWeek(int day) {
        if(day == 0) {
            System.out.println("The day is Sunday");
        } else if (day == 1) {
            System.out.println("The day is Monday");
        } else if (day == 2) {
            System.out.println("The day is Tuesday");
        } else if (day == 3) {
            System.out.println("The day is Wednesday");
        } else if (day == 4) {
            System.out.println("The day is Thursday");
        } else if (day == 5) {
            System.out.println("The day is Friday");
        } else if (day == 6) {
            System.out.println("The day is Saturday");
        } else {
            System.out.println("Not a Day");
        }
  }
}

