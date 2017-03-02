# ReSTful
messing with ReST in building a receipt management API

### Sample JSON Format
	{
	  "discount": 0,
      "expenseCat": "Food",
      "grandTotal": 300,
      "id": 1,
      "image": "http://stackoverflow.com/questions/2254435/can-an-int-be-null-in-java",
      "merchantAddr": "53 Utica Ave, Suite #221, Chicago, IL, 60647, US",
      "merchantName": "Vivian",
      "purchaseDate": "Mar. 31, 2016",
      "subtotal": 0,
      "tax": 0,
      "tip": 0
    }
    
### Sample URL call
To access all user information `http://localhost:8080/receipt/webapi/users`\n
To access single user information `http://localhost:8080/receipt/webapi/users/{userId}`\n
POST receipt `http://localhost:8080/receipt/webapi/users/1/receipts`\n
DELETE/PUT/GET receipt `http://localhost:8080/receipt/webapi/users/1/receipts/{receiptId}`\n
