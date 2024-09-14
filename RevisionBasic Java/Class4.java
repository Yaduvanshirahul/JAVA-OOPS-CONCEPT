/* Function Overriden -->  If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding. 

Usage of Java Method Overriding:

Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism
*/
class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }

}

public class Class4 {
    public static void main(String args[]) {
        Vehicle obj = new Bike2();// creating object
        obj.run();// calling method
        Vehicle ob = new Vehicle();
        ob.run();
    }
}

/*
 * NOTE: Operator overloading --> 263
 * 
 * No, Java doesn't support user-defined operator overloading. The only aspect
 * of Java which comes close to "custom" operator overloading is the handling of
 * + for strings, which either results in compile-time concatenation of
 * constants or execution-time concatenation using StringBuilder/StringBuffer.
 * You can't define your own operators which act in the same way though.
 * 
 * Java doesnt Support Operator Overloading Except for one case i.e + operator
 * it can be used to add number as well as strings.
 * 
 * Java does not support operator overloading. This decision was made to
 * simplify the language and avoid complex, unreadable code that operator
 * overloading can sometimes lead to. Java developers rely on methods to achieve
 * similar functionality.
 */