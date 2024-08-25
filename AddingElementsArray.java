
// Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.
import java.util.Scanner;

public class AddingElementsArray {

    static void insertAtBegin(int[] arr, int n, int k) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = k;
    }

    static void insertAtEnd(int[] arr, int n, int value) {
        arr[n] = value;
    }

    static void insertAtAnyPoint(int[] a, int n, int index, int value) {
        for (int i = n - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }
        a[index] = value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 3];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Add element at the 1st position");
        int k = sc.nextInt();
        insertAtBegin(a, n, k);
        n++;

        System.out.println("Add element at the last position");
        int value = sc.nextInt();
        insertAtEnd(a, n, value);
        n++;

        System.out.println("Enter the index no");
        int index = sc.nextInt();

        System.out.println("Enter the value");
        int z = sc.nextInt();
        insertAtAnyPoint(a, n, index, z);
        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
