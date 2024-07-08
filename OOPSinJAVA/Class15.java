package OOPSinJAVA;

public class Class15 {

    private int rno;
    private int rno1 = 10;
    private String name;
    double percentage;

    /* To get value of private data we have to use Getter function */

    public int getter() {
        return rno;
    }

    public int getter1() {
        return rno1;
    }

    public void setter(String str) {

        name = str;
    }

    public String getter3() {
        return name;
    }

    public void setter4(int rno) {

        /*
         * here this keyword is used to define that it refer the attribute of class
         * (rno)
         */
        this.rno = rno;
    }
}
