//  QUESTION : Create a Class of Fraction 
package OOPSinJAVA;

public class Class21_Question {

    public static class Fraction {
        int num;
        int num1;

        public Fraction(int num, int num1) {
            this.num = num;
            this.num1 = num1;
        }

        public int Fraction1() {

            int num2 = (num * num1 + num * num1);
            return num2;
        }

    }

    public static void main(String[] args) {
        Class21_Question f1 = new Class21_Question();
        System.out.println(f1.Fraction1());

    }
}
