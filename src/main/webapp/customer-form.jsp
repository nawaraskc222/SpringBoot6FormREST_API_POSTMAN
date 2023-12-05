<!-- customer-form.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>
</head>
<body>
    <h2>Customer Form</h2>
    
    <form action="addCustomer" method="post">
     ID: <input type="text" name="cid"><br>
        Name: <input type="text" name="cname"><br>
        Email: <input type="text" name="cmail"><br>
        <input type="submit" value="Add Customer">
        
            </form>
    <br>
    <a href="/search">Search Customer</a>
</body>
</html>
