package com.company;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        int myMinimumIntValue = Integer.MIN_VALUE;
        int myMaximumIntValue = Integer.MAX_VALUE;
        System.out.println("My Integer Minimum Value = " + myMinimumIntValue);
        System.out.println("My Integer Maximum Value = " + myMaximumIntValue);

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("My Byte Minimum Value = " + myMinimumByteValue );
        System.out.println("My Byte Maximum Value = " + myMaximumByteValue );

        short myMinimumShortValue = Short.MIN_VALUE;
        short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("My Short Minimum Value = " + myMinimumShortValue );
        System.out.println("My Short Maximum Value = " + myMaximumShortValue );

        long myMinimumLongtValue = Long.MIN_VALUE;
        long myMaximumLongtValue = Long.MAX_VALUE;
        System.out.println("My Long Minimum Value = " + myMaximumLongtValue );
        System.out.println("My Long Maximum Value = " + myMaximumLongtValue );

        byte myNewByteValue = (byte)(myMinimumByteValue / 2); //Type casting
    }
}
