package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int x =5;

    public static void main(String[] args) {
        String[] cars = {"BMW", "Volvo", "Benz"};
        System.out.println(cars.length);
        System.out.println(Arrays.stream(cars).iterator());
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);

                Main myObj = new Main();
                System.out.println(myObj.x);

                myObj.x = 25;
                System.out.println(myObj.x);
            }
        }


    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
}



