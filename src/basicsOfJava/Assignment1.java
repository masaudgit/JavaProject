package basicsOfJava;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number");
		a=x.nextInt();
		System.out.println("Enter the second number");
		b=x.nextInt();
		if(a>b)
		{
			System.out.println("a value is greater than b");
		}
		else
		{
			System.out.println("b vlaue is greather than a");
		}

	}

}
