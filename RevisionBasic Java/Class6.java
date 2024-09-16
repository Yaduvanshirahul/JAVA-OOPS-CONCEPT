/* Final Keyword --> final keyword can be used with variable, method and class,
 * in c++ we used const keyword.
 * 
 * 1. when we declare a class final then we can't inherit it.
 * 2. when we declare a variable as final then its value can't change.
 * 3. when we make base class method as final then it can override in derive class.
 *  
 */

class Cal {
    public final void show() {
        System.out.println(" rahul");
    }

    public void add(int a, int b) {
        System.out.println(a + " " + b);
    }
}

class AdvnCal extends Cal {
    /*
     * public void show(){
     * System.out.println("yadav");
     * 
     * here we can't override the show function as base class show method is declare
     * final
     */
}

public class Class6 {
    public static void main(String[] args) {
        final int num = 8;// we can change the value of final variable
        // num = 10; --> here we can't change the num value
        System.out.println(num); /*
                                  * The final local variable num cannot be assigned. It must be blank and not
                                  * using a compound assignment
                                  */

        Cal c = new Cal();
        c.show();

    }
}
