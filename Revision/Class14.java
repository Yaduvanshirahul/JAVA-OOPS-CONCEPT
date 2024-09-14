package Revision;

/* Multiple Inheritance --> Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class. The problem occurs when there exist methods with the same signature in both the superclasses and subclass. On calling the method, the compiler cannot determine which class method to be called and even on calling which class method gets the priority. 
 * 
 *            GrandParent
           /             \
          /                \
method1()Parent1      Parent2 method1()
          \                /
           \             /
            \          /
                 Test
*/

/* interface doesn't have implements part. it has only declare parat 
 * All field  in interface are public, static, and final by default.
 * all method are public and abstract by default.
 * a class that implements an interface must implements all the methods declared in the interface.
 * interface support the functionality of multiple inheritance.
*/

interface Animal {
     int eyes = 2;

     void walk();
}

interface Herbivore {
     void eat();
}

class Horse implements Animal, Herbivore {
     public void walk() {
          System.out.println("walks on 4 legs");
     }

     public void eat() {
          System.out.println("Horse eat veg");
     }

}

public class Class14 {
     public static void main(String[] args) {
          Horse h = new Horse();
          h.walk();
          h.eat();
          System.out.println(h.eyes);
     }
}
