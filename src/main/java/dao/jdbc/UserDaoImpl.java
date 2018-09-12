package dao.jdbc;

import java.sql.Statement;

import org.bean.RegistrationDetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.interfaces.UserDao;

public class UserDaoImpl implements UserDao {

	public boolean authenticateUser(String emailid, String Password){
		Connection con=ConnectionProvider.getCon();
		try {
			Statement st = (Statement) con.createStatement();
			ResultSet rs=st.executeQuery("select * from reg_users where emailid='"+emailid+"'and Password='"+Password+"'");
			if(rs.next()) {
				return true;
				}       
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addUser(RegistrationDetails registrationDetails) {
		
			return true;
	}
	

	public boolean deleteUser(String userName) {
		
				return true;
	}

	public boolean userIDExists(String userName) {
		
		return false;
	}

}
