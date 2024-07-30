package basicsOfJava;

import java.util.ArrayList;

public class ArrayandArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		System.out.println("Array...");
		for (int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Array List..");
		ArrayList<String> cNames=new ArrayList<String>();
		System.out.println("Array List size before storing elements="+ cNames.size());
		cNames.add("John");
		cNames.add("Mark");
		cNames.add("Riya");
		cNames.add("Masaud");
		cNames.add("Haris");
		System.out.println("Array List size after storing elements="+ cNames.size());
		for (int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		cNames.set(2, "Tina");
		cNames.add("Thoma");
		System.out.println("Array List size after storing elements="+ cNames.size());
		for (int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		
	}

}
