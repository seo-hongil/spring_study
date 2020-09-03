<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<title>/views/home.jsp</title>
</head>
<body>
<div class="container">
	<h1>인덱스 페이지 입니당!</h1>
	<ul>
		<li><a href="test/play.html">컨트롤러를 거치지 않는 요청</a></li>
		<li><a href="test/game.jsp">컨트롤러를 거치지 않는 요청2</a></li>
		<li><a href="friends.do">쿠알라모임</a></li>
		<li><a href="friends2.do">대학교 친구 목록</a></li>
		<li><a href="friends3.do">절친들 목록</a></li>
		<li><a href="delete.do">친구 정보 삭제</a></li>
		<li><a href="delete2.do">친구 정보 삭제2</a></li>
		<li><a href="users/signup_form.do">회원 가입 폼</a></li>
	</ul>
	
	<h2>공지사항</h2>
	<ul>
		<c:forEach var="tmp" items="${noticeList }">
			<li>${tmp }</li>
		</c:forEach>
	</ul>
	</div>
</body>
</html>
