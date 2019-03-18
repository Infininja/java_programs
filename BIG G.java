public class BilaalAxmed_Exam1 {
   
/*
Name: Bilaal C Axmed
Java Exam #1
Your job:

1. Put your name (legal Name and preffered name at the top. 
There are points for writing comments, so if you dont comment your code 
I will take points off. 

****Comment heavily.****

2. Solve all the questions, and write the answers to questions in the space

3. Save the file with following name YourName_Exam1.java (Please follow strictly)

4. Upload the file to Canvas exam.

*/

//======================================================================================

/* Q1 3 Points
What series of println statements would produce the following output?
  "Several slashes are sometimes seen,"
   said Sally. "I've said so." See?
   \ / \\ // \\\ ///
*/   
  public static void slashMan() {
   System.out.println("\"Several slashes are sometimes seen,\"");
   System.out.println("said Sally. \"I've said so.\" See?");
}

//======================================================================================

/* Q2 2 Points

Name the four errors in the following program:

public class SecretMessage {
   public static main(string[] args) {<---- 1. the word "string" is not capitalized, 2. There is no "void"
   System.out.println("Speak friend");
   System.out.println("and enter); <----- 3. does not have a closing quotation
}
} <-- 4. need to add a second closing bracket
//======================================================================================

/* Q3 5 Points
In physics, a common useful equation for finding the position s of a body in linear motion 
at a given time t, based on its initial position s0, initial velocity v0, and rate of 
acceleration a, is the following:

s=s0 +(v0)t+(1/2)at^2

Write code to declare variables for s0, v0, a, and t, and then write the code to compute s 
on the basis of these values.

*/
   public static void linearMotion() {
      int a = 1;
      int sZero = 2;
      int vZero = 3;
      int t = 4;
      double s = (sZero) + (vZero * t) + (0.5 * a * (t*t));
   }
//======================================================================================


/* Q4 5 Points
Write "nested for loops" that produce the following output:
   000111222333444555666777888999
   000111222333444555666777888999
   000111222333444555666777888999
   
*/

/* Q5 10 Points

Modify the code of Q3 to solve the same equation but with following way
 
1. Take user input for variables for s0, v0, a, and t, in main()
2. and then call static method findSvalue from main() to compute s
3. Return s and display final answer of s from main().  

*/
import java.util.*;

public class wowMan {
     public static void main(String[] args) {
         Scanner typeMan = new Scanner(System.in);
         System.out.print("Type in s0");
         int sZero = typeMan.nextInt();
         System.out.print("Type in v0");
         int vZero = typeMan.nextInt();
         System.out.print("Type in a");
         int a = typeMan.nextInt();
         System.out.print("Type in t");
         int t = typeMan.nextInt();
         System.out.print(double s);
         
      }
      public static void findSValue(int sZero, int vZero, int a, int t) {
            double s = (sZero) + (vZero * t) + (0.5 * a * (t*t));
            return s.double;
   }
}