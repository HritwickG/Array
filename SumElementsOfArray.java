// Calculate sum of the elements of the array

import java.util.Scanner;

public class SumElementsOfArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a[] = new int[n];
        int Sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Sum = Sum + a[i];
        }
        System.out.println(Sum);

    }
}
