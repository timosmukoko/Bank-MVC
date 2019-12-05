<%-- 
    Document   : ManageAccount
    Created on : 07-Oct-2018, 13:13:26
    Author     : MTimos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="src.db.AccountsDB"%>
<!DOCTYPE html>
<html>
    <head>
        <LINK REL=STYLESHEET HREF="css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="InsertRecord" method="post">
        <table border="0"  cellspacing="5" cellpadding="5">
            <thead>
                <tr>
                    <th>CREATE AN ACCOUNT</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accountNumber" value="${deleteAccByID.accountNumber}" size="20" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" value="${deleteAccByID.firstName}" size="20" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" value="${deleteAccByID.lastName}" size="20" /></td>
                </tr>
                <tr>
                    <td>Sort Code</td>
                    <td><input type="text" name="sortCode" value="${deleteAccByID.sortCode}" size="20" /></td>
                </tr>
                <tr>
                    <td>Balance</td>
                    <td><input type="text" name="balance" value="${deleteAccByID.balance}" size="20" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Insert" name="insert" /></td>
                    <td><input type="reset" value="Clear" name="clear" /></td>
                </tr>
            </tbody>
        </table>
       </form>
    </body>
</html>
