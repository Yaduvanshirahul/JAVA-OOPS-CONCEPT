
import java.util.*;

public class Class3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        /* note: you can't take input from inhance loop */
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " no.");
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
