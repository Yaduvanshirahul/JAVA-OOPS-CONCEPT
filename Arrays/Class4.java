/* Second largest element of array */

import java.util.Scanner;

import java.util.*;

public class Class4 {

    public static int findSecondLargest(int[] arr) {

        /*
         * Method 1:
         * Arrays.sort(arr);
         * return arr[arr.length - 2];
         */

        /*
         * Method 2:
         * for the case of when arr element are same also have to check
         * 
         * T.C --> O(nlogn) which takes more time to excute so we find some other way to
         * solve this
         */

        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {

                return arr[i - 1];
            }
        }

        return Integer.MIN_VALUE;

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondLargest(arr));
    }
}
