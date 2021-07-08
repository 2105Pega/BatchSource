
public class UserService {
	
	private UserDAOImpl uDao = new UserDAOImpl();
	
	public void depositAccount(User user) {
		
		if(accountType == 1) {
			uDao.depositAccount();
		}
	}

}
