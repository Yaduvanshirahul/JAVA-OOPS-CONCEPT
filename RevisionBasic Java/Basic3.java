/* Function overloading  --> When any program contains multiple functions, whose name is the same, but the parameters are different, they are known as overloaded. We use this technique to increase the readability of the program. */

class Cal {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Basic3 {
    public static void main(String[] args) {
        Cal d = new Cal();
        System.out.println(d.add(23, 02));
        System.out.println(d.add(23, 1, 12));
    }

}
