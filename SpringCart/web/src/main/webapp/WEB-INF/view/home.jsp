<%-- 
    Document   : content
    Created on : Jan 4, 2020, 11:19:47 AM
    Author     : cgallen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
// request set in controller
//request.setAttribute("selectedPage", "home");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='resources/css/solentestores.css' />
    </head>
    <body>
        <!-- TODO finish this! -->
       
        <h1>Solent E-Stores</h1>
        <p>Welcome to Solent E-Stores, where you can buy all your favourite products!</p>
        <p><strong>Now with shopping basket feature!</strong></p>
        
        <form method="post" action="">
            <fieldset>
                <legend>Search for products</legend>
                <label for="productType">Product type:</label><br />
                <input name="productType" id="productType" type="text" /><br />
                <input type="hidden" name="action" value="search" />
                <input type="submit" value="Go!" />
            </fieldset>
        </form>
      
    </body>
</html>

