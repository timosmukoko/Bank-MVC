<%-- 
    Document   : index
    Created on : 02-Oct-2018, 20:16:56
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
            <form action="ShowBalance" method="post">
                <td> <h3>Enter Account ID </h3></td>
                Enter Account ID <input type="text" name="id" value="" /> 
                <input type="submit" value="Get Account" name="btn1" />           
            </form>       
            <form action="ShawAllAccounts" method="get">
                <br><br> 
                <input type="submit" value="Get All Accounts" name="btn2" />
            </form> 
        
            <form action="InsertAccount.jsp" method="get">
                <br><br> 
                <input type="submit" value="Insert" name="insertPage" />
            </form>  
        
            <form action="DeleteRecord" method="post">
                <td> <h3>Enter Account ID </h3></td>
                Enter Account ID to Delete <input type="text" name="id" value="" /> 
                <input type="submit" value="Get Account to delete" name="btn3" />           
            </form>  
        
            <form action="EditAccounts.jsp" method="post">
                <td> <h3>Enter Account ID </h3></td>
                Enter Account ID to update <input type="text" name="id" value="" /> 
                <input type="submit" value="Get Account to update" name="btn3" />           
            </form> 
    </center>
    </body>
</html>
