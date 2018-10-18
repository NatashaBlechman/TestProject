import java.util.Scanner;

public class Apartment {


    private final static Scanner SCANNER = new Scanner(System.in);
    private static final int QUANTITY_APARTMENTS_IN_ENTRANCE = 36;
    private static final int QUANTITY_FLOORS_IN_ENTRANCE = 9;
    private static final int QUANTITY_APARTMENTS_ON_FLOOR = 4;

    public static void main(String[] args) {
        int apartmentNumber = init();

        int entrance = calculateEntrance(apartmentNumber);
        int floor = calculateFloor(apartmentNumber);

        System.out.println("Number of entrance is:" + entrance);
        System.out.println("Number of floor is: " + floor);


//        int arr[] ={1,2,5,6,1000,4,6};
//        int arrcount[]=new int[1000];
//        for (int i = 0; i < arr.length; i++) {
//            int index=arr[i];
//            arrcount[index]++;
//        }

    }

    private static int calculateFloor(int apartmentNumber) {
        int ost = apartmentNumber % QUANTITY_APARTMENTS_IN_ENTRANCE;
        return (ost == 0) ? QUANTITY_FLOORS_IN_ENTRANCE : (ost / QUANTITY_APARTMENTS_ON_FLOOR + (ost % 4 == 0 ? 0 : 1));
    }

    private static int calculateEntrance(int number) {
        return number / QUANTITY_APARTMENTS_IN_ENTRANCE + (number % QUANTITY_APARTMENTS_IN_ENTRANCE == 0 ? 0 : 1);
    }

    private static int init() {
        System.out.println("Put the number: ");
        return SCANNER.nextInt();
    }

}
