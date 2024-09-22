/* Inline Class -->  

1. If we want to call the object of Class B then we need the object of the Class A
2. we can make a inline class as static class and then we don't need to create the object of inline class.*/

class A {
    int a = 10;

    public void show() {
        System.out.println(" display A");
    }

    class B {
        public void config() {
            System.out.println("Inline class");
        }
    }
}

public class InlineClass {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.a);
        ob.show();

        /* B ob1 = new B() --> we can't declare like this */

        A.B ob1 = ob.new B();
        ob1.config();

        /*
         * A.B ob1 = new A.B() --> we don't need object
         * ob1.config() --> when we make inline class as static class.we can't make
         * baseclass static
         */
    }
}

/*
 * A ob = new B()
 * A -> reference of A, B() -> object of class B is created
 */