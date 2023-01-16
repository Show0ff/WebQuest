<%--
  Created by IntelliJ IDEA.
  User: mrfre
  Date: 14.01.2023
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stage 4</title>
</head>
<body>
<p>Тебя вернули домой. Победа.</p>
<form action="stageFourth">
    Хотите начать заново? <input type="radio" name="answer" value="accept"/>Да
    <input type="radio" name="answer" value="decline"/>Нет
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
