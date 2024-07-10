// Creating ArrayList using Class

package PACKAGE;

import java.util.*;

public class Class3_Create {
    public static class ArrayList {

        int[] arr = new int[2];
        int idx = 0;
        int size = 0;

        public void add(int ele) {

            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2);// when the size is equal to array length we create new
                                                               // array brr of double size and copy value in it
                arr = new int[brr.length]; // now create a array of arr[] of length equal to brr[] array
                arr = Arrays.copyOf(brr, brr.length);

                // by using these condition we can know increase the size of Array

            }
            arr[idx] = ele;
            idx++;
            size++;
        }
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(3);
        System.out.println(arr.size);

        /*
         * can't add new element in arraylist as size is full
         * arr.add(3);
         * System.out.println(arr.size);
         * }
         * to identify that size of array is full or not we add condition in add
         * function
         */

        arr.add(23);
        System.out.println(arr.size);

    }
}
