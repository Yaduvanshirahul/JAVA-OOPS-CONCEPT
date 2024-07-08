package OOPSinJAVA;

public class Class17_Constructor {

    public static void main(String[] args) {

        // Class17_i s = new Class17_i() --> NOT construct a object as we declare a
        // constructor itself and only construct when we declare a default constructor

        Class17_i s = new Class17_i(2102228, "RAHUL", 81.9);
        System.out.println(s.name);

        Class17_i s1 = new Class17_i(2102250, "Sahil");
        System.out.println(s1.rno);
        System.out.println(s1.name);
    }

}
