<%-- 
    Document   : index
    Created on : 3 Oct 2021, 20:04:37
    Author     : nick
--%>


<%@page import="freemap.com528.shoppingcartapp.dto.Cart"%>
<%@page import="freemap.com528.shoppingcartapp.dto.Hit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='css/solentestores.css' />
    </head>
    <body>
        <!-- TODO finish this! -->
       
        <h1>Solent E-Stores</h1>
        <p>Welcome to Solent E-Stores, where you can buy all your favourite products!</p>
        <p><strong>Now with shopping basket feature!</strong></p>
        <% 
        String productType = request.getParameter("productType");
        if(productType != null) {
            %>
            You are searching for the product type: <strong><%=productType%></strong>
            <%
        }
     
        %>
        <form method="post" action="">
            <fieldset>
                <legend>Search for products</legend>
                <label for="productType">Product type:</label><br />
                <input name="productType" id="productType' type="text" /><br />
                <input type="submit" value="Go!" />
            </fieldset>
        </form>
      
    </body>
</html>

