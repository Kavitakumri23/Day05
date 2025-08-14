import java.util.*;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Take an array as input from the user. Search for a given number a and print the index at which it occurs

        System.out.print("Enter your index value: ");
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }


        System.out.print("Enter the value to search in array: ");
        int a = sc.nextInt();
//        int[] marks = new int[3];
//        int marks[] = new int[3];
//        int marks[] = {78, 90,89};
//        marks[0] = 78; // c language
//        marks[1] = 90;  // networking
//        marks[2] = 89;   // DSA using c
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);1
//        System.out.println(marks[2]);
//        for (int i=0; i<size; i++){
//            System.out.println(numbers[i]);
//        }
//        System.out.println("Size of array : " + numbers.length);

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]== a){
                System.out.println("a found at index : " + i);
            }
        }

    }
}
