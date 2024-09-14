/* Ternary Operator --> In Java, the ternary operator is a type of Java conditional operator. In this section, we will discuss the ternary operator in Java with proper examples.

The meaning of ternary is composed of three parts. The ternary operator (? :) consists of three operands. It is used to evaluate Boolean expressions. The operator decides which value will be assigned to the variable. It is the only conditional operator that accepts three operands. It can be used instead of the if-else statement. It makes the code much more easy, readable, and shorter.
*/

public class Class5 {

    public static void main(String[] args) {
        int n = 4;

        int result = 0;

        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
