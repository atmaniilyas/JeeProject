<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
   session.removeAttribute("user");
   request.getRequestDispatcher("index.jsp").forward(request,response);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
