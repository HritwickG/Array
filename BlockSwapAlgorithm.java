// In this article we will learn a very popular algorithm for "Rotate array by K elements : Block Swap Algorithm".

// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

import java.util.Scanner;

public class BlockSwapAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");

        int k = sc.nextInt();
        for (int i = k; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
