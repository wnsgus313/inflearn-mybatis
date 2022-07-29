<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageConext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit</title>
	<link rel="stylesheet" href="${path}/resources/css/index.css">
	<link rel="stylesheet" href="${path}/resources/css/index.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%@page import="com.inflearnDAO.QuestionDAO, com.inflearnVO.QuestionVO"%>  
  
<h1>질문 수정</h1>  
<form action="/editQuestion" method="post">
<div class="question">
	<input type="hidden" value="${question.id}" name="id" >
	<input type="text" value="${question.title}" name="title" class='question-title'>
	<textarea name="content" placeholder="내용을 입력하세요" class='question-content' >${question.content}</textarea>
	<input type="submit" value="등록" class="question-submit"/>
</div>
</form>  
</body>
</html>