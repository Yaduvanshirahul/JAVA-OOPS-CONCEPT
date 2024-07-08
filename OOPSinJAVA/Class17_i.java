package OOPSinJAVA;

public class Class17_i {
    int rno;
    String name;
    double percentage;
    final String school = "multipurpose";

    /*
     * Default constructor construct itself if we don't declare a constructor or if
     * we declare a constructor then default constructor is removed so must create a
     * default constructor to get value of data with passing value to constructor
     */

    public Class17_i() {

    }

    public Class17_i(int roll, String naam, double per) {
        rno = roll;
        name = naam;
        percentage = per;
    }

    public Class17_i(int roll, String naam) {
        rno = roll;
        name = naam;
    }
}
