package classesAndObjs;

public class CustInfo {
	
	int custno;
	String custname;
	
	public CustInfo()
	{
		
		System.out.println("Default Constructor Invoked...");
		custno=1;
		custname="Mark";
	}
	public CustInfo(int custno1, String custname1)
	{
		
		System.out.println("Parameterized Constructor Invoked...");
		custno=custno1;
		custname=custname1;
	}
	public void dispCustInfo()
	{
		System.out.println("custno = "+custno+"\t"+"custname = "+custname);
	}

}
