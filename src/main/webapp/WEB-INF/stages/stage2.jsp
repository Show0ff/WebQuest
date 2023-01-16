<%--
  Created by IntelliJ IDEA.
  User: mrfre
  Date: 14.01.2023
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stage 2</title>
</head>
<body>
<p>Ты принял вызов, поднимишься на мостик к капитану?</p>
<form action="stageThree">
    Ответ: <input type="radio" name="answer" value="accept"/>Подняться на мостик
    <input type="radio" name="answer" value="decline"/>Отказаться подниматься на мостик
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
