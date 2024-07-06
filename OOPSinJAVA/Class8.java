package OOPSinJAVA;
/* DEFAULT VALUE IN CLASS IF NOT ASSIGN ANY VALUE  */

public class Class8 {

    public static class Student {
        int rollno;
        String name;
        double percentage;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.percentage);
    }
}
