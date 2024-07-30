package basicsOfJava;

import java.util.Scanner;

public class Choice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int ch,a,b,c;
		System.out.println("Enter any number");
		a=x.nextInt();
		System.out.println("Enter any number");
		b=x.nextInt();
		System.out.println("Enter any number");
		c=x.nextInt();
		System.out.println("1.Add 2.Sub 3.Mul Enter your choice...");
		ch=x.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition="+(a+b+c));
			break;
			
		case 2:
			System.out.println("Subtraction="+(a-b-c));
			break;
			
		case 3:
			System.out.println("Multiplication="+(a*b*c));
			break;
			
		default:
			System.out.println("Invalid choice...");

		}
	}

}
