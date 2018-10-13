import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args){

        int sideOne = initSide( "First side: ");
        int sideTwo = initSide( "Second side: ");
        int sideThree = initSide( "Third side: ");

        validation(sideOne, sideTwo, sideThree);

        double triangleSquare = calculateTriangleSquare(sideOne, sideTwo, sideThree);

        System.out.println("The area of a triangle is equal " + triangleSquare);
        }

    private static double calculateTriangleSquare(int sideOne, int sideTwo, int sideThree) {
        double p = (sideOne + sideTwo + sideThree)/2.0;
        return sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    private static void validation(int sideOne, int sideTwo, int sideThree) {
        if(!(sideOne<sideThree+sideTwo && sideTwo<sideOne+sideThree && sideThree<sideTwo+sideOne)){
            throw new IllegalArgumentException("This is triangle dosnt exist");
        }
    }


    private static int initSide( String message) {
        System.out.print(message);
        int side = SCANNER.nextInt();
        if (side > 0) {
            return side;
        }
        throw new IllegalArgumentException("side not correct");

    }
}
