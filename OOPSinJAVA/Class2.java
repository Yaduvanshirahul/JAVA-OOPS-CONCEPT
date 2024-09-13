package OOPSinJAVA;
//import java.util.Arrays;

public class Class2 {

    static class Student {

        /*
         * If Student is a non-static inner class, you must first create an instance of
         * the outer class Class2 before you can create an instance of Student
         */

       public int rno;
        String name;
        float marks = 34;
    }

    public static void main(String[] args) {

        /*
         * 
         * Class2 outerInstance = new Class2();
         * --> if inner class is not static then create the instance of outer class
         * 
         * Student[] students = new Student[5];
         * 
         * System.out.println(Arrays.toString(students));
         * 
         * --> when no value has initialize its value is null for array of students
         * 
         */

        Student[] students = new Student[5];

        Student rahul = new Student();
        /*
         * System.out.println(rahul.rno);
         * System.out.println(rahul.marks);
         * System.out.println(rahul.name);
         * 
         * --> gives default value for all the variable as no value has assign
         */

        rahul.rno = 23;
        rahul.name = "shyam";
        // rahul.marks = 45.5f;
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
    }

}
