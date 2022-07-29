<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageConext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>인프런 - 프로가 되는 온라인 클래스 | 온라인 강의 플랫폼</title>
    <link rel="stylesheet" href="${path}/resources/css/index.css">

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<%@ page import="com.inflearnDAO.QuestionDAO, com.inflearnVO.QuestionVO, java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.jsp"></jsp:include>


<section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>질문</h3>
        </div>
    </div>
   
    <div id="board-list">
        <div class="container">
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">제목</th>
                    <th scope="col" class="th-date">등록일</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="question" varStatus="status">
	                <tr>
	                    <td>${status.count}</td>
	                    <th>
	                      <a href="question/${question.id}">${question.title}</a>
	                    </th>
	                    <td>${question.time_stamp}</td>
	                </tr>
	            </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    
    <div id="wirte">
   		<button onclick="location.href='questionform'">글쓰기</button>
    </div>

</section>


</body>
</html>