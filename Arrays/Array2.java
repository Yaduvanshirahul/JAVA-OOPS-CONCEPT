
public class Array2 {
    public static void main(String[] args) {

        /* Initialization An array */

        int[] months = new int[13];

        months[1] = 31;
        months[2] = 28;
        months[3] = 31;
        months[4] = 30;
        months[5] = 31;
        months[6] = 30;
        months[7] = 31;
        months[8] = 31;
        months[9] = 30;
        months[10] = 31;
        months[11] = 30;
        months[12] = 31;

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println();
        /*
         * 2. int[] months = new int[]{31,29,21,30}
         * 
         * new int[] --> size must be left blank if we use initialization
         * {31,29....}--> initializer/initialization list
         */

        /* 3. int[] months ={31,28,31,30} --> using reference assign value to arrays */

        /*
         * 4. int[] months;
         * months = {31,29,31....} --> show an error if we used these method then must
         * used new keyword with it.
         * 
         * int[] months;
         * months[] = new int[]{31,29,31....} --> these method is right
         * 
         */

        /*
         * how to get the size of an array : Java has data member or instant variable
         * such as length. using these we can get the length of array.
         * as a developer u can't assign the value to java
         */

        System.out.println(months.length);

        /*
         * note: in java arrays are not growable. u can't grow the size of array in
         * java.
         * u have to declare a new array
         */
        months = new int[] { 21, 32, 12, 24, 12, 43, 23, 21, 124, 234, 12, 53, 234, 45 };
        System.out.println(months.length);
        System.out.println();

        /*
         * Traversing an array:
         * 
         * 1. using noraml loops: for, while or do-while
         * 2. using for each-loop/enhanced for loop specially for java
         */

        /*
         * using for each rule: automatically assign value to x and then print and
         * increment value. do exactly till the size of array.
         * 
         * it will show error if we convert the double datatype array into integer it
         * will show erroe losse converstion
         */

        for (int x : months) {
            System.out.println(x);
        }

    }
}
