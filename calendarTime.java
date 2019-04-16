/**

@author Bilaal Axmed
@version 0.1
The libraries I have imported are java utilities for the Scanner object.
This program takes in two user inputs for a month and a year in format YYYY.
I then made a new method that prints and returns the months in that year
The while loop checks and validates user input.
The if statements check the various conditions the user might bring and give a day count based on that.
To find the days of a leap year, the only month that happens is February.
It then prints and returns the values to be called in the main using parameters given by user.


*/

import java.util.*;

public class calendarTime {
   public static void main(String[] args) {
      Scanner dayMan = new Scanner(System.in);
      System.out.print("Input a month number as between 1 and 12");
      int month = dayMan.nextInt();
      System.out.print("In the YYYY format, enter a year after 1700");
      int year = dayMan.nextInt();
      daysInMonth(month, year);
      
    }
    public static int daysInMonth(int dMonth, int dYear) {
      int yourDay = 0;
      while (dMonth < 1 || dMonth > 12 || dYear < 1700) {
            Scanner dayMan = new Scanner(System.in);
            System.out.print("Put in a correct month ");
            dMonth = dayMan.nextInt();
            System.out.print("And a correct year");
            dYear = dayMan.nextInt();
            if (dMonth >= 1 && dMonth <= 12 && dYear >= 1700)
               break;
         }
       if(dMonth == 1 || dMonth == 3 || dMonth == 5 || dMonth == 7 || dMonth == 8 || dMonth == 10 || dMonth == 12) {
            yourDay = 31;
         }
         else if (dMonth == 4 || dMonth == 6 || dMonth == 9 || dMonth == 11) {
            yourDay = 30;
         }
       if (dYear % 400 == 0 && dMonth == 2){
            yourDay = 29;
         }
          else if(dMonth == 2) {
            yourDay = 28;
         }
      System.out.print("The amount of days in month " + dMonth + " in the year "+ dYear + " is " + yourDay);
      return yourDay;
   }
}
       