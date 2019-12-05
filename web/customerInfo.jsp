<%-- 
    Document   : customerInfo
    Created on : 09-Oct-2018, 00:04:49
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
         <table border="1">
            <td><a href="customerInfo.jsp">Customer Info</a></td>
            <td><a href="AllAccounts">All Accounts</a></td>            
        </table>
        <br />

        <form action="CustomerServlet" method="POST">
            <table>
                <tr>
                    <td>Student ID:</td>
                    <td><input type="text" name="id" value="${account.accountNumber}"/></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="${account.firstName}"/></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="address" value="${account.lastName}" /></td>
                </tr>
                 <tr>
                    <td>Sort Code:</td>
                    <td><input type="text" name="address" value="${account.sortCode}" /></td>
                </tr>
                 <tr>
                    <td>Balance:</td>
                    <td><input type="text" name="address" value="${account.balance}" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="Submit" name="operation" value="Add" />
                    <input type="Submit" name="operation" value="Edit" />
                    <input type="Submit" name="operation" value="Delete" />
                    <input type="Submit" name="operation" value="Search" /></td>
                </tr>                
            </table>
        </form>
    </body>
</html>
