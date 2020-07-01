package beanBasic;

public class Employee { 
	
	private int id;
	private Person p = new Person();
	private double sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getPerson() {
		return p;
	}
	public void setPerson(Person person1) {
		this.p = person1;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double d) {
		this.sal = d;
	} 
	 
}