package DataTypeString;

public class Main {

    public static void main(String[] args) {
        // Not a primitive data type
        // Is actually a Class
        // Strings are immutable

        String myString = "This is a string";
        System.out.println(myString);
        myString += ", more to add";
        System.out.println(myString);
        myString += " \u00A9 2019";
        System.out.println(myString);

        String numString = "250.55";
        numString += "45.95";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println(lastString);
    }
}
