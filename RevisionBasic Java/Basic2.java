/* Friend Function --> Java does not have the friend keyword like c++, which is used to access the non-public members of a class. Nevertheless, we can achieve this functionality.
 * 
 * A friend function is not the member function of the class but has full access to the private data members of the class.
 * 
 * Friend function is function that is declared as a friend of a class not as a member of a class instead of that it can access private &  protected member of a class.
 * 
 * syntax: friend return_type fun_name(class &ref)
 * 
 * a friend can be declared anywhere in the class declaration and it cannot be affected by access control keyword like private, public or protected.
 */

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("Friend Function");
    }
}
