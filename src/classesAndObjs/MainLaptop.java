package classesAndObjs;

public class MainLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj = new Laptop();
		float p=obj.getLaptopPrice();
		System.out.println("Laptop Price="+p);
		HP objHP = new HP();
		objHP.demo();
		p=objHP.getLaptopPrice();
		System.out.println("Laptop Price="+p);

	}

}
