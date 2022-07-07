/*
The public Java keyword is called an access modifier. Allows us to define scope
Keyword class is used to define a class, followed by the name of the class.
 */
public class Hello {

    /*
    Java will look for a main method when running a program. it is the entry point to any Java code
    Public is the same access modifier.
    Void is the keyword used to tell java that this method will not return anything.
     */

    public static void main(String[] args) {
        // Text in quote called a literal string
        System.out.println("Hello Ariel!");

        // Ints in Java can hold a max of 32 bits of space.
        int myFirstNum = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNum + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

    }
}
