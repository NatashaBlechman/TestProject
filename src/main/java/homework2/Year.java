package homework2;

import java.util.Scanner;

public class Year {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int year = init();
        int result = calculateDaysInYear(year);


        System.out.println("There are " + result + " days in this year");

    }

    private static int init() {
        System.out.println("Input year`s number : ");
        return scanner.nextInt();
    }

    private static int calculateDaysInYear(int year) {
        int result;
        if (((year % 4 == 0) && (year % 100 > 0))
                || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
            result = 366;
        } else {
            result = 365;
        }
        return result;
    }
}
