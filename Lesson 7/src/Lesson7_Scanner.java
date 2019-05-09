import java.util.Scanner;
public class Lesson7_Scanner {

	public static void main(String[] args) {
		
		
//		Scanner AA; 
//		
//		AA = new Scanner(System.in);
//		int apples, fruits;
//		double weight;
//		System.out.println("How many apples do you have?");
//		apples = AA.nextInt();
//		System.out.println("How many fruits do you have?");
//		fruits = AA.nextInt();
//		System.out.println("Cool I dont care.");
//		System.out.println();
//		
//		
//		
//		Scanner BB = new Scanner(System.in);
//		System.out.println("What is your First name?");
//		String fname = BB.nextLine();
//		System.out.println("What is your last name?");
//		String lname = BB.nextLine();
//		System.out.println("Your full name is " + fname + " " + lname + ".");
//		System.out.println();
//		
		
		
		Scanner CC = new Scanner(System.in);
		System.out.println("Area of circle?");
		double radius = (Math.sqrt(CC.nextDouble()/Math.PI));
		System.out.println("The Radius of your circle is " + radius + ".");
		System.out.println(radius);
		
	
		
		Scanner DD = new Scanner(System.in);
		System.out.println("Test Grade 1?");
		double test1 = (DD.nextDouble());
		System.out.println("Test Grade 2?");
		double test2 = (DD.nextDouble());
		System.out.println("Test Grade 3?");
		double test3 = (DD.nextDouble());
		System.out.println("Your average is: " + (test1 + test2 + test3) / 3);
		
		Scanner  ZZ = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = (ZZ.nextLine());
		System.out.println("Your name has " + name.length() + " characters, how many do you want to be printed?");
		int numofchr = (ZZ.nextInt());
		System.out.println((name.substring(0,numofchr)));
																																					
		
		
		
														
	}



}																								

