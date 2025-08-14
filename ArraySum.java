
import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        // Values input + sum calculation
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // add each element to sum
        }

        // Output sum
        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
