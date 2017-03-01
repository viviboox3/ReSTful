package org.vivian.itemize.receipt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vivian.itemize.receipt.database.DatabaseClass;
import org.vivian.itemize.receipt.model.Receipt;
import org.vivian.itemize.receipt.model.User;

public class ReceiptService {

	//private Map<Long, Receipt> receipts = DatabaseClass.getReceipts();
	private Map<Long, User> users = DatabaseClass.getUsers();
	
	public ReceiptService() {}
	
	public List<Receipt> getAllReceipts(long userId) {
		Map<Long, Receipt> receipts = users.get(userId).getReceipts();
		return new ArrayList<Receipt>(receipts.values());
	}
	
	public Receipt getReceipt(long userId, long receiptId) {
		Map<Long, Receipt> receipts = users.get(userId).getReceipts();
		return receipts.get(receiptId);
	}
	
	public Receipt addReceipt(long userId, Receipt receipt) {
		Map<Long, Receipt> receipts = users.get(userId).getReceipts();
		receipt.setId(receipts.size() + 1);
		receipts.put(receipt.getId(), receipt);
		
		return receipt;
	}
	
	public Receipt updateReceipt(long userId, Receipt receipt) {
		Map<Long, Receipt> receipts = users.get(userId).getReceipts();
		if (receipt.getId() <= 0) {
			return null;
		}
		receipts.put(receipt.getId(), receipt);
		return receipt;
	}
	
	public Receipt removeReceipt(long userId, long receiptId) {
		Map<Long, Receipt> receipts = users.get(userId).getReceipts();
		return receipts.remove(receiptId);
	}
}
