// import java.util.Arrays;
// import java.util.Scanner;

// public class NonRepeatingElementArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean chk;
//         int a[] = new int[n + 1];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();

//         }
//         Arrays.sort(a);
//         for (int i = 0; i < n - 1; i++) {
//             if (a[i] == a[i + 1]) {
//                 // System.out.print(a[i] + " ");

//                 while (i < n - 1 && a[i] == a[i + 1]) {
//                     i++;
//                 }
//             } else {
//                 System.out.print(a[i] + " ");
//             }
//         }

//     }
// }

public class Main {
    static void findNonRepeatingElement(int nums[]) {
        boolean chk;
        for (int i = 0; i < nums.length; i++) {
            chk = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    chk = true;
                    break;
                }
            }
            if (!chk)
                System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -1, 1, 3, 1 };
        System.out.println("Non-repeating numbers are: ");
        findNonRepeatingElement(nums);
    }
}