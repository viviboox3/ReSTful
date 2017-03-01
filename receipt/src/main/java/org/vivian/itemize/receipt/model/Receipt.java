package org.vivian.itemize.receipt.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Receipt {
	
	private long id;
	private String merchantName;
	
	public Receipt() {}
	
	public Receipt(long id, String merchantName) {
		this.id = id;
		this.merchantName = merchantName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	/*private String merchantAddr;
	private double subtotal;
	private double tax;
	private double discount; // in percent or number?
	private double tip;
	private double grandTotal;
	private Date purchaseDate;
	
	public Receipt() {}
	
	public Receipt(int id, String merchantName, String merchantAddr, double subtotal, double tax, double discount,
			double tip, double grandTotal, Date purchaseDate) {
		
		this.id = id;
		this.merchantName = merchantName;
		this.merchantAddr = merchantAddr;
		this.subtotal = subtotal;
		this.tax = tax;
		this.discount = discount;
		this.tip = tip;
		this.grandTotal = grandTotal;
		this.purchaseDate = purchaseDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantAddr() {
		return merchantAddr;
	}
	public void setMerchantAddr(String merchantAddr) {
		this.merchantAddr = merchantAddr;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTip() {
		return tip;
	}
	public void setTip(double tip) {
		this.tip = tip;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}*/
}
