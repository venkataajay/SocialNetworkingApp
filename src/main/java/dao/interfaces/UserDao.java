package dao.interfaces;

import org.bean.RegistrationDetails;


public interface UserDao {
	
	public boolean authenticateUser(String emailid,String Password);
	public boolean addUser(RegistrationDetails registrationDetails);
	public boolean deleteUser(String userName);
	public boolean userIDExists(String userName);

}
