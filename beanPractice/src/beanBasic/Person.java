package beanBasic;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Added in 'Commit2'
	//toString() function definition
	
	String toString() {
		return "Name:"+this.name+"\nAge:"+this.age;
	}

}
