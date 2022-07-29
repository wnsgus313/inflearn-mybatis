<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Question</title>
	<link rel="stylesheet" href="${path}/resources/css/index.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<%@ page import="com.inflearnDAO.QuestionDAO, com.inflearnVO.QuestionVO" %>

<jsp:include page="header.jsp"></jsp:include>

<p class="question">제목 <span class="question">${question.title}</span></p>
<p class="question">내용 <span class="question">${question.content}</span></p>

<button onclick="location.href='/editQuestion/${question.id}'">편집</button>
<button onclick="location.href='/deleteQuestion/${question.id}'">삭제</button>

</body>
</html>