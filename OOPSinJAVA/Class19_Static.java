package OOPSinJAVA;

public class Class19_Static {
    public static void main(String[] args) {
        Class17_i s = new Class17_i();
        System.out.println(s.numberofstudents); // here numberofstudents value 0 before creation of object

        Class17_i s1 = new Class17_i(12, "rahul", 12.22);
        System.out.println(s1.numberofstudents); // here value increase by 1 when the
        // object once created

        Class17_i s2 = new Class17_i(2102228, "ram");
        System.out.println(s2.numberofstudents); // here the value is same as 1 the
        // above value refer

        /* these refer the value of s2 class */
        System.out.println(s.numberofstudents);
        System.out.println(s1.numberofstudents);
        System.out.println(s2.numberofstudents);

        /*
         * so we have to make numberofstudents class dependent not the object dependent
         * so we use STATIC to create a block for this
         */
    }
}
