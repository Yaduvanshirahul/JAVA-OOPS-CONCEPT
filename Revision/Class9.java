package Revision;

/* Encapsulation --> Encapsulation in Java is a mechanism of wrapping the data(variables) and the code acting on the data (methods) together as a single unit.
 * in encapsulation the variable of a class will be hidden from other classes and can be accessed only through the methods of their current class. Therefore it is also known as data hidding.
 */

class Human1 {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    // public void setAge() {
    // age = 20;
    // } --> these will not work we have to assign the value by using parameter and
    // calling setAge function

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Class9 {
    public static void main(String[] args) {
        Human1 h = new Human1();
        System.out.println(h.getAge());
        h.setAge(23);
        System.out.println(h.getAge());
        h.setName("rahul");
        System.out.println(h.getName());
    }
}
