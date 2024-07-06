package OOPSinJAVA;
/* Changing value of array by calling function */

public class Class6 {
    public static void change(int[] rollno) {
        rollno[1] = 22;
        /* the value of rollno[1] will change as it is pass by reference in java */
    }

    public static void main(String args[]) {
        int[] rollno = { 2, 23, 24, 43 };
        System.out.println("before calling and changing value of array");

        for (int i = 0; i < 4; i++) {
            System.out.print(rollno[i] + " ");
        }

        System.out.println();

        change(rollno);

        System.out.println("after calling function and changing value ");

        for (int i = 0; i < 4; i++) {
            System.out.print(rollno[i] + " ");
        }

    }
}
