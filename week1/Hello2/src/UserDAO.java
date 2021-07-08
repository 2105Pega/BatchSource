import java.util.List;

public interface UserDAO {
	
	public List<Account> getListofAccount(User user);
	public boolean createAccount();
	public boolean deleteAccount();
	public boolean depositAccount();
	public boolean checkCredentials();
	public boolean createUser();
	public boolean depositAccount(User user);
	public boolean withdraw();
	
	

}
