<!DOCTYPE html>
<html>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
        <title>Start Page</title>
        <link rel="stylesheet" type="text/css" href="base.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 id="header">Outage Assistant!</h1>
        <form action="HomeServlet" action="exampleAction">
            <input type="hidden" name="action" value="someAction">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
