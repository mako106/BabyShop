<%-- 
    Document   : viewCart
    Created on : 24 Dec 2018, 10:05:16 AM
    Author     : chien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Details</title>
    </head>
    <body>
        <h1>Cart Details</h1>
        <table>
            <tr>
                <th> Product</th>
                <th>Amout </th>

            </tr>
            <s:iterator value="products" var="product" >
                <tr>
                    <td><s:property value="key.name"/></td>
                    <td><s:property value="value"/></td>

                </tr>

            </s:iterator>
        </table>
        <label>Total:</label> <s:property value="total"/><br/> 
        <a href="index.jsp" > continue buying</a>

    </body>
</html>
