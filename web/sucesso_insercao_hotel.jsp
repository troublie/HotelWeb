<%-- 
    Document   : sucesso_insercao_hotel
    Created on : May 11, 2016, 5:45:27 PM
    Author     : juliano.lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserção feita com sucesso</title>
    </head>
    <body>
        <h1>O hotel <%=request.getParameter("nome")%> na rua <%=request.getParameter("logradouro")%> e número <%=request.getParameter("numero")%> foi inserido com sucesso!</h1>
    </body>
</html>
