package com.managereceipt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "receipt")

public class Receipt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "merchantName")
	private String merchantName;
	@XmlElement(name = "merchantAddr")
	private String merchantAddr;
	@XmlElement(name = "subtotal")
	private double subtotal;
	@XmlElement(name = "tax")
	private double tax;
	@XmlElement(name = "discount")
	private double discount; // in percent or number?
	@XmlElement(name = "tip")
	private double tip;
	@XmlElement(name = "grandTotal")
	private double grandTotal;
	
	public Receipt(){}
	
	public Receipt(int id, String merchantName, String merchantAddr,
			double subtotal, double tax, double discount, double tip,
			double grandTotal) {
		
		this.id = id;
		this.merchantName = merchantName;
		this.merchantAddr = merchantAddr;
		this.subtotal = subtotal;
		this.tax = tax;
		this.discount = discount;
		this.tip = tip;
		this.grandTotal = grandTotal;
		
		
	}
	
}
