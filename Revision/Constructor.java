
/* Constructor -> it is a special method which has the same name as of the class name. A constructor doesn't have any return value. Every time you create a object it call the constructor. */

class Human {
    private int age;
    private String name;

    public Human() // Default Constructor -> no need to create it will automatically while an
                   // object is created
    {
        // System.out.println("in constructor");
        age = 12;
        name = "rahul";
    }

    public Human(String name) {
        this.name = name;
        this.age = 14;/* we can assign the value of age without passing the value */
    }

    public Human(String name, int age) // Parameterized Constructor
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human("ram", 12);
        Human h2 = new Human("vijeta");
        System.out.println(h.getAge() + " " + h.getName());
        System.out.println(h1.getAge() + " " + h1.getName());
        System.out.println(h2.getName() + " " + h2.getAge());
    }
}
