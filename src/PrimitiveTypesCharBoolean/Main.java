package PrimitiveTypesCharBoolean;

public class Main {

    public static void main(String[] args) {
        // Char occupies two bytes of memory, or 16 bits. Width of 16.
        // The reason it isn't a single byte is due to it being allowed to store Unicode characters.
        char myChar = 'a';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);


        boolean myTrue = true;
        boolean myFalse = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
