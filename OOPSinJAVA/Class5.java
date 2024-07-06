package OOPSinJAVA;
/* CALL BY VALUE */

public class Class5 {

    public static int change(int x) {
        x = 9;
        return x;

        /* value of x will not change in main function as it is call by value */
    }

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        change(x);

        /* function pass as pass by value */
        System.out.println(x);

    }
}
