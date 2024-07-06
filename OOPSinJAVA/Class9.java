package OOPSinJAVA;

public class Class9 {
    public static class Access {
        int rno;
        private String name;
        double percentage;
    }

    public static void main(String[] args) {
        Access a = new Access();
        a.rno = 2102228;
        a.percentage = 81.3;

        /* a.name can't be accessed outside the class as it is private */

        System.out.println(a.rno);
    }
}
