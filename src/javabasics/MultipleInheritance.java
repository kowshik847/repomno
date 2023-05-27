package javabasics;

interface abc {
	int x=10;
	void m1();
	
}

interface xyz {
	int y =20;
	void m2();
}

class pqr {
	int z= 30;
	void m3()
	{
		System.out.println(z);
	}
}

public class MultipleInheritance extends pqr implements abc, xyz {
	public void m1()
	{
		System.out.println("this is m1 from abc");
		
	}
	public void m2()
	{
		System.out.println("this is m2 for xyz");
		
	}

	public static void main(String[] args) {
		
		abc a = new MultipleInheritance();
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
		mi.m2();
		mi.m3();
		a.m1(); 
		

	}

}
