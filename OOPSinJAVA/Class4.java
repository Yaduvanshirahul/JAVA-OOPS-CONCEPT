package OOPSinJAVA;

public class Class4 {

    public static class Student {
        int rollno;
        String name;
        double percentage;
    }

    public static void fun(Student x) {
        System.out.println(x.name);

    }

    public static void main(String[] args) {

        /*
         * we can't call the value of class outside the main function as it scope and
         * limit is only within the main function
         */

        // class Student {
        // int rollno;
        // String name;
        // double percentage;
        // }

        Student s1 = new Student();
        s1.name = "rahul";
        s1.rollno = 2102228;
        s1.percentage = 81.3;

        /*
         * to call the fun function we must declare the class student outside the main
         * class
         */
        fun(s1);
    }
}
