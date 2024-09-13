package Revision;

class Pen {
    String color;
    String type;

    void write() {
        System.out.println(" pen has smooth writing ");
    }
}

public class Class1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Black";
        p1.type = "gel";
        p1.write();
        System.out.println(p1.color);
    }
}
