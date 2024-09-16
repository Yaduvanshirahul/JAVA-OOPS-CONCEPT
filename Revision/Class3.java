
public class Class3 {
    public static void main(String[] args) {
        Student s1 = new Student(); /*
                                     * when new is written a address is given to object in the memory as a storage.
                                     * The Java new keyword is used to create an instance of the class
                                     */
        s1.name = "rahul";
        s1.age = 22;
        s1.printinfo();
        Student s2 = new Student();
        s2.name = "taniya";
        s2.age = 21;
        s2.printinfo();
    }
}

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}