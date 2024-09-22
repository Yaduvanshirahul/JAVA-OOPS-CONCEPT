/* Swap 0 & 1 using pointer */

import java.util.Arrays;

public class Class8 {
    public static void swap(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            if (arr[start] > arr[end]) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            } else if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void newswap(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while (left < right) {

            if (arr[left] == 1) {
                if (arr[right] != 1) {
                    temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                right--;
            }
            left++;
        }

        // for(int x : arr){
        // System.out.println(x);
        // }

        System.out.println(Arrays.toString(arr));
        /* if u want to see array horizentally */
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 1, 0, 1, 0, 1 };
        swap(arr);

        System.out.println("New method");

        newswap(arr);
    }
}
