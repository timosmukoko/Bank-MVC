<%-- 
    Document   : shawAllAccounts
    Created on : 02-Oct-2018, 00:31:24
    Author     : MTimos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="src.db.AccountsDB"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<LINK REL=STYLESHEET HREF="css/style.css" TYPE="text/css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
    <h> Timos </h> 
        <br>
    <center>
        <h2> All Accounts</h2>
        <table style="background-color: white;" cellspacing="4" cellpading="5" border="1">
               <tr> 
                 <td >Account ID</td>
                 <td>First Name</td>
                 <td>Last Name</td>
                 <td>Sort Code</td>
                 <td>Balance</td>
               </tr>
               <c:forEach items="${allAcountList}" var="acc">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/ShowBalance?id=${acc.accountNumber}">${acc.accountNumber}</a></td>
                 <td>${acc.firstName}</td>
                 <td>${acc.lastName}</td>
                 <td>${acc.sortCode}</td>
                 <c:choose>
                     <c:when test="${acc.balance < 0}">
                       <td bgcolor="red">${acc.balance}</td>  
                     </c:when>
                     <c:otherwise>
                        <td>${acc.balance}</td> 
                     </c:otherwise>                 
                 </c:choose>
                </tr>
               </c:forEach>            
         </table>
    </center>
    </body>
</html>
