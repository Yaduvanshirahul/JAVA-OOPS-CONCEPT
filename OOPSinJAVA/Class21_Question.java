//  QUESTION : Create a Class of Fraction 

public class Class21_Question {

    public static class Fraction {
        int num;
        int den1;

        public Fraction(int num, int den1) {
            this.num = num;
            this.den1 = den1;
        }

        public void simplify() {

        }
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(7, 21);
        System.out.println(f.num + "/" + f.den1);
        Fraction f1 = new Fraction(7, 3);
        System.out.println(f1.num + "/" + f1.den1);

    }
}
