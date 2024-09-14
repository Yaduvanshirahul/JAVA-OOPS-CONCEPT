package Revision;
/* Polymorphism --> polymorphism mean many behaviour. It means the behaviour of  object changes base on how you create the instance. 

In simple words, we can define Java Polymorphism as the ability of a message to be displayed in more than one form.

 * two types:complie time(early bindign) and run time(late binding). if the behaviour defines at compile time then it is define as complile time polymorphism and if behaviour defines at run time then it called as run time polymorphism.
*/

/* Compile time Polymorphism  --> It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. */


class Add {
    private int a;
    private int b;

    public void sum(int j, int k) {
        a = j + k;
    }

    public int getSum() {
        return a;
    }

    public void sum(int j, int k, int l) {
        b = j + k + l;
    }

    public int getSum1() {
        return b;
    }

}

public class Class10 {
    public static void main(String[] args) {
        Add c = new Add();
        c.sum(12, 11);
        System.out.println(c.getSum());
        c.sum(11, 12, 13);
        System.out.println(c.getSum1());
    }
}
