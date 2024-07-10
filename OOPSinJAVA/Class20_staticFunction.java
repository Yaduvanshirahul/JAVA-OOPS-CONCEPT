// STATAIC FUNCTION : Used if we want to access a function in the class through just classname.functionname()

package OOPSinJAVA;

public class Class20_staticFunction {
    public static void main(String[] args) {

        System.out.println(Class17_i.numberofstudents); // here we can access static data when it is default

        // System.out.println(Class17_i.numberofstudents1); // we can access the data as
        // it is private

        /*
         * if it is public then we can change value of numberofstudents by
         * Class17_i.numberofstudents1 = 100; to overcome these we use private access
         * modifier
         * where we can only get value not set the value
         */

        Class17_i s = new Class17_i();

        // calling getnumberofstudent1() only by object when it is not static
        System.out.println(s.getnumberofstudent1());

        /*
         * System.out.println(Class17_i.getnumberofstudent1());
         * callling by Class17_i of class name and will not work until it will become
         * static
         */

        System.out.println(Class17_i.getnumberofstudent1());
    }
}
