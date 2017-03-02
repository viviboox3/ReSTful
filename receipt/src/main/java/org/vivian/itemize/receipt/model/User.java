package org.vivian.itemize.receipt.model;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement		// jaxb
public class User {
	
	@Min(1)	// id must be at least 1, since it starts at one
	private long id;
	@NotNull
	private String firstName;
	private String lastName;
	private String addr;
	private Map<Long, Receipt> receipts = new HashMap<>();
	
	public User() {}	// no-arg constructor
	
	public User(long id, String firstName, String lastName, String addr) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@XmlTransient
	public Map<Long, Receipt> getReceipts() {
		return receipts;
	}
	public void setReceipts(Map<Long, Receipt> receipts) {
		this.receipts = receipts;
	}
	
	
}
