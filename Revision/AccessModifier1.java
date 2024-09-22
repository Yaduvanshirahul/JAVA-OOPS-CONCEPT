

class C1 {
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int a = 4;

    /* 1 within the class all access modifier can use */
    public void get() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(" ");
    }
}

/* 3 outside package by subclass */

class C2 extends Class4 {
    void method() {
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);
        // System.out.println(d); --> default and private will not access outside the
        // package by subclass
    }
}

public class AccessModifier1 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.get();

        /* 2 witning the same package private doesn't work */
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); --> within the package private can't be access

        /* 4 Accessing the Class4 of folder PACKAGE */
        Class4 c1 = new Class4();
        System.out.println(c1.a);
        // System.out.println(c1.b);
        // System.out.println(c1.c); --> as protected and default value will not access
        // as it outside the package
        System.out.println();

        /* access modifier using base class */
        C2 g = new C2();
        g.method();

    }

}
