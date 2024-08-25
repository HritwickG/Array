//  Find the lagest element In the array

import java.util.Scanner;

public class LagestElementInTheArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println(max);
    }
}
