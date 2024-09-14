package Revision;
/* Multilevel Inheritance --> When a baseclass inherit the property of subclass then another class inherit the property of base class also   */

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

    public int sub(int a, int b) {
        return a / b;
    }
}

class VeryAdvCal extends AdvCal {
    public double pow(int a, int b) {
        return Math.pow(a, b);
    }
}

public class Class13 {
    public static void main(String[] args) {
        AdvCal ob = new AdvCal();/* If we create the obj for AdvCal then pow function will not work */
        VeryAdvCal obj = new VeryAdvCal();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.mul(2, 4));
        System.out.println(obj.pow(2, 2));
    }
}
