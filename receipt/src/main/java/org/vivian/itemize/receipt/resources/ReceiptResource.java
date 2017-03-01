package org.vivian.itemize.receipt.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivian.itemize.receipt.model.Receipt;
import org.vivian.itemize.receipt.service.ReceiptService;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReceiptResource {

	ReceiptService receiptService = new ReceiptService();
	
	@GET
	public List<Receipt> getAllReceipts(@PathParam("userId") long userId) {
		return receiptService.getAllReceipts(userId);
	}
	
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public Receipt addReceipt(@PathParam("userId") long userId, Receipt receipt) {
		
		return receiptService.addReceipt(userId, receipt);
	}
	
	@PUT
	@Path("{receiptId}")
	public Receipt updateReceipt(@PathParam("userId") long userId, @PathParam("receiptId") long receiptId, Receipt receipt) {
		receipt.setId(receiptId);
		return receiptService.updateReceipt(userId, receipt);
	}
	
	@DELETE
	@Path("{receiptId}")
	public void deleteReceipt(@PathParam("userId") long userId, @PathParam("receiptId") long receiptId) {
		receiptService.removeReceipt(userId, receiptId);
	}
	
	@GET
	@Path("{receiptId}")
	public Receipt getReceipt(@PathParam("userId") long userId, @PathParam("receiptId") long receiptId) {
		return receiptService.getReceipt(userId, receiptId);
	}
	/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)	// response format
	public List<Receipt> getReceipts() {
		
		return receiptService.getAllReceipts();
	}
	*/
	/*
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Receipt addReceipt(Receipt receipt) {
		
		return receiptService.addReceipt(receipt);
	}
	*/
	/*
	@GET
	@Path("{receiptId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getReceipt(@PathParam("receiptId") String receiptId) {
		return "it works22 " + receiptId;
		//return receiptService.getReceipt(id);
	}
	*/
	
}
