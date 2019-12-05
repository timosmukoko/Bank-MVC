<%-- 
    Document   : AllStudents
    Created on : 09-Oct-2018, 00:07:09
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
            <td><a href="customerInfo.jsp">Student Info</a></td>
            <td><a href="AllAccounts.jsp">All Students</a></td>            
        </table>
        <br />
        <h3>List of Customer</h3>
        <br />
        <table border="1">
            <th>Account Number</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Sort Code</th>
            <th>Balance</th>
            <c:forEach items="${allAcountList}" var="account">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetAccountID?id=${account.accountNumber}">${account.accountNumber}</a></td>
                    <td>${account.firstName}</td>
                    <td>${account.lastName}</td>
                    <td>${account.sortCode}</td>
                    <td>${account.balance}</td>
                </tr>
            </c:forEach>                 
        </table>
    </body>
</html>
