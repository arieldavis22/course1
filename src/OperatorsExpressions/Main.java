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

    }
}
