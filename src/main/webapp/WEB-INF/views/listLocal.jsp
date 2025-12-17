<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: amanda
  Date: 03/12/2025
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" type="text/css" href="../../assets/css/local.css">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Listagem dos locais cadastrados</h1>

<table>
  <thead class="thead-local-list">
  <tr>
    <th>Id</th>
    <th>Nome</th>
    <th>Código</th>
    <th>Bairro</th>
    <th>Cidade</th>
    <th>Data da Criação</th>
    <td>Dias desde a ultima atualização</td>
    <td>Outras ações</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="local" items="${localDTO}">
    <tr>
      <td>${local.id}</td>
      <td>${local.name}</td>
      <td>${local.code}</td>
      <td>${local.neighborhood}</td>
      <td>${local.city}</td>
      <td>${local.creationDate}</td>
      <td>${local.lastUpdate}</td>
      <td>
        <a href="/update?id=${local.id}">Editar</a>

        <form action="/remove" method="post">
          <button name="id" value="${local.id}">Deletar</button>
        </form>

      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
