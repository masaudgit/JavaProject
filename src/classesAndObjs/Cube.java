package classesAndObjs;

public class Cube {
int l,b,h;
//this method with no return type and no parameters
public void setData()
{
	l=10;
	b=10;
	h=10;
}
//this method with no return type and no parameters
//public void dispCube()
//{
//	System.out.println("Cube="+(l*b*h));
//}
//Now,I rewrite the above block code with return type and no parameter
public int dispCube()
{
	return(l*b*h);
}
//now, using method - no return type (Void) with parameters
//getDataMain is method name, void returns no data type, x,y,z are para with data type
public void getDataFrmMain(int x, int y, int z)
{
	l=x;
	b=y;
	h=z;
}
//method with return type and return parameters
public int getDataFrmMain1(int x, int y, int z)
{
	l=x;
	b=y;
	h=z;
	return(l*b*h);
	
}
}
