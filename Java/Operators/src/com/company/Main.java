package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println("Previous Result = " + result);
        int newResult = result - 1;
        System.out.println("New Result = " + newResult);

        result++; // result + 1
        System.out.println("1 + 1  = " + result);

        result--; // 2-1
        System.out.println();

        result += 2; // 3 + 2

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got high score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than hundred");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Print that both the conditions are fine");
        }

        boolean isCar = true;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is supposed to be true");
        }



    }
}
