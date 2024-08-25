//  Find the smallest element in array

import java.util.Scanner;

class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            // if (i < i + 1) {
            // System.out.println("Smallest Element is" + i);
            // }
            if (a[i] < min)
                min = a[i];
        }

        System.out.println(min);
    }
}