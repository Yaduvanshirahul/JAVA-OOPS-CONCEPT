
/* Access Modifier  --> The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.*/

class MyEmployee {

    public int k = 12;
    protected int b = 13;
    int c = 14;
    private int d = 15;

    private int id;
    private String name;

    public void setname(String j) {
        this.name = j;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee m1 = new MyEmployee();
        // m1.id = 34;
        // m1.name = "rahul"; --> throw an error due to private access modifier

        m1.setname("rahul");
        System.out.println(m1.getname());
        m1.setid(34);
        System.out.println(m1.getid());

        MyEmployee m2 = new MyEmployee();
        m2.setname("rehan");
        System.out.println(m2.getname());
        m2.setid(23);
        System.out.println(m2.getid());

    }
}
