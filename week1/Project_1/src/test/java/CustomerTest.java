import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.revature.account.Account;
import com.revature.customer.Customer;

public class CustomerTest {
	
	//declare customer for testing
	Customer customer;
	
	@Before
	void setUp() throws Exception{
		//initialize customer here
		this.customer = new Customer();
	}
	

	
	  @Test
	    public void testSetCustomer_id() {
	        Customer cust = new Customer();
	        cust.setFirstName("hello");
	        assertTrue(cust.getFirstName() == "hello");
	    }

}//end test customer
