package homework2;

import java.util.Scanner;

public class Triangle {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int a = init("Input side a:");
        int b = init("Input side b: ");
        int c = init("Input side c: ");


        if (checkTriangleExisting(a, b, c)) {
            System.out.println("This triangle is exist");
        } else {
            System.out.println("This triangle not exist");
        }

    }

    private static boolean checkTriangleExisting(int a, int b, int c) {
        return (a + b > c && a + c > b && c + b > a);
    }

    private static int init(String message) {
        System.out.print(message);
        return SCANNER.nextInt();
    }
}


