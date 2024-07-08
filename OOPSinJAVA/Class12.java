package OOPSinJAVA;

public class Class12 {
    public static void main(String[] args) {

        Class13 s = new Class13();

        /*
         * In the same package the default value can access but outside package we have
         * to make it public to access
         */
        s.rno = 12;
        System.out.println(s.rno);
    }
}
