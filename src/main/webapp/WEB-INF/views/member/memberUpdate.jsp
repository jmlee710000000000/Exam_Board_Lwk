<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>회원등록</title>
</head>
<body>

	<h1>회원상세보기</h1>
	<form action="/memberUpdate" method="post">
	<input type="hidden"name="b_no" value="${dto.m_no}">
	<input type="hidden" name="m_no" value="${dto.m_no}">
	회원 아이디 : <input type="text" name="m_id" value="${dto.m_id}"> <br>
	회원 주소 : <input type="text" name="m_address" value="${dto.m_address}"> <br>
	회원 등록일 : ${dto.m_regDate} <br>
	<input type="submit" value="수정하기">
	</form>
	
	</body>
</html>