package OOPSinJAVA;

public class Class3 {

    static class Student {
        int rno;
        String name;
        float marks;

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        Student() {
            this.rno = 14;
            this.name = "Shyam";
            this.marks = 34.4f;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        /*
         * Student kunal = new Student(32, "Rahul", 45);
         * 
         * System.out.println(kunal.rno);
         * System.out.println(kunal.name);
         * System.out.println(kunal.marks);
         * 
         */

        Student rahul = new Student();

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

    }
}
