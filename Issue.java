package com.customerservicecenter.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Positive;


// TODO: Auto-generated Javadoc
/**
 * The Class Issue.
 */
/**
 * 
 * @author Fayaz Shaik
 *
 */
@Entity
@Table(name = "issueList")
public class Issue implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The issue id. */
	@Id
	@Column(name="issueid",length = 10)
	@Positive(message="issueid should be positive number")
	private int issueId;
	
	/** The issue type. */
	@Column(name="issueType")
	private String issueType;
	
	/** The description. */
	@Column(name="description")
	private String description;
	
	/** The issue status. */
	@Column(name="issueStatus")
	private String issueStatus;
	

	
	/**
	 * Instantiates a new issue.
	 */
	public Issue() {

	}
	
	/**
	 * Instantiates a new issue.
	 *
	 * @param issueId the issue id
	 * @param issueType the issue type
	 * @param description the description
	 * @param issueStatus the issue status
	 */
	public Issue(int issueId, String issueType, String description, String issueStatus) {
		super();
		this.issueId = issueId;
		this.issueType = issueType;
		this.description = description;
		this.issueStatus = issueStatus;
	}
	
	/**
	 * Gets the issue id.
	 *
	 * @return the issue id
	 */
	public int getIssueId() {
		return issueId;
	}
	
	/**
	 * Sets the issue id.
	 *
	 * @param issueId the new issue id
	 */
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	
	/**
	 * Gets the issue type.
	 *
	 * @return the issue type
	 */
	public String getIssueType() {
		return issueType;
	}
	
	/**
	 * Sets the issue type.
	 *
	 * @param issueType the new issue type
	 */
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the issue status.
	 *
	 * @return the issue status
	 */
	public String getIssueStatus() {
		return issueStatus;
	}
	
	/**
	 * Sets the issue status.
	 *
	 * @param issueStatus the new issue status
	 */
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", description=" + description
				+ ", issueStatus=" + issueStatus + "]";
	}
	
}
