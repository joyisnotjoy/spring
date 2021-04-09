<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판 글보기 </title>
</head>
<body>
<h1>게시판 글보기 </h1>
번호: ${vo.no }<br/>
제목: ${vo.title }<br/>
내용: ${vo.content }<br/>
작성자: ${vo.writer }<br/>
작성일:<fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd"/> <br/>
조회수: ${vo.hit }<br/>	
<a href="update.do?no=${vo.no }" class="btn btn-defalt">수정</a>
<a href="delete.do?no=${vo.no }" class="btn btn-defalt" id="deleteBtn">삭제</a>
<a href="list.do" class="btn btn-defalt">리스트</a>

</body>
</html>