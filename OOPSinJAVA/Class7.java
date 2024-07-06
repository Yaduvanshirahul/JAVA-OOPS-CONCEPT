package OOPSinJAVA;

/* CHANGING VALUE OF CLASS BY CALLING FUNCTION */
public class Class7 {

    String name;
    double percentage;
    }

    public static void change(Student s) {
        s.name = "Ram";
    }

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollno = 2102228;
        s1.percentage = 81.4;

        System.out.println(s1.name);

        change(s1);

        /* Classess are passed by reference */

        System.out.println(s1.name);

    }
}
