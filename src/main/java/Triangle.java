import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First side: ");
        int sideOne = scanner.nextInt();
        System.out.print("Second side: ");
        int sideTwo = scanner.nextInt();
        System.out.print("Third side: ");
        int sideThree = scanner.nextInt();
        double p = (sideOne + sideTwo + sideThree)/2.0;// вычисление полупериметра
        double result = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));// вычисление площади
        System.out.print("The area of a triangle is equal " + result);
    }
}
