package PrimitiveTypesFloatDouble;

public class Main {

    public static void main(String[] args) {
        // Floating point numbers are also known as real numbers.

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
