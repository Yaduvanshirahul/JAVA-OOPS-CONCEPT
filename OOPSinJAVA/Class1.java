package OOPSinJAVA;

public class Class1 {

    /* Creating the user defined data types which is known as class */

    public static class Student {
        String name;
        int rollno;
        double percentage;
    }

    public static void main(String[] args) {

        System.out.println("HELLO RAHUL! WELCOME TO JAVA OOPS CONCEPT CLASSES");

        /* creating object (x) of class (Student) */

        Student x = new Student(); // declaration

        x.name = "Rahul kumar yadav";
        x.percentage = 81.3;
        x.rollno = 2102228;
        System.out.println(x.name);
    }
}