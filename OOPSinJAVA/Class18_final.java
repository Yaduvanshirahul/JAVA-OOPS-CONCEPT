package OOPSinJAVA;

public class Class18_final {
    public static void main(String[] args) {
        Class17_i s = new Class17_i();
        s.rno = 12;
        s.name = "rahul";

        /* we can't change the value of data if it declare as final keyword */

        // s.school = "Green land";

        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.school);
    }
}
