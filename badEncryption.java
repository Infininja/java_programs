import java.util.*;
import java.io.*;
public class badEncryption {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner learner = new Scanner(System.in);
      int exitV = 1;
      System.out.print("Welcome, press 1 to continue or 0 to exit  ");
      if (learner.nextInt() == 0) {
         System.exit(0);
      }
      else {
         File password = new File ("password.txt");
         PrintStream writer = new PrintStream(password);
         System.out.print("What is your username?  ");
         String username = learner.next();
         System.out.print("What is your password?  ");
         String pass = ("!" + learner.next() + "!");
         System.out.print("Your new password is " + pass);
         writer.print(pass);
      }
   }
}