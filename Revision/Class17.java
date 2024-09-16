/* Anonymous Inner Class */

class A {
    public void show() {
        System.out.println("in A show");
    }
}

/*
 * class B extend A {
 * public void show(){
 * System.out.println("in new Show");
 * }
 * 
 * --> as these class only going to use only once so we use anonymous inner
 * class in place of it.
 * }
 */

public class Class17 {
    public static void main(String[] args) {
        A ob = new A() {
            public void show() {
                System.out.println("in new Show");
            }
        };
        ob.show();
    }

}
