<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

	<h1>글상세보기</h1>
	

	글 제목 : ${dto.b_title} <br>
	글 내용 : ${dto.b_content} <br>
	작성자 : ${dto.b_writer} <br>
	작성일 :	 ${dto.b_regDate}	 <br>	
	
	<c:if test="${sessionScope.m_id == dto.b_writer}">
	 <a href="/boardUpdate?b_no=${dto.b_no}">수정하기</a>
	 <a href="/boardDelete?b_no=${dto.b_no}">삭제하기</a>
	</c:if>
	
	
	<br>
	<h1>댓글 등록</h1>
	<input type="hidden" name="r_boardNum" id="r_boardNum" value="${dto.b_no}"> 
	작성자 : <input type="text" name="r_writer" id="r_writer" value="${sessionScope.m_id}" readonly="readonly"> <br>
	글내용 : <input type="text" name="r_content" id="r_content">
	<input type="button" name="" id="replyRegistBtn" value="등록하기">
	
	<br>
	<h1>댓글 목록</h1>
	<div id="replyShowZone">
		
	</div>
	

	
	<a href="/boardList">목록으로</a> <br>
	<a href="/boardComment">댓글로</a>
	<script type="text/javascript" src="${path}/resources/js/reply.js"></script>
</body>
</html>