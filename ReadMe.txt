https://www.youtube.com/watch?v=UfOxcrxhC0s&t=8469s

 
_____________________________________________________________________
 
Added h2 database
search,display feature added
http://localhost:8080/h2-console

 
_____________________________________________________________________
 
imp:
Using REST api and post man 


 
_____________________________________________________________________
 


@ResponseBody:What it does: This annotation is used to indicate that the return value of a method 
should be serialized and sent as the body of the HTTP response.
When to use it: When you want to send data (e.g., a Java object) as the response body of an 
HTTP request, and you want Spring to automatically convert
 that data into a format suitable for the client (e.g., JSON).
 
@RequestBody:
What it does: This annotation is used in Spring (Java framework) to indicate that a method 
parameter should be bound to the body of the HTTP request.
When to use it: When you want to receive data from the client (e.g., a web browser or a mobile app)
 in the body of an HTTP request, and you want Spring
 to automatically convert that data into a Java object.
 
 
 
 
_____________________________________________________________________
 
 

Now, in Postman, make sure that your request:

Uses the POST method.
Has the URL http://localhost:8080/createCustomer.
Has the request body type set to JSON.
Has a valid JSON payload.
If the issue persists, you can also try specifying the Content-Type header explicitly in Postman:

In Postman, go to the Headers section.
Add a new header:
Key: Content-Type
Value: application/json

 
_____________________________________________________________________
 

