package com.revature.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.customer.Customer;
import com.revature.employee.Employee;
import com.revature.utils.ConnectionUtil;

public class AccountDaoImplement implements AccountDAO {

	@Override
	public List<Account> getListOfAccount() {
		try (Connection conn = ConnectionUtil.getConnection()){
					
					String sql = "select * from account_table";
					Statement statement = conn.createStatement();
					
					ResultSet result = statement.executeQuery(sql);
					
					List<Account> accList = new ArrayList<Account>();
					
					while(result.next())
					{
						Account e = new Account (
								result.getInt("account_id"),
								result.getInt("acc_balance"),
								result.getInt("customer_id")

						);
						
					
							accList.add(e);
						
					
					}
					
					return accList;
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		return null;
	}
	
	@Override
	public Account findById(int id) {
		try (Connection conn = ConnectionUtil.getConnection()){
				
				String sql = "select * from account_table where account_id = ?";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setInt(1, id); //Inputs id value into the first "?"
				
				ResultSet result = statement.executeQuery();
				
				result.next(); //Gets the first row from our select statement
				
				Account e = new Account(
						result.getInt("account_id"),
						result.getInt("acc_balance"),
						result.getInt("customer_id")
				);
				
				
				
				return e;
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
			return null;
		}

	@Override
	public Account addAccount(Account e) {
		try (Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "insert into account_table(account_id, acc_balance, customer_id)"
					+ "values(?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			//Adds the first name variable from the Employee object to the first "?" of our prepared statement
			statement.setInt(1, e.getAccount_id());
			statement.setInt(2, e.getBalance());
			statement.setInt(3, e.getCustomer_id());
			
			statement.execute();
			
		//	return true;
			
		} catch (SQLException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}

    return e;
	}



}
