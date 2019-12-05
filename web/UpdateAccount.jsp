<%-- 
    Document   : UpdateAccount
    Created on : 08-Oct-2018, 22:25:25
    Author     : MTimos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <LINK REL=STYLESHEET HREF="css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="UpdateRecord" method="post">
        <table border="0"  cellspacing="5" cellpadding="5">
            <thead>
                <tr>
                    <th>UPDATE AN ACCOUNT</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accountNumber" value="${update.accountNumber}" size="20" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" value="${update.firstName}" size="20" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" value="${update.lastName}" size="20" /></td>
                </tr>
                <tr>
                    <td>Sort Code</td>
                    <td><input type="text" name="sortCode" value="${update.sortCode}" size="20" /></td>
                </tr>
                <tr>
                    <td>Balance</td>
                    <td><input type="text" name="balance" value="${update.balance}" size="20" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update" name="update" /></td>
                </tr>
            </tbody>
        </table>
       </form>
    </center>
    </body>
</html>
