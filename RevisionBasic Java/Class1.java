/* Inline function --> if a function is inline, the compiler places a copy of code of that function at each point where the function is called at compile time.

  any change to an inline function could require all clients of the function to be recompiled because compiler would need to replace all code once again otherwise it will continue with old functionality.

    Java doesn't provide inline functions it is typically done by the JVM at execution  time.
 */

/* Virtual function --> A virtual function is a member function of a class and its functionality can be overridden in its derived class. This fnction can be implemented by using a keyowrd called virtual and it can be given during functionn declaration.

When the programmers switch the technology from C++ to Java, they think about where is the virtual function in Java. In C++, the virtual function is defined using the virtual keyword, but in Java, it is achieved using different techniques.

By default, all the instance methods in Java are considered as the Virtual function except final, static, and private methods as these methods can be used to achieve polymorphism.

1. abstract method is also a virtaul method.
2. instance method(non-static method) is also virtual method.
3. static method is not a virtual method.
4. A virtual function or method also cannot be final, as the final methods also cannot be overridden.
5. The Virtual function cannot be private, as the private functions cannot be overridden.
6. The virtual functions can be used to achieve oops concepts like runtime polymorphism.

*/

class Parent {
  void v1() // Declaring function
  {
    System.out.println("Inside the Parent Class");
  }
}

class Child extends Parent {
  void v1() // Overriding function from the Parent class
  {
    System.out.println("Inside the Child Class");
  }
}

public class Class1 {
  public static void main(String args[]) {
    Parent ob1 = new Child(); // Refering the child class object using the parent class
    ob1.v1();
  }
}
