package Revision;

/* Encapsulation -->  */

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
