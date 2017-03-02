package org.vivian.itemize.receipt.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import org.glassfish.jersey.server.validation.*;

//@XmlRootElement
public class Receipt {
	
	@Min(1)
	@FormParam("id")
	private long id;
	
	@NotNull		// validator to make sure this is a required field
	@FormParam("merchantName")
	private String merchantName;
	
	@FormParam("merchantAddr")
	private String merchantAddr;
	
	@NotNull
	@FormParam("expenseCat")
	private String expenseCat;
	

	@FormParam("subtotal")
	private double subtotal;
	@FormParam("tax")
	private double tax;
	@FormParam("discount")
	private double discount;
	@FormParam("tip")
	private double tip;
	
	@Min(1)
	@FormParam("grandTotal")
	private double grandTotal;
	
	@NotNull
	@FormParam("purchaseDate")
	private String purchaseDate;
	@NotNull
	@FormParam("image")
	private String image;
	
	public Receipt() {}
	
	public Receipt(int id, String merchantName, String merchantAddr, double subtotal, double tax, double discount,
			double tip, double grandTotal, String purchaseDate) {
		
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
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	public String getMerchantAddr() {
		return merchantAddr;
	}
	public void setMerchantAddr(String merchantAddr) {
		this.merchantAddr = merchantAddr;
	}
	public String getExpenseCat() {
		return expenseCat;
	}

	public void setExpenseCat(String expenseCat) {
		this.expenseCat = expenseCat;
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
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
}
