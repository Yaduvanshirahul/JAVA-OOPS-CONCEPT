/*1. String: A string is a sequence of 0(empty)  or more characters.
  
  e.g: "Bhopal", "SCA" --> ONLY in double queots.
     'a','b' --> Single queots called character.
 */

 /*2. How java Represent String?
    ans: three ways of represent string in java.
    (i). String class(java 1.0) (ii). String Buffer(java 1.0) (iii). StringBuilder(java 5.0)--> StringBuilder is same as of String buffer but different in perspective of multithreading.
  */

  /*3.  Difference between String and StringBuffer.abstract 
     ans: String objects are ALWAYS 'immutable' while StringBuffer objects are ALWAYS 'mutable'.

     Immutable -> Not changeable means string are not changeable. once a data is stored in string then its data will not change able. 

     String city = "Bhopal";
     System.out.println(city); // Bhopal

     city = "Indore";
     System.out.println(city); //Indore

     also for String s1 = "Bhopal";
             SOP(s1); // Bhopal
             s1=s1+"Rock";
             SOP(s1); // BhopalRock
             
             
     note: the reference will create of city name which indicate the address(5000) of 'Bhopal'. After that java creates new address(6000) for Indore which has different address no. then city referenced to the 'Indore'. The address of 'Bhopal' city is immutable. it will remain in memory.
     
     Mutable -> Changeable
     StringBuffer sb = new StringBuffer("Rock");
     SOP(sb); //Rock

     sb.append("Star");
     SOP(sb); // Rockstar
     note: the java will provide the more memory space to the StringBuffer so new string add up with previous one.
*/

/* 4. How many Constructor in String?
  ans: 13 constructor is available in String.
 */

public class Class1 {

    

    public static void main(String[] args) {
        

    }
}
