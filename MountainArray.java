// Rearrange the array such that order that 1st part is incressing and second part is decresing order

import java.util.Arrays;
import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(" Sorted array is");

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

        System.out.print("Mountain array is");
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = n - 1; i >= mid; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
