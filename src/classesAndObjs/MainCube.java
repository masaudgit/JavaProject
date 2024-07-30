package classesAndObjs;
//this MainCube is New Class created to run the code
//from old Class into the New Class (MainCube)
public class MainCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj = new Cube();
		obj.setData();
		int res=obj.dispCube();
		System.out.println("Cube(MainCube)="+res);
		obj.getDataFrmMain(20, 20, 20);
		res=obj.dispCube();
		System.out.println("Cube(MainCube)="+res);
		res=obj.getDataFrmMain1(30, 30, 30);
		System.out.println("Cube(MainCube)="+res);

	}

}
