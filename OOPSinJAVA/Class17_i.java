package OOPSinJAVA;

public class Class17_i {
    int rno;
    String name;
    double percentage;
    final String school = "multipurpose";
    /* the above datatype is blueprint and is initialize when object is created */

    /*
     * int numberofstudents;
     * 
     * Default constructor construct itself if we don't declare a constructor or if
     * we declare a constructor then default constructor is removed so must create a
     * default constructor to get value of data with passing value to constructor
     */

    // numberofstudents is used for the static example
    static int numberofstudents;

    // numberofstudents is used for the static function example
    private static int numberofstudents1;

    /* if we don't declare function as static then */
    public static int getnumberofstudent1() {
        return numberofstudents1;
    }

    /*
     * public static void setnumberofstudent1(int value){
     * numberofstudent1 = vallue; // here we can set the value of privatae static
     * data
     * }
     */

    public Class17_i() {

    }

    public Class17_i(int roll, String naam, double per) {
        rno = roll;
        name = naam;
        percentage = per;

        // numberofstudents is used for the static example
        numberofstudents++;

        // numberofstudents is used for the static example
        numberofstudents1++;
    }

    public Class17_i(int roll, String naam) {
        rno = roll;
        name = naam;

        // numberofstudents is used for the static example
        numberofstudents++;

        // numberofstudent1 is used for static function
        numberofstudents1++;
    }
}
