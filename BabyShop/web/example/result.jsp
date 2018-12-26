<%-- 
    Document   : result
    Created on : 24 Dec 2018, 9:49:51 AM
    Author     : chien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product list of search <s:property value="keyword" /></title>
    </head>
    <body>
        <h1>Product list of search <s:property value="keyword" /></h1>
        <table>
            <s:iterator value="products" var="product">
                <tr>
                    <td><s:property value="name"/></td>
                    <td><s:property value="price"/></td>
                    <td><s:property value="description"/></td>
                    <td><a herf="addToCart?newProductId=<s:property value="id"/>"> add to cart <a/></td>

                </tr>
            </s:iterator>
                <a href="index.jsp"> back<a/>




        </table>

    </body>
</html>
