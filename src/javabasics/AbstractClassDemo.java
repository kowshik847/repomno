package javabasics;

abstract class Animal {
	abstract void eat();
	
	void run()
	{
		System.out.println("runs fast...");
		
	}
	
	static void sleep()
	{
		System.out.println("sleeping");
		
	}
	
	Animal()
	{
		System.out.println("This is animal constructor");
	}
	
	
}

class Horse extends Animal
{
	void eat()
	{
		System.out.println("eats grass");
	}
}


public class AbstractClassDemo {

	public static void main(String[] args) {
		
		//Animal h = new Animal() //this is wrong you cannot create object for abstract class
		Animal h = new Horse();   //this is the right way of instantiating
		//Horse h = new Horse();  //this is right way of creating object
		
		h.eat();   //invoking abstract method
		h.run();   //invoking normal or non abstract method
		Animal.sleep();   //invoking static method without object
		                  //constructor will be invoked automatically during the creation of object
    System.out.println("kowshik first commit");
	}

}
