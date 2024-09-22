
/* Abstraction -->  Abstraction in Java is a technique that allows developers to hide implementation details and only show the functionality to the user. This helps simplify complex systems and allows programmers to focus on the functionality of an object instead of its implementation.
 * 
 *1. Abstract method only belong to abstract class.
  2. the class which extend the property of abstract class must be redefined the abstract method in it.
  3. You can't create the object of abstract class.
  4. It shouldn't necessary to have a abstract method in abstract class.
  5. If a baseclass has not the declare abstract method then it should be declare as absract class and one new base class is created without abstract class.
  6. Abstract method has only declaration with semicolon at end not the declaration.
 */

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Music in car");
    }
}

abstract class Wagonar extends Car {
    public void drive() {
        System.out.println("Car run mannually");
    }
}

class AdvncWagnor extends Wagonar // Concrete class
{

    public void fly() {
        System.out.println("car can fly");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        AdvncWagnor ob = new AdvncWagnor();
        ob.playMusic();
        ob.drive();
        ob.fly();
    }
}
