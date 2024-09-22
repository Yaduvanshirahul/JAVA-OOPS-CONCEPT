/* Array: in java array also is --> 
 * 1. a collection of similar types of data elements.
 * 2. a data structure which is stored at continuous location.
 *     address of int a = 1024;
 *     address of int b = 1028;
 * 3. an indexed data structure.
 * 
 * note: but in java an array is internally an object.
 * to make an array similar way is follow as to create an object.
 * 
 * a. in c++ an array is statically and dynamically created but in java array is an object, it is always created dynamically(means it create only at run time).
 * 
 * b. since arrays are created at run time , java stores them in heap area.
 * 
 * c. they are created using the keyword new.
 * 
 */

public class Array1 {
    public static void main(String[] args) {

        /* Creating an array */

        /*
         * 1. Declare reference to the array
         * 
         * <data_type> [] <arr_ref>;
         * or
         * <data_types> <arr_ref>[];
         * []--> indicates the reference of the array
         * 
         * int[] arr; --> not an array it is the reference of an integer array(means
         * pointer)
         * 
         * 
         * 2. Declaring the actual array
         * 
         * <arr_ref>= new <data_type>[size];
         * 
         * arr= new int[10]; --> array object created in computer heap area
         * 
         * merge 1 and 2
         * 
         * <data_type>[] <arr_ref> = new <data_type>[size];
         */

        int[] arr = new int[6];

        /*
         * Array Access syntax
         * 
         * <arr_ref>[indx_no] = value; --> assign value to array.
         * 
         * var_name= <arr_ref>[index_no] --> accessing value of array.
         */

        arr[0] = 12;
        arr[1] = 122;
        arr[2] = 1;
        arr[3] = 34;
        arr[4] = 11;
        arr[5] = 10; // will compile but will throw ArrayIndexOutOfBoundsException
        System.out.println(arr[3]);

    }
}
