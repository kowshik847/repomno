package javabasics;

interface Shape {
	int length = 15;  //the variables are by default static and final
	int width = 20;   //static means we can access it directly through class name or interface name
	                  //final means the value of the variable is constant or not changeable
	void circle();    //it is abstract method by default, it is public by default
	                  //we can create interface without abstract method also but there is no need of interface without abstract method
	
	static void square()    //static method
	{
		System.out.println("I am Square");
	}
	
	default void rectangle()     //default method
	{
		System.out.println("Area of the rectangle " + (length * width));
	}
}


public class InterfaceDemo implements Shape {
	
	public void circle()
	{
		System.out.println("circles");
	}

	public static void main(String[] args) {
		
		 //InterfaceDemo i = new InterfaceDemo();
		 Shape i = new InterfaceDemo();
		 i.circle();       //abstract method
		 i.rectangle();    //default method
		 Shape.square();   //static method
		

	}

}
