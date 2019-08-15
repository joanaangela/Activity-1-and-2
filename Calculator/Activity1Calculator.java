//Joana Dalusong//

import java.util.Scanner;

public class Activity1Calculator {

	
public static void main (String[]args) {
	Scanner Scan = new Scanner (System.in);
	
	int fn;
	int ln;
	
System.out.print("First Number: ");
fn = Scan.nextInt();
System.out.print("Last Number: ");
ln = Scan.nextInt();
	
	int sum;
	int diff;
	int prod;
	int quo;
		
	sum = fn + ln;
	diff = fn - ln;
	prod = fn * ln;
	quo = fn / ln;
	
System.out.println ("\nSum of "+fn+" and "+ln+" is " + sum);
System.out.println ("Difference of "+fn+" and "+ln+" is " + diff);
System.out.println ("Prodoct of "+fn+" and "+ln+" is " + prod);
System.out.println ("Quotient of "+fn+" and "+ln+" is " + quo);
	
	}
}