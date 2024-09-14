package Revision;
/* Inheritance --> Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.*/

class Cal {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCal extends Cal {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Class12 {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sub(231, 12));
        System.out.println(c.sum(23, 111));

        AdvCal d = new AdvCal();
        System.out.println(d.sub(22, 11));
        System.out.println(d.sum(1, 12));
        System.out.println(d.mul(1, 4));
    }
}


/* NOTE: The final Keyword:
If you don't want other classes to inherit from a class, use the final keyword: */