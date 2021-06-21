package com.customerservicecenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
@Entity
@Table(name = "customer")

@PrimaryKeyJoinColumn(name = "customer")
public class Customer extends Login{
	
	/** The customer id. */
	

	@Column(name="custid",length = 10)
	@Positive(message="custid should be positive number")
	private int customerId;
	
	/** The first name. */
	@Column(name="fname",length = 15)
	@NotNull(message = "Name should not be Null")
    @NotBlank(message = "Name should not be Blank")
    @Size(min = 1, max = 20)
	private String firstName;
	
	/** The last name. */
	@Column(name="lname",length = 15)
	@NotBlank(message = "lname is mandatory")
	@Size(min = 1, max = 20)
	private String lastName;
	
	/** The email. */
	@Column(name="custMail")
	@NotNull(message = "Email should not be Null")
    @NotBlank(message = "Email should not be Blank")
    @Size(min = 1, max = 20)
    @Email
	private String email;
	
	/** The mobile. */
	@Column(name="custMoblileNo",length = 10)
	@NotNull(message = "Moblie number should not be Null")
    @NotBlank(message = "Moblie number should not be Blank")
    @Size(min = 1, max = 20)
	private String mobile;
	
	/** The city. */
	@Column(name="custCity",length = 20)
	@NotNull(message = "city should not be Null")
    @NotBlank(message = "city should not be Blank")
    @Size(min = 1, max = 20)
	private String city;
	
	/** The call. */
	@OneToOne(mappedBy = "customer")
	private Call call;
	
	/**
	 * Instantiates a new customer.
	 */
	public Customer() {

	}
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param customerId the customer id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param email the email
	 * @param mobile the mobile
	 * @param city the city
	 */
	public Customer(int customerId, String firstName, String lastName, String email, String mobile, String city) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
	}
	
	/**
	 * Gets the customer id.
	 *
	 * @return the customer id
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * Sets the customer id.
	 *
	 * @param customerId the new customer id
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * Sets the mobile.
	 *
	 * @param mobile the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", city=" + city + "]";
	}
}
