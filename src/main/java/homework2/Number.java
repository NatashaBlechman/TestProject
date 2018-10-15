package homework2;

import java.util.Scanner;

public class Number {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        int a= init("Input number a :");
        int b=init("Input number b: ");
        int c=init("Input number c: ");
        int d=init("Input number d: ");
        int max=a;

        calculateMaxNumber(b, c, d, max);

    }

    private static void calculateMaxNumber(int b, int c, int d, int max) {
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("Max number is  " + max);
    }

    private static int init(String message) {
        System.out.print(message);
        return SCANNER.nextInt();
    }
}
