<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="/journal" method="POST">
        <label>Title</label>
        <input type="text" name="title"/>

        <br>

        <label>Content</label>
        <textarea name="content"></textarea>

        <button>Submit</button>
    </form>
</body>
</html>