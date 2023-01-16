<%--
  Created by IntelliJ IDEA.
  User: mrfre
  Date: 14.01.2023
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stage 3</title>
</head>
<body>
<p>Ты поднялся на мостик. Ты кто?</p>
<form action="stageFourth">
  Ответ: <input type="radio" name="answer" value="accept"/>Сказать правду о себе
  <input type="radio" name="answer" value="decline"/>Солгать о себе
  <br>
  <input type="submit" value="Далее"/>
</form>
<p> IP Адресс: ${sessionScope.ip}
    <br>
    Имя в игре: ${sessionScope.name}
    <br>
    Количество игр: ${sessionScope.counter}
</p>
</body>
</html>
