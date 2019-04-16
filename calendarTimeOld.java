import java.util.*;

public class calendarTimeOld {
   public static void main(String[] args) {
      Scanner dayMan = new Scanner(System.in);
      System.out.print("Input a month number as DD between 1 and 12");
      int month = dayMan.nextInt();
      System.out.print("Input a year as YYYY after 1700");
      int year = dayMan.nextInt();
      daysInMonth(month, year);
    }
    public static int daysInMonth(int dMonth, dYear) {
      if (dMonth < 1 || dMonth > 12) {
         System.out.print("Please input a correct month");
         int dMonth = dayMan.nextInt();
       else if (dMonth = 1)
         yourDay = 31;
       else if (dMonth = 3)
         yourDay = 31;
       else if (dMonth = 4)
         yourDay = 30;
       else if (dMonth = 5)
         yourDay = 31;
       else if (dMonth = 6)
         yourDay = 30;
       else if (dMonth = 7)
         yourDay = 31;
       else if (dMonth = 8)
         yourDay = 31;
       else if (dMonth = 9)
         yourDay = 30;
       else if (dMonth = 10)
         yourDay = 31;
       else if (dMonth = 11)
         yourDay = 30;
       else if (dMonth = 12) 
         yourDay = 31;
       