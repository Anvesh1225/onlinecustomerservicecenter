package com.customerservicecenter.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Positive;
// TODO: Auto-generated Javadoc

/**
 * The Class Call.
 */
@Entity
@Table(name = "callList")
public class Call implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The call id. */
	@Id
	@Column(name="callid",length = 10)
	@Positive(message="callid should be positive number")
	private int callId;
	
	/** The call date. */
	@Column(name="calldate",length = 10)
	private Date callDate;
	
	/** The call duration. */
	@Column(name="callduration",length = 10)
	private double callDuration;
	
	/** The phone number. */
	@Column(name="phno",length = 10)
	private String phoneNumber;
	
	/** The customer. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custid")
	private Customer customer;
	
	/** The issue. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "issueid")
	private Issue issue;
	
	/** The received by. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operatorid")
	private Operator receivedBy;
	
	/**
	 * Instantiates a new call.
	 */
	public Call() {
	}
	
	/**
	 * Instantiates a new call.
	 *
	 * @param callId the call id
	 * @param callDate the call date
	 * @param callDuration the call duration
	 * @param phoneNumber the phone number
	 * @param customer the customer
	 * @param issue the issue
	 * @param receivedBy the received by
	 */
	public Call(int callId, Date callDate, double callDuration, String phoneNumber, Customer customer, Issue issue,
			Operator receivedBy) {
		super();
		this.callId = callId;
		this.callDate = callDate;
		this.callDuration = callDuration;
		this.phoneNumber = phoneNumber;
		this.customer = customer;
		this.issue = issue;
		this.receivedBy = receivedBy;
	}


	/**
	 * Gets the call id.
	 *
	 * @return the call id
	 */
	public int getCallId() {
		return callId;
	}
	
	/**
	 * Sets the call id.
	 *
	 * @param callId the new call id
	 */
	public void setCallId(int callId) {
		this.callId = callId;
	}
	
	/**
	 * Gets the call date.
	 *
	 * @return the call date
	 */
	public Date getCallDate() {
		return callDate;
	}
	
	/**
	 * Sets the call date.
	 *
	 * @param callDate the new call date
	 */
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	
	/**
	 * Gets the call duration.
	 *
	 * @return the call duration
	 */
	public double getCallDuration() {
		return callDuration;
	}
	
	/**
	 * Sets the call duration.
	 *
	 * @param callDuration the new call duration
	 */
	public void setCallDuration(double callDuration) {
		this.callDuration = callDuration;
	}
	
	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	 * Gets the received by.
	 *
	 * @return the received by
	 */
	public Operator getReceivedBy() {
		return receivedBy;
	}
	
	/**
	 * Sets the received by.
	 *
	 * @param receivedBy the new received by
	 */
	public void setReceivedBy(Operator receivedBy) {
		this.receivedBy = receivedBy;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callDate=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + ", customer=" + customer + ", issue=" + issue + ", receivedBy=" + receivedBy + "]";
	}
	
}
