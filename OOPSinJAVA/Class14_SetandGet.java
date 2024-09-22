package OOPSinJAVA;

public class Class14_SetandGet {
    public static void main(String[] args) {
        Abstraction s = new Abstraction();

        /*
         * Can't access the s.rno as it is private in Class15 so we use getter function
         */
        // s.rno;

        /* Here we set the value of name by passing value "Rahul" to setter function */
        s.setter("Rahul");

        System.out.println(s.getter());
        System.out.println(s.getter1());
        System.out.println(s.getter3());

    }
}
