/**

@author Bilaal
@version 0.9

This program takes in a number from the main method. It is called into the showTwos
function, where the number is continuously divided by two to find its factors.
If the number is not divisible by 2, which means its odd, it won't divide and just
print that number. For example showTwos(7) = 7. If desired, a scanner with user input
can replace the pre-written parameter in the main. Thank you for reading.

*/

public class findTwos { // create new class findTwos; begin scope
   public static void main(String[] args) { // main method; begin scope
   showTwos(); // call method showTwos, parameter is number
   } // main method; end scope
   public static void showTwos(int num) { // showTwos method; begin scope; takes in num parameter
		System.out.print(num + " = ");// sets up output, prints num and then equals for later
		while (num % 2 == 0) {// while; begin scope; variable num is a even number, runs until evaluation is false
			System.out.print("2 * "); // print 2* for every time its a even number till we reach an odd one.
			num = num / 2; // divide number by 2 each time to get an odd last.
		}// while loop; end scope
	   System.out.println(num);// at the end print the number to see all factors
   }// showTwos method; end scope
} // class findTwos; end scope