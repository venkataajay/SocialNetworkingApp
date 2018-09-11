package dao.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.RegistrationDetails;
import dao.interfaces.UserDao;

public class UserDaoImpl implements UserDao {

	public boolean authenticateUser(String userName, String Password){
		Connection con=ConnectionProvider.getCon();
		try {
			Statement st = (Statement) con.createStatement();
			ResultSet rs=st.executeQuery("select * from reg_users where email='"+userName+"'and password='"+Password+"'");
			if(rs.next()) {
				rs.getString("userName");
				rs.getString("Password");
				return true;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addUser(RegistrationDetails registrationDetails) {
		Statement st = (Statement) con.createStatement();
		ResultSet rs=st.executeQuery("select * from reg_users where email='"+userName+"'and password='"+Password+"'");
		if(rs.next()) {
			RegistrationDetails rgd=new RegistrationDetails();
			rgd.setFirstName(rs.getString("firstName"));
			rgd.setLastName(rs.getString("lastName"));
			rgd.setEmailID(rs.getString("emaiID"));
			rgd.setPassword(rs.getString("password"));
			rgd.setDateOfBirth(rs.getString("DateOfBirth"));
			rgd.setCity(rs.getString("city"));
			rs.getString("Password");
			return true;
			}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		return false;
	}

	public boolean deleteUser(String userName) {
		try {
			Statement st = (Statement) con.createStatement();
			 int i=st.executeQuery("delete from reg_users where email='"+userName+"'");
			
				if(i==1) {
				return true;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		
		
		return false;
	}

	public boolean userIDExists(String userName) {
		try {
			Statement st = (Statement) con.createStatement();
			ResultSet rs=st.executeQuery("select * from reg_users where email='"+userName+"'");
			if(rs.next()) {
				rs.getString("userName");
				return true;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		return false;
	}

}
