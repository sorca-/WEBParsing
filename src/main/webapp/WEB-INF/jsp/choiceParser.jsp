<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>Welcome</title></head>
<body>
<h3>Welcome</h3>
<hr/>
<form name="choiceParserForm" method="post" action="controller">
    <input type="hidden" name="command" value="choice"/>
    <select name="parser">
        <option value="DOM">DOM</option>
        <option value="SAX">SAX</option>
        <option value="StAX">StAX</option>
    </select>
    <br>
    <input type="submit" value="Choice parser"/>
</form>
<hr/>
<form name="logoutForm" method="post" action="controller">
    <input type="hidden" name="command" value="logout"/>
    <input type="submit" value="Log out">
</form>
</body>
</html>