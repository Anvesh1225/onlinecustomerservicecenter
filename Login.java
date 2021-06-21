package com.customerservicecenter.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


// TODO: Auto-generated Javadoc
/**
 * The Class Login.
 */
@Entity
@Table(name = "login")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Login  {

	/** The username. */
	// userid - customer, operatorid - operator
	@Id
	@Column(name = "username", length = 15)
	@NotNull(message = "Name should not be Null")
	@NotBlank(message = "Name should not be Blank")
	@Size(min = 1, max = 20)
	private int username;

	/** The password. */
	@Column(name = "password", length = 15)
	@NotNull(message = "password should not be Null")
	@NotBlank(message = "password should not be Blank")
	@Size(min = 1, max = 20)
	private String password;

	/** The type. */
	private UserType type;

	/** The is active. */
	@NotNull(message = "isActive can't be null")
	private boolean isActive;

	/**
	 * Instantiates a new login.
	 */
	public Login() {

	}

	/**
	 * Instantiates a new login.
	 *
	 * @param username the username
	 * @param password the password
	 * @param type     the type
	 * @param isActive the is active
	 */

	public Login(int username,String password,UserType type, boolean isActive) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		this.isActive = isActive;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public int getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(int username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public UserType getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(UserType type) {
		this.type = type;
	}

	/**
	 * Checks if is active.
	 *
	 * @return true, if is active
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * Sets the active.
	 *
	 * @param isActive the new active
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", type=" + type + ", isActive=" + isActive
				+ "]";
	}
}
