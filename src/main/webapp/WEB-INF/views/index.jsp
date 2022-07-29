<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageConext.request.contextPath}"/>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>인프런 - 프로가 되는 온라인 클래스 | 온라인 강의 플랫폼</title>
    <link rel="stylesheet" href="${path}/resources/css/index.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>


<body>
<jsp:include page="header.jsp"></jsp:include>

<section class="banner">
    <div class="banner">
        <div class="banner-text">무슨 강의를 들을지 고민이라면? 현직자 Top 50 먼저 보기</div>
        <div calss="banner-text">입문부터 실전까지! 믿고 보는 실무자 Pick</div>
        <img src="${path}/resources/image1.gif" alt="Top 50" class="banner-img">
    </div>

    <div class="container sep-bottom container-swiper">
        <div class="swiper-controller">
            <button class="swiper-controller">s</button>
        </div>
        <div class="swiper">Top 50</div>
        <div class="swiper">입문 로드맵</div>
        <div class="swiper">나에게 맞는 강의</div>
        <div class="swiper">지식공유신청</div>
        <div class="swiper">신규 강의</div>
        <div class="swiper">인프런은</div>
        <div class="swiper">인프런 동료 찾기</div>
    </div>
</section>

<section class="search">
    <div class="search-title">인프런에서 성장을 도와드려요</div>
    <form action="" class="search-bottom">
        <input type="search" class="input-bottom" name="q" placeholder="배우고 싶은 지식을 입력해보세요.">
        <span class="material-icons" id="search-icon-bottom">search</span>
    </form>
    <ul class="tag-items">
        <li class="tag-item"><a class="tag" href="">#MVC</a></li>
        <li class="tag-item"><a class="tag" href="">#Spring Boot</a></li>
        <li class="tag-item"><a class="tag" href="">#Back-End</a></li>
        <li class="tag-item"><a class="tag" href="">#Front-End</a></li>
        <li class="tag-item"><a class="tag" href="">#JPA</a></li>
        <li class="tag-item"><a class="tag" href="">#Python</a></li>
        <li class="tag-item"><a class="tag" href="">#Java</a></li>
    </ul>
    <ul class="tag-items">
        <li class="tag-item"><a class="tag" href="">#Spring</a></li>
        <li class="tag-item"><a class="tag" href="">#게임개발</a></li>
        <li class="tag-item"><a class="tag" href="">#JavaScript</a></li>
    </ul>
</section>


</body>


</html>