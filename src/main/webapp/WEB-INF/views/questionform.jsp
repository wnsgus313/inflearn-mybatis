<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageConext.request.contextPath}"/>

<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="index.css" type="text/css">
    <title>Question Form</title>
    <link rel="stylesheet" href="${path}/resources/css/index.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
  
<h1>질문 등록</h1>  
<form action="addQuestion" method="post" enctype="multipart/form-data">
<div class="question">
	 <input type="file" name="uploadFile" accept="image/png, image/jpeg"> 
	 <input type="text" placeholder="제목을 입력하세요." name="title" class='question-title'>
	 <textarea name="content" placeholder="내용을 입력하세요" class='question-content' ></textarea>
	 <input type="submit" value="등록" class="question-submit"/>
</div>
</form>  

</body>
</html>