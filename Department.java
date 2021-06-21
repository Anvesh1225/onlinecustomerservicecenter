package com.customerservicecenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


// TODO: Auto-generated Javadoc
/**
 * The Class Department.
 */
@Entity
@Table(name = "department")
public class Department {
	
	/** The department id. */
	@Id
	@Column(name="departmentid",length = 10)
	@Positive(message="custid should be positive number")
	private int departmentId;
	
	/** The department name. */
	@Column(name="name",length = 15)
	@NotNull(message = "Name should not be Null")
    @NotBlank(message = "Name should not be Blank")
    @Size(min = 1, max = 20)
	private String departmentName;

	/**
	 * Instantiates a new department.
	 */
	public Department() {

	}

	/**
	 * Instantiates a new department.
	 *
	 * @param departmentId the department id
	 * @param departmentName the department name
	 */
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	/**
	 * Gets the department id.
	 *
	 * @return the department id
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the department id.
	 *
	 * @param departmentId the new department id
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * Gets the department name.
	 *
	 * @return the department name
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Sets the department name.
	 *
	 * @param departmentName the new department name
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
