package classesAndObjs;

public class StudInfo {

	int sno; //attribute or field
	String sname;//attribute or field
	//Constructor MUST have a Class name and remove Void.
	public StudInfo()
	{
		System.out.println("Default Constructor Invoked...");
		sno=1;
		sname="Jack";
	}
	public StudInfo(int sno1, String sname1)
	{
		System.out.println("Parameterized Constructor with parameters Invoked...");
		sno=sno1;
		sname=sname1;
	}
	public void dispSudInfo()
	{
		System.out.println("sno="+sno+"\t"+"sname="+sname);
	}
	//I cannot run this because i do not have Main Method. For this, I need to create
	//a main class.
}
