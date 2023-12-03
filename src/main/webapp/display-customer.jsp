<!-- display-customer.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display Customer</title>
</head>
<body>
    <h2>Customer Details</h2>
    <c:if test="${not empty customer}">
        <p>Name: ${customer.cname}</p>
        <p>ID: ${customer.cid}</p>
         <p>ID: ${customer.cmail}</p>
    </c:if>
    <br>
    <a href="/search">Search Again</a>
    <a href="/form">Add to form</a>
</body>
</html>
