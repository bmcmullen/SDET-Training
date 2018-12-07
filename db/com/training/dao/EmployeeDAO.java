package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public boolean insertEmployee(Employee emp) {
		String insertSQL = "insert into employee values (?,?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(insertSQL);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4, emp.getEmpEmail());

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String deleteSQL = "delete from employee where empid = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(deleteSQL);
			gc.ps.setInt(1, empId);

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean updateEmployeeSalary(int empId, double newSalary) {
		String updateSQL = "update employee set empsal = ? where empid = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(updateSQL);
			gc.ps.setDouble(1, newSalary);
			gc.ps.setInt(2, empId);

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select empid, empname, empsal, empemail from employee where empid = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);

			gc.rs = gc.ps.executeQuery();

			if (gc.rs.next()) {
				Employee emp = new Employee(gc.rs.getInt(1), gc.rs.getString(2), gc.rs.getDouble(3),
						gc.rs.getString(4));
				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select empid, empname, empsal, empemail from employee";
		GetConnection gc = new GetConnection();
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			while (gc.rs.next()) {
				Employee emp = new Employee(gc.rs.getInt(1), 
						gc.rs.getString(2),
						gc.rs.getDouble(3),
						gc.rs.getString(4));
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return empList;
	}
}