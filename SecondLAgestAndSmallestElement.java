// Find the Lagest and smallest element in the array

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLAgestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("2nd lagest no is " + a[n - 2]);
        System.out.println("2nd smallest no is " + a[1]);

    }
}