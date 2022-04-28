package com.company;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        double variableOne = 20.00d;
        double variableTwo = 80.00d;
        double resultOfBothDoubleVariables = (variableOne + variableTwo) * 100.00d;

        double reminder = resultOfBothDoubleVariables % 40.00d;
        System.out.println("The reminder is " + reminder);

        boolean resultOfReminder = (reminder == 0) ? true : false;
        System.out.println("The reminder is " + resultOfReminder);
        if(!resultOfReminder) {
            System.out.println("Got some reminder");




        }

        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
    }
}
