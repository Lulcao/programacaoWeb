Register.JSP
<%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 13/04/2024
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registro de Alunos</title>
</head>
<body>
<form action="Register">
    <table>
        <tr><td>Primeiro Nome</td><td><input type="text" name="uname"></td></tr>
        <tr><td>Último Nome</td><td><input type="text" name="uname"></td></tr>
        <tr><td>Matrícula</td><td><input type="text" name="matricula"></td></tr>
        <tr><td></td><td><input type="submit" name="register"></td></tr>
    </table>
</form>
</body>
</html>
