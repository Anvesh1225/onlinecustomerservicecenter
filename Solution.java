package com.customerservicecenter.model;

import java.util.Date;


// TODO: Auto-generated Javadoc
/**
 * The Class Solution.
 */
public class Solution {
	
	/** The solution id. */
	private int solutionId;
	
	/** The solution description. */
	private String solutionDescription;
	
	/** The solution date. */
	private Date solutionDate;
	
	/** The specilist. */
	private Operator specilist;
	
	/** The issue. */
	private Issue issue;
	
	/**
	 * Instantiates a new solution.
	 */
	public Solution() {

	}
	
	/**
	 * Instantiates a new solution.
	 *
	 * @param solutionId the solution id
	 * @param solutionDescription the solution description
	 * @param solutionDate the solution date
	 * @param specilist the specilist
	 * @param issue the issue
	 */
	public Solution(int solutionId, String solutionDescription, Date solutionDate, Operator specilist, Issue issue) {
		super();
		this.solutionId = solutionId;
		this.solutionDescription = solutionDescription;
		this.solutionDate = solutionDate;
		this.specilist = specilist;
		this.issue = issue;
	}
	
	/**
	 * Gets the solution id.
	 *
	 * @return the solution id
	 */
	public int getSolutionId() {
		return solutionId;
	}
	
	/**
	 * Sets the solution id.
	 *
	 * @param solutionId the new solution id
	 */
	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}
	
	/**
	 * Gets the solution description.
	 *
	 * @return the solution description
	 */
	public String getSolutionDescription() {
		return solutionDescription;
	}
	
	/**
	 * Sets the solution description.
	 *
	 * @param solutionDescription the new solution description
	 */
	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	
	/**
	 * Gets the solution date.
	 *
	 * @return the solution date
	 */
	public Date getSolutionDate() {
		return solutionDate;
	}
	
	/**
	 * Sets the solution date.
	 *
	 * @param solutionDate the new solution date
	 */
	public void setSolutionDate(Date solutionDate) {
		this.solutionDate = solutionDate;
	}
	
	/**
	 * Gets the specilist.
	 *
	 * @return the specilist
	 */
	public Operator getSpecilist() {
		return specilist;
	}
	
	/**
	 * Sets the specilist.
	 *
	 * @param specilist the new specilist
	 */
	public void setSpecilist(Operator specilist) {
		this.specilist = specilist;
	}
	
	/**
	 * Gets the issue.
	 *
	 * @return the issue
	 */
	public Issue getIssue() {
		return issue;
	}
	
	/**
	 * Sets the issue.
	 *
	 * @param issue the new issue
	 */
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Solution [solutionId=" + solutionId + ", solutionDescription=" + solutionDescription + ", solutionDate="
				+ solutionDate + ", specilist=" + specilist + ", issue=" + issue + "]";
	}
	
	
	
}
