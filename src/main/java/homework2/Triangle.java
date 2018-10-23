package homework2;

import java.util.Scanner;

public class Triangle {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int a = init("Input side a:");
        int b = init("Input side b: ");
        int c = init("Input side c: ");


        calculateSidesOfTriangle(a, b, c);
    }

    private static void calculateSidesOfTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a)
            System.out.println("exist");

        throw new IllegalArgumentException("This triangle not exist");

        }

    private static int init(String message) {
        System.out.print(message);
        return SCANNER.nextInt();
    }
}


