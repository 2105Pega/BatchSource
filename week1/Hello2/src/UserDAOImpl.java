import java.sql.PreparedStatement;
import java.util.List;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<Account> getListofAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkCredentials() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositAccount(User user, double money) {
		try(Connection conn = ConnectionUtils.getConnection()) {
			Sring sql = "Update account_table set account_balance = account_balance + ? "
					+ "where account_id = ("
					+ "  select acc_id from user_table "
					+ "    where user_id = ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setDouble(1,  money);
			statement.setInt(2,  user.getId());
			statement.setString(3,  accountType);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean withdraw() {
		// TODO Auto-generated method stub
		return false;
	}

}
