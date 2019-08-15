//Joana Dalusong//

import java.util.Scanner;
 
public class Activity {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    	
    	String name;
    	String course;
    	String section;
    	String address;
    	String cn;
    	
    	
    	System.out.println("What is your name");
    	name = scan.nextLine ();
    	
    	System.out.println("\nYour Name is " + name);
    	
    	System.out.println("\nWhat is your course");
    	course = scan.nextLine ();
    	
    	System.out.println("\nYour Course is " + course);
    	
    	System.out.println("\nWhat is your section");
    	section = scan.nextLine ();
    	
    	System.out.println("\nYour Section is " + section);
    	
    	System.out.println("\nWhat is your Address");
    	address = scan.nextLine ();
    	
    	System.out.println("\nYour Address is " + address);
    	
    	System.out.println("\nWhat is your Cn");
    	cn = scan.nextLine ();
    	
    	System.out.println("Your Cn is " + cn);
    }
}
