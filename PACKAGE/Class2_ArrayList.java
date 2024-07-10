/* ARRAYLIST : Dynamic Array when the size is full then it double the size itself and remove the old arraylist and copy the value to new ArrayList  
               add() is used to add data and get() function is used to get the value*/
package PACKAGE;

import java.util.ArrayList;

public class Class2_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(4);// We can initialize ArrayList without giving size
        arr.add(12); // add() function is used to enter data into ArrayList
        arr.add(23);
        arr.add(22);
        arr.add(11);
        arr.add(44); // as ArrayList size is initial 4 but we can increase the size in ArrayList
        System.out.println(arr.size());
        System.out.println(arr.get(3)); // to get the value at index 3
        System.out.println(arr); // to print the value of ArrayList
    }
}
