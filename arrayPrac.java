import java.util.*;
public class arrayPrac {
   public static void main(String[] args) {
      int[] array1 = {6, 8, 2, 3, 5, 12, 16, 1, 7, 4, 21, 19};
      int answer = kthLargest(0,array1);
      System.out.println(answer);
      answer = kthLargest(1,array1);
      System.out.println(answer);
      answer = kthLargest(2,array1);
      System.out.println(answer);
      answer = kthLargest(10,array1);
      System.out.println(answer);
      answer = kthLargest(11,array1);
      System.out.println(answer);
      answer = kthLargest(-1,array1);
      System.out.println(answer); 
      answer = kthLargest(20,array1);
      System.out.println(answer);
   }
   public static int kthLargest(int numCheck, int[] array1) {
      
   }
}