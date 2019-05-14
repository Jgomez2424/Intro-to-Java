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
		
//		
//		Scanner CC = new Scanner(System.in);
//		System.out.println("Area of circle?");
//		double radius = (Math.sqrt(CC.nextDouble()/Math.PI));
//		System.out.println("The Radius of your circle is " + radius + ".");
//		
//		
//	
//		
//		Scanner DD = new Scanner(System.in);
//		System.out.println("Test Grade 1?");
//		double test1 = (DD.nextDouble());
//		System.out.println("Test Grade 2?");
//		double test2 = (DD.nextDouble());
//		System.out.println("Test Grade 3?");
//		double test3 = (DD.nextDouble());
//		System.out.println("Your average is: " + (test1 + test2 + test3) / 3);
//		
//		Scanner ZZ = new Scanner(System.in);
//		System.out.println("Please enter your name.");
//		String name = (ZZ.nextLine());
//		System.out.println("Your name has " + name.length() + " characters, how many do you want to be printed?");
//		int numofchr = (ZZ.nextInt());
//		System.out.println((name.substring(0,numofchr)));
																																					
	/*	Scanner AQ = new Scanner(System.in);
		System.out.println("Enter your A value.");
		double A = (AQ.nextDouble());
		System.out.println("Please enter your B value.");
		double B = (AQ.nextDouble());
		double C = (Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
		System.out.println("The square root of " + A + " squared + " + B + " squared = " + C );
		*/
				
		Scanner EE = new Scanner(System.in);
		System.out.println("This is a quadratic equation solver.");
		System.out.println("Please enter your A value. ");
		double A = (EE.nextDouble());
		System.out.println("Please enter your B value. ");
		double B = (EE.nextDouble());
		System.out.println("Please enter your C value. ");
		double C = (EE.nextDouble());
		double Plus = (((-B + Math.sqrt(Math.pow(B,2) - 4 * A * C))/(2*A)));
		double Minus = (((-B - Math.sqrt(Math.pow(B,2) - 4 * A * C))/(2*A)));
		System.out.println("Plus = " + Plus);
		System.out.println("Minus = " + Minus);
		
		Scanner NN = new Scanner(System.in);
		System.out.println("Please enter your sentence.");
		String a = (NN.nextLine());
		System.out.println("What letter do you want me to find?");
		String b = NN.nextLine();
		int g = (a.indexOf(b));
		System.out.println("Your letter occurs at index " + g);
		
		
																															
		
		
		
		
		
		
		
	}



}																								

