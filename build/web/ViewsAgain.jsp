<%-- 
    Document   : ViewsAgain
    Created on : 07-Oct-2018, 13:56:26
    Author     : MTimos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b><p>Account Number:</b>    ${customer.accountNumber}</p>
        <b><p>First Name:</b> ${sessionScope.customer.firstName} </p>
        <b><p>Last Name:</b>    ${sessionScope.customer.lastName} </p>
        <b><p>Sort Code:</b> ${sessionScope.customer.sortCode} </p>
        <b><p>Balance:</b>   ${sessionScope.customer.balance}</p>
        
        
        <form id = "revisit" name="revisit" method="post" action="InsertAccount.jsp">
            
            <input type="submit" name="submit" id="submit" value="Edit Details" />
        </form>
        
        <form id = "save" name="save" method="post" action="ManageAccount">
            
            <input type="submit" name="submit" id="submit" value="Save Details" />
        </form>
    </body>
</html>
