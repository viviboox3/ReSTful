package org.vivian.itemize.receipt.resources;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vivian.itemize.receipt.model.User;
import org.vivian.itemize.receipt.service.UserService;

@Path("users")	// annotate to map to URI path /users
public class UserResource {

	UserService userService = new UserService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET	// HTTP GET method annotation
	@Produces(MediaType.APPLICATION_JSON)	// response format
	public List<User> getUsers() {
		
		return userService.getAllUsers();
	}
	
	@GET
	@Path("{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("userId") long userId) {
		
		return userService.getUser(userId);
	}
	
	@Path("{userId}/receipts")
	public ReceiptResource getReceiptResource() {
		return new ReceiptResource();
	}
}
