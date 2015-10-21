package users;

import java.util.ArrayList;

/**
 * A class that represents any single user of the Test Tool software.
 * <p>
 * Contains all functions and fields necessary to authenticate
 * and identify users within Test Tool 
 *
 * @author Max Linsenbard
 */
public abstract class User {

	public String username;
	private String password; // May change depending on security needs
	
	public String firstName;
	public String lastName;

	/**
	 * Attempts to log in the user with the given password, 
	 * returning a boolean representing whether the attempt was successful.
	 *
	 * @param the password to log the user in with
	 * @return the status of the login attempt
	 */
	public abstract boolean login(String password);

	/**
	 * Logs out the User from Test Tool.
	 */
	public abstract void logout();

	/**
	 * Replaces the users current password with a new password.
	 *
	 * @param the new password
	 */
	public abstract void changePassword(String newPassword);
}
