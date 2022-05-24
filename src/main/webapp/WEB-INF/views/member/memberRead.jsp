<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록</title>
</head>
<body>

	<h1>회원상세보기</h1>
	회원 아이디 : ${dto.m_id} <br>
	회원 주소 : ${dto.m_address}<br>
	회원 등록일 : $jjjuju{dto.m_regDate}<br>
	
	<a href="/memberUpdate?m_no=${dto.m_no}">수정하러 가기</a> <br>
	<a href="/memberList">목록으로</a>
</body>
</html>