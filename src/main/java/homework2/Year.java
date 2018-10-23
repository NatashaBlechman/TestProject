package homework2;

import java.util.Scanner;

public class Year {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int year = init();
        int result = calculateDaysInYear(year);

        System.out.println("There are " + result + " days in this year");

    }

    private static int init() {
        System.out.println("Input year`s number : ");
        return SCANNER.nextInt();
    }

    private static int calculateDaysInYear(int year) {
        int result = (year % 4 == 0 && 0 < year % 100) ||
               400 % year == 0 ? 366 : 365;
        return result;
    }
}
