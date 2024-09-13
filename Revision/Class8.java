package Revision;
/* Copy Constructor -> in java it is a special type of method, which is having same name as of class having parameters reference type/non primitive. it is used to construct an object by copying another class object.*/

class Test {
    int id;
    String name;

    Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Test(Test t) {
        this.id = t.id;
        this.name = t.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Class8 {
    public static void main(String[] args) {
        Test t = new Test(12, "rahul");
        Test t1 = new Test(t);
        t.display();
        t1.display();
        t1.id = 13;
        t1.name = "ram";
        t1.display();
    }
}


/* Destructor -> in c++ destructor is used to deallocate the memory which is allocate by object  which is dynamically assign. But in java there is not any such kind of destructor. In java there is garabage collector which automatically deallocate the memory while memory usage is over.*/