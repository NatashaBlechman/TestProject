import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a five-digit number: ");
        int enter = scanner.nextInt();
        String text = Integer.toString(enter);
        int length = text.length();
        int i=0;
        while (i<length){
            char result = text.charAt(i++);
            System.out.println(result);
        }
    }
}
