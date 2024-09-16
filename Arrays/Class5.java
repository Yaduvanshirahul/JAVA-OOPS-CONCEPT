/* Optimize solution for 2nd largest element:
 
   T.C --> O(N) only for iterating a for loop
 
 */

import java.util.*;

public class Class5 {

    public static int secondLargNo(int[] arr) {
        int max, sec_max;
        max = sec_max = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                sec_max = max;
                max = x;

            } else {
                if (x > sec_max && x != max) {
                    sec_max = x;
                }
            }
        }
        return sec_max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 12, 32, 5, 83, 31 };
        System.out.println(secondLargNo(arr));

    }
}
