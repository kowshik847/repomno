package javabasics;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		 
		e.setId(18);
		e.setAge(30);
		e.setName("kowshik");
		
		System.out.println("Id is " + e.getId());
		System.out.println("Id is " + e.getAge());
		System.out.println("Id is " + e.getName());

	}

}
