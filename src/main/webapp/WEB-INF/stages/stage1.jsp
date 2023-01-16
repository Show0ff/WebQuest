<%--
  Created by IntelliJ IDEA.
  User: mrfre
  Date: 14.01.2023
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stage 1</title>
</head>
<body>
<p>${name}, ты потерял память. Принять вызов НЛО?</p>
<form action="stageTwo" >
    Ответ: <input type="radio" name="answer" value="accept" />Принять вызов
    <input type="radio" name="answer" value="decline" />Отклонить вызов
    <br>
    <input type="submit" value="Далее" />
</form>

<form method="get" action="stat">
<p> IP Адресс: ${sessionScope.ip}
    <br>
    Имя в игре: ${requestScope.name}
    <br>
    Количество игр: ${sessionScope.counter}
</p>
</form>
</body>
</html>
