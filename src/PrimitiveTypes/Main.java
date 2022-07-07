package PrimitiveTypes;

public class Main {
    public static void main(String[] args) {

        int myValue = 10_000;

        /*
         The Keyword Integer is what is called a Wrapper Class
         Used by all 8 primitive java data types
         */
        int myMinIntVal = Integer.MIN_VALUE;
        int myMaxIntVal = Integer.MAX_VALUE;
        // The variables following the min and max string literals are converted into a string
        System.out.println("Min: " + myMinIntVal);
        System.out.println("Max: " + myMaxIntVal);

        /*
         Overflow is caused when we try to put to large a number
         into the space allocated by the computer for an int.
         Underflow is doing the same in the case of the minimum.
         The computer will just skip back to the min or max num.
         */
        System.out.println("Overflow: " + (myMaxIntVal + 1));
        System.out.println("Underflow: " + (myMinIntVal - 1));
    }
}
