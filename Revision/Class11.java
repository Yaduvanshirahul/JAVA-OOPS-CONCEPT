package Revision;

/* Run time polymorphism  --> It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding */

class Calc {
    public int sum(int a, int b) {
        return a + b;
    }
}

class AdvnCalc extends Calc {
    public int sum(int a, int b) /* these sum method overriding the parent class sum method */
    {

        return a + b + 2;
    }
}

public class Class11 {
    public static void main(String[] args) {
        AdvnCalc obj = new AdvnCalc();
        int i = obj.sum(23, 1); /*
                                 * first it find the method of its own class then it will go to parent class
                                 * method
                                 */
        System.out.println(i);
        Calc obj1 = new Calc();
        int j = obj1.sum(12, 11);
        System.out.println(j);/* it will go to parent class method as we create the object of parent class */
    }
}
 
/* If we declare any operator with more than one functionality then it is called Operator overloading.

 * in java operator overloading in not supported.Because 
 * Java doesn't allow user defined operator overloading because if you allow programmer to do operator overloading they will come up with multiple meanings for same operator which will make the learning curve of any developer hard and things more confusing and messing.

 * operator is a rarely used features in java application development.
 * it is a bit confusion oriented feature when we define more number of operation for more number of operators.
 * 
 * java has a feature of concatenation for join the two string but we can perform some extra function.
 */