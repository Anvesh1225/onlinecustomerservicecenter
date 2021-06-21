package com.customerservicecenter.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


// TODO: Auto-generated Javadoc
/**
 * The Class Operator.
 */
@Entity
@Table(name = "operator")
public class Operator {
	
	/** The operator id. */
	@Id
	@Column(name="operatorid",length = 10)
	@Positive(message="operatorid should be positive number")
	private int operatorId;
	
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
	@Column(name="operatorMail")
	@NotNull(message = "Email should not be Null")
    @NotBlank(message = "Email should not be Blank")
    @Size(min = 1, max = 20)
    @Email
	private String email;
	
	/** The mobile. */
	@Column(name="operMoblileNo",length = 10)
	@NotNull(message = "Moblie number should not be Null")
    @NotBlank(message = "Moblie number should not be Blank")
    @Size(min = 1, max = 20)
	private String mobile;
	
	/** The city. */
	@Column(name="operCity",length = 20)
	@NotNull(message = "city should not be Null")
    @NotBlank(message = "city should not be Blank")
    @Size(min = 1, max = 20)

	private String city;
	
	/** The department. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentid")
	private Department department;

	/**
	 * Instantiates a new operator.
	 */
	public Operator() {

	}

	/**
	 * Instantiates a new operator.
	 *
	 * @param operatorId the operator id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param email the email
	 * @param mobile the mobile
	 * @param city the city
	 * @param department the department
	 */
	public Operator(int operatorId, String firstName, String lastName, String email, String mobile, String city,
			Department department) {
		super();
		this.operatorId = operatorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.department = department;
	}

	/**
	 * Gets the operator id.
	 *
	 * @return the operator id
	 */
	public int getOperatorId() {
		return operatorId;
	}

	/**
	 * Sets the operator id.
	 *
	 * @param operatorId the new operator id
	 */
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
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
	 * Gets the department.
	 *
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", city=" + city + ", department=" + department + "]";
	}

}
