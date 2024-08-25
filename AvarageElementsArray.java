// Given an array, we have to find the average of all the elements in the array.

import java.util.Scanner;

public class AvarageElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int Sum = 0;

        for (int i = 0; i < a.length; i++) {
            Sum = Sum + a[i];
        }
        System.out.println(Sum);
        int Avg = Sum / n;
        System.out.println("Avarage is " + Avg);
    }
}
