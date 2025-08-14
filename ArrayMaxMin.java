import java.util.Scanner;
public class ArrayMaxMin {
    // File: ArrayMaxMin.java

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Array input
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max & min
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Output
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        sc.close();
    }
}

