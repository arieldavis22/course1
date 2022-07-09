package OperatorsExpressions;

public class Main {

    public static void main(String[] args) {

        // 1 + 2 = 3
        int result = 1 + 2;
        System.out.println("1+2= " + result);
        int prevResults = result;
        System.out.println("prev: " + prevResults);

        // 3 - 1 = 2
        result -= 1;
        System.out.println("sub: " + result);

        //2 * 10 = 20
        result *= 10;
        System.out.println("multi: " + result);

        // 20 / 5 = 4
        result /= 5;
        System.out.println("divide: " + result);

        // get remainder of (4 % 3) = 1
        // How many times does 3 go into 4 (one time) and has what remainder (1)
        result %= 3;
        System.out.println("remainder: " + result);


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Not an alien");
            System.out.println("something else");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the top score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("yay");
        }

        // Challenge

        double aDouble = 20d;
        double secondDouble = 80d;

        double theResult = (100 * (aDouble + secondDouble)) % 40d;
        System.out.println(theResult);

        boolean isTrue = (theResult == 0) ? true : false;
        System.out.println(isTrue);
        if (!isTrue) {
            System.out.println("remainder");
        }
    }
}
