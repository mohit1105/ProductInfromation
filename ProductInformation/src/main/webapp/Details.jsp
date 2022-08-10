<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<div id="div1">
	<h1>Output => </h1>
</div>
<%

out.print(session.getAttribute("obj"));

%>

</body>
</html>