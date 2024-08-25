// Problem Statement: Find all the repeating elements present in an array.

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElementArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.print(a[i] + " ");

                while (i < n - 1 && a[i] == a[i + 1]) {
                    i++;
                }
            }
        }

    }
}
