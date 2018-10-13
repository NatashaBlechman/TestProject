import java.util.Scanner;

public class Circumference {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        if(radius<0){
            throw new IllegalArgumentException("Radius not correct");
        }
        double result = 2*Math.PI*radius;
        System.out.print("Circumference is " + result);
    }
}
