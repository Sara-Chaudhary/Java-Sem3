// Program to " LEFT ROTATE  A ARRAY  N times " n being a user input .

import java.util.Scanner;
public class rotate {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void ro(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
    }
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int a[] = { 5, 6, 9, 5, 8, 9, 11, 8, 8 };
        System.out.println("\nOriginal array:");
        print(a);
        System.out.println("\nEnter no. of rotations: ");
        int n = Integer.parseInt(obj1.nextLine());
        obj1.close();
        ro(a , n);
        System.out.println("\nRotated array: ");
        print(a);
    }
}
