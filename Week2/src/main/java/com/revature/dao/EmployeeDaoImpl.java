package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;
import com.revature.util.ConnectionUtils;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean addEmployee(Employee e) {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sql = "insert into employees(f_name, l_name, roles_id)" + "values(?, ?, ?)";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, e.getFirstName());
			statement.setString(2, e.getLastName());
			statement.setInt(3, e.getRoleId());

			statement.execute();
			return true;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmployee(Employee e) {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sql = "delete from employees where employees_id = ?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, e.getEmployeeId());

			statement.execute();
			return true;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sql = "select * from employees";

			Statement statement = conn.createStatement();

			ResultSet result = statement.executeQuery(sql);

			List<Employee> empList = new ArrayList<Employee>();

			while (result.next()) {
				Employee e = new Employee(result.getInt("employees_id"), result.getString("f_name"),
						result.getString("l_name"), result.getInt("roles_id"));
				empList.add(e);
			}

			return empList;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeByID(Integer id) {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sqlPrep = "select * from employees where employees_id = ?";
			PreparedStatement prepStatement = conn.prepareStatement(sqlPrep);
			prepStatement.setInt(1, id);
			ResultSet rs = prepStatement.executeQuery();
			rs.next();
			Employee e1 = new Employee(rs.getInt("employees_id"), rs.getString("f_name"), rs.getString("l_name"),
					rs.getInt("roles_id"));

			return e1;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public double[] getAvgAndSum() {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sql = "select * from get_avg_and_sum()";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			rs.next();

			return new double[] { rs.getDouble("avg_salary"), rs.getDouble("sum_salary") };

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteSpongebob() {
		try (Connection conn = ConnectionUtils.getConnection()) {

			String sql = "call procedure_delete_spongebob()";
			CallableStatement stmnt = conn.prepareCall(sql);
			
			stmnt.execute();
			
			return true;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public List<String> getFirstNames() {
		try (Connection conn = ConnectionUtils.getConnection()){
			String sql = "select * from users";
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery(sql);
			List<String> fNames = new ArrayList<String>();
			while(rs.next()) {
				System.out.println(rs.getString("user_fname"));
				fNames.add(rs.getString("user_fname"));
			}
			return fNames;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
