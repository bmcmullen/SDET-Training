package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Account;
import com.training.entity.Employee;
import com.training.standards.IAccountDAO;

public class AccountDAO implements IAccountDAO{

	@Override
	public boolean insertAccount(Account acct) {
		String insertSQL = "insert into account values (?,?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(insertSQL);
			gc.ps.setInt(1, acct.getAcctId());
			gc.ps.setString(2, acct.getAcctNo());
			gc.ps.setDouble(3, acct.getAcctBalance());
			gc.ps.setDouble(4, acct.getAcctAvgBalance());

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
	public boolean deleteAccount(int acctId) {
		String deleteSQL = "delete from account where acct_id = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(deleteSQL);
			gc.ps.setInt(1, acctId);

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
	public boolean updateAccountBalance(int acctId, double change) {
		String updateSQL = "update account set acct_balance = (acct_balance * ?) where acct_id = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(updateSQL);
			gc.ps.setDouble(1, change);
			gc.ps.setInt(2, acctId);

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
	public Account getAccount(int acctId) {
		String sql = "select acct_id, acct_no, acct_balance, acct_avg_bal from account where acct_id = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, acctId);

			gc.rs = gc.ps.executeQuery();

			if (gc.rs.next()) {
				Account acct = new Account(gc.rs.getInt(1),
						gc.rs.getString(2), 
						gc.rs.getDouble(3),
						gc.rs.getDouble(4));
				return acct;
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
	public List<Account> getAllAccounts() {
		String sql = "select acct_id, acct_no, acct_balance, acct_avg_bal from account";
		GetConnection gc = new GetConnection();
		List<Account> acctList = new ArrayList<Account>();
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			while (gc.rs.next()) {
				Account acct = new Account(gc.rs.getInt(1), 
						gc.rs.getString(2),
						gc.rs.getDouble(3),
						gc.rs.getDouble(4));
				acctList.add(acct);
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

		return acctList;
	}
	

}
