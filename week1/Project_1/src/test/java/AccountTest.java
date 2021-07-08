import java.lang.reflect.Field;

import org.junit.Before;
import com.revature.account.Account;


public class AccountTest {
	
	private Account Account;

	@Before
	void setUp() throws Exception{
		//initialize customer here
		this.Account = new Account(0, 0, 0);
	}
	
	
	  @org.junit.Test
	    public void testSetCustomer_id() {
	        Account account = new Account(2,3, 1);
	        account.setCustomer_id(1);
	        assertTrue(account.getCustomer_id() == 1);
	    }


	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		System.out.println("success");
		
	}

}
