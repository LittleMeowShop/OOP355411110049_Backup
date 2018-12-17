package Lab4;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter Integer 1 :");
        x = sc.nextInt();
        System.out.print("Enter Integer 2 :");
        y = sc.nextInt();
        //call methods
        System.out.println("Sum = " + sum(x, y));
        System.out.println("Sub = " + sub(x, y));
        System.out.println("Mul = " + mul(x, y));
        System.out.println("Div = " + div(x, y));

    }//main

    private static int sum(int x, int y) {
        return x + y;
    }//sum

    private static int sub(int x, int y) {
        return x - y;
    }//sub

    private static int mul(int x, int y) {
        return x * y;
    }//mul

    private static int div(int x, int y) {
        return x / y;
    }//div


}//class
