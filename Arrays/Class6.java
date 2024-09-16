/* Swap every pair of alternate elements in the array
 * 
 * input: 9,3,6,12,4,32
 * output: 3,9,12,6,32,4
 */

import java.util.*;

public class Class6 {

    public static void swapPair(int[] arr) {

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            arr[i] = arr[i] + arr[i + 1];
            arr[i + 1] = arr[i] - arr[i + 1];
            arr[i] = arr[i] - arr[i + 1];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        swapPair(arr);
        System.out.println("after swapping");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
