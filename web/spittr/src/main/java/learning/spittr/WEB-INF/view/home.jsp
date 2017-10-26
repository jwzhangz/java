<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          herf="<c:url value="/resources/style.css" />" >
  </hesd>

  <body>
    <h1>Welcome to Spittr</h1>

    <a herf="<c:url value="/spittles" />">Spittles</a>
    <a herf="<c:url value="/spittles/register" />">Register</a>
  </body>
</html>