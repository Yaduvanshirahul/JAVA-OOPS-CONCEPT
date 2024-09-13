package Revision;

class Pen {
    String color;
    String type;

    public void printcolor() {
        System.out.println(this.color); /* this indicate which pen object has call the printcolor */
    }
}

public class Class2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = " red";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "gelpen";

        p1.printcolor();
        p2.printcolor();
    }

}
