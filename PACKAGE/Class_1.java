/* Package: Package is collection of classes and sub-classes  */


package PACKAGE;

public class Class_1 {
    public static void main(String[] args) {
        Multilevelinheritance s = new Multilevelinheritance();
        System.out.println("Learn outside packagae in thesse code");

        /*
         * The Class13 elemenets only can access if it is public becz Class 13 is an
         * outside class package
         */
        s.rno = 12;
        s.name = "Rahul";

        System.out.println(s.rno);
        System.out.println(s.name);
    }
}
