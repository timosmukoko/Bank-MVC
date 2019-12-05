<%-- 
    Document   : EditAccounts
    Created on : 09-Oct-2018, 04:55:58
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
        <h2> Edit Accounts</h2>
        <table style="background-color: white;" cellspacing="4" cellpading="5" border="1">
               <tr> 
                 <td >Account ID</td>
                 <td>First Name</td>
                 <td>Last Name</td>
                 <td>Sort Code</td>
                 <td>Balance</td>
               </tr>
               
                <tr>
                 <td><input type="text" name="acc" value="${update.accountNumber}"/></td>
                 <td><input type="text" name="first" value="${update.firstName}"/></td>
                 <td><input type="text" name="last" value="${update.lastName}"/></td>
                 <td><input type="text" name="sort" value="${update.sortCode}"/></td>
                
                   
                       <td bgcolor="red"><input type="text" name="bal" value="${update.balance}"/></td>  
                  
                </tr>
                     
         </table>
    </center>
    </body>
</html>
