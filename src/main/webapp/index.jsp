<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Пролог</title>
</head>
<body>
<h1><%= "Пролог" %>
</h1>
<p>Маленький текст</p>
<br/>
<h2>Знакомство с экипажем</h2>
<p>Маленький тест №2</p>
<br>

<form action="stageFirst">
    Name: <input name="name" />
    <br><br>
    <input type="submit" value="Начать" />
</form>
<p>IP Адресс: ${remoteAddr}</p>
<%--<a href="start">Нажми чтобы начать</a>--%>
</body>
</html>