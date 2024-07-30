package basicsOfJava;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a=10;
		int b=20;
		int c=5;
		System.out.println("Enter the First Number");
		a=x.nextInt();
		System.out.println("Enter the Second Number");
		b=x.nextInt();
		System.out.println("Enter the Third Number");
		c=x.nextInt();
		if (a>b && a>c)
		{
			System.out.println("a is the biggest number");
		}
		else if(b>c)
		{
			System.out.println("b is the biggest number");
		}
		else if(a==b && b==c)
		{
			System.out.println("All are equal..");
		}
		else
		{
			System.out.println("c is the biggest number");
		}

	}

}
