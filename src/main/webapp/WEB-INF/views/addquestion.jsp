<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>


<%@page import="com.inflearnDAO.QuestionDAO"%>  
<jsp:useBean id="q" class="com.inflearnVO.QuestionVO"></jsp:useBean>  
<jsp:setProperty property="*" name="q"/>  


</body>
</html>