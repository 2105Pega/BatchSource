import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.revature.account.Account;
import com.revature.customer.Customer;
import com.revature.employee.Employee;

public class EmployeeTest {
	
	private Employee Employee;

	@Before
	void setUp() throws Exception{
		//initialize customer here
		this.Employee = new Employee(0, null, null, 0, null, null);
	}
	

	  @Test
	    public void testSetCustomer_id() {
		  Employee emp = new Employee(2, "hello", "hello1", 2, "user", "user");
	          emp.setEmployees_id(2);;
	        assertTrue(emp.getEmployees_id() == 2);
	    }
	  @Test
	    public void testSetUserName() {
		  Employee emp = new Employee(2, "hello", "hello1", 2, "user", "user");
	          emp.setUserName("name");
	        assertTrue(emp.getUserName() == "name");
	    }
	  @Test
	    public void testsetPassword() {
		  Employee emp = new Employee(2, "hello", "hello1", 2, "user", "user");
	          emp.setPassword("hello");
	        assertTrue(emp.getPassword() == "hello");
	    }
}
