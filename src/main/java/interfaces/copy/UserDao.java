package interfaces.copy;

import beans.RegistrationDetails;

public interface UserDao {
	
	public boolean authenticateUser(String userName,String Password);
	public boolean addUser(RegistrationDetails registrationDetails);
	public boolean deleteUser(String userName);
	public boolean userIDExists(String userName);

}
