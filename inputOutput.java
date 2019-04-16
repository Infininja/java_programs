import java.io.*;
import java.util.*;

public class inputOutput {
   public static void main(String[] args) {
         throws FileNotFoundException { 
      File weatherD = new File("weather.txt");
      Scanner learner = new Scanner(weatherD);
      double numBer1 = input.nextDouble();
      while (input.hasNextDouble) {
         double numBer2 = input.nextDouble();
         System.out.print(numBer1 + "change to" + numBer2 + " = " + (numBer2 - numBer1));
         numBer2 = numBer1;
      }
   }
}