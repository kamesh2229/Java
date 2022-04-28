package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("My String equals to " + myString);

        myString = myString + ", and this is more.";
        System.out.println(myString);

        myString = myString + " \uA009 2019";
        System.out.println(myString);

        String numberString = "250";
        numberString = numberString + 45.5;
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);


    }
}
