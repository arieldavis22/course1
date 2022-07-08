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
        // In occupies 32 bits and has a width of 32.
        System.out.println("Min Int: " + myMinIntVal);
        System.out.println("Max Int: " + myMaxIntVal);

        /*
         Overflow is caused when we try to put to large a number
         into the space allocated by the computer for an int.
         Underflow is doing the same in the case of the minimum.
         The computer will just skip back to the min or max num.
         */
        System.out.println("Overflow: " + (myMaxIntVal + 1));
        System.out.println("Underflow: " + (myMinIntVal - 1));

        // A Byte occupies 8 bits. Which means it has a width of 8.
        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println("Min Byte: " + myMinByteVal);
        System.out.println("Max Byte: " + myMaxByteVal);

        // A short occupies 16 bits, and has a width of 16.
        short myMinShortVal = Short.MIN_VALUE;
        short myMaxShortVal = Short.MAX_VALUE;
        System.out.println("Min Short: " + myMinShortVal);
        System.out.println("Max Short: " + myMaxShortVal);

        // A long occupies 64 bits, and has a width of 64
        // 2^63
        long myLongVal = 100L;
        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;
        System.out.println("Min Long: " + myMinLongVal);
        System.out.println("Max Long: " + myMaxLongVal);

        int myTotal = (myMinIntVal / 2);
        // Casting in Java means to treat or convert a number from one type to another
        byte myNewByteVal = (byte) (myMinByteVal / 2);

        // Challenge
        byte aByte = 2;
        short aShort = 2;
        int anInt = 3;
        long aLong = 50_000L + (10 * (aByte + aShort + anInt));
        System.out.println(aLong);
        // ================================

        /*
        Floats and Doubles are good for general floating point operations. Not great for
        precise calculations. Due to limitation with how they are stored. Java has a class
        called BigDecimal that can overcome this.
         */

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Min float: " + myMinFloatVal);
        System.out.println("Max float: " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Min double: " + myMinDoubleVal);
        System.out.println("Max double: " + myMaxDoubleVal);

        int myIntVal = 5 / 3;
        // A cast (for float)
//        float myFloatVal = (float) 5.25;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("int: " + myIntVal);
        System.out.println("float: " + myFloatVal);
        System.out.println("double: " + myDoubleVal);


        // Challenge
        double pounds = 2d;
        double kilograms = pounds * 0.45359231d;
        System.out.println("kilos: " + kilograms);
        //===========================================
    }
}
