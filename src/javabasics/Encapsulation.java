package javabasics;

public class Encapsulation {
	public Encapsulation() {
		
	}
	private int id; //data members, variables, attributes, fields
	private int age;    // this is an instance variables
	private String name;
	
	public int getId() { //getters // functions  methods //unctions
	    return id;
	}

	public void setId(int id) {   //setters
		this.id = id;
	}
	
	public int getAge() { //getters // functions  methods //unctions
	    return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() { //getters // functions  methods //unctions
	    return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
