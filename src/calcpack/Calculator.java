package calcpack;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		int exit = 0;
		Scanner s = new Scanner(System.in);
		
		while(exit == 0) {
			
			System.out.println("Hello, what operation would you like to do?");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Exit");
			
			int choice = s.nextInt();
		
			switch(choice) {
				case 1:
					System.out.println("What is the first number to add?");
					float a = s.nextFloat();
					System.out.println("What is the second number to add?");
					float b = s.nextFloat();
					System.out.println("The result is " + (a + b));
					break;
				case 2:
					System.out.println("What is the first number for subtraction?");
					float c = s.nextFloat();
					System.out.println("What is the number you are subtracting from the first number?");
					float d = s.nextFloat();
					System.out.println("The result is " + (c - d));
					break;
				case 3:
					System.out.println("What is the first number to multiply?");
					float e = s.nextFloat();
					System.out.println("What is the second number to multiply");
					float f = s.nextFloat();
					System.out.println("The result is " + (e * f));
					break;
				case 4:
					System.out.println("What is the number you are dividing?");
					float g = s.nextFloat();
					System.out.println("What the number you are dividing by?");
					float h = s.nextFloat();
					System.out.println("The result is " + (g / h));
					break;
				case 5:
					exit = 1;
					break;
				default:
					System.out.println("You didn't choose a menu option, please try again");
					break;
			}
		}
		s.close();
	}

}
