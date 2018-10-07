import java.util.Scanner;

public class Circumference {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double result = 2*Math.PI*radius;
        System.out.print("Circumference is " + result);
    }
}
