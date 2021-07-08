import java.io.Serializable;

public class Employee implements Serializable{

	private String firstName;
	private String lastName;
	private String name = firstName+' '+ lastName;
	
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	   @Override
	    public String toString() {
	        return "Employee [id=" + name + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	    }
	
}
