import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.desktop.SystemEventListener;

public class Hello {

    public static void main(String args[]) {
        System.out.println("Hello World");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastNumber = myTotal - 1000;
        System.out.println("My Total is " + myTotal);
        System.out.println("My First Number is " + myFirstNumber);
        System.out.println("My Last Output is" + myLastNumber);

    }
}
