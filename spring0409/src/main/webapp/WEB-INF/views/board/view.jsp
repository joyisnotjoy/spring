<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글보기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Jua" rel="stylesheet">
<style type="text/css">

.dataRow:hover {
	background: #eee;
	cursor: pointer;
}
h1 {
  font-size: 30px; line-height: 1.4;
  font-family: 'Jua', sans-serif;
  text-align: center; margin: auto;
  position: absolute;
  left: 0; top: 0; right: 0; bottom: 0;
  width: 300px; height: 100px;
  color: #fff;
}
 
#bg {
  background-image: linear-gradient(to right, #ffc3a0 0%, #ffafbd 100%);
  width: 100%; height: 100%;
  position: fixed; top: 0; left: 0;
  transition: all 2s ease-out;
}
</style>
<script type="text/javascript">

$(function() {
	
	var blendAmount = 70;
	var delay = -10;
	var windowWidth = window.innerWidth;
	var bg = document.getElementById("bg");

	document.onmousemove = function(e){
	  mouseX = Math.round(e.pageX / windowWidth * 100 - delay);
	  
	  col1 = mouseX - blendAmount;
	  col2 = mouseX + blendAmount;
	  
	  bg.style.background = "linear-gradient(to right, #ffc3a0 "+ col1 +"%, #ffafbd "+ col2 +"%)";
	  
	}
	
});

	
	
</script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<section id="bg">
<div class="container">
<h1>게시판 글보기</h1>
<table class="table">
<tr>
<th>번호</th>
<td>${vo.no }</td>
</tr>
<tr>
<th>제목</th>
<td>${vo.title }</td>
</tr>
<tr>
<th>내용</th>
<td>${vo.content }</td>
</tr>
<tr>
<th>작성자</th>
<td>${vo.writer }</td>
</tr>
<tr>
<th>작성일</th>
<td><fmt:formatDate value="${vo.writeDate }" pattern="yyyy년 MM월 dd일"/></td>
</tr>
<tr>
<th>조회수 </th>
<td>${vo.hit }</td>
</tr>
<td colspan="2">
<a href="update.do?no=${vo.no }"  type="button" class="btn btn-default"  style="float: right">글수정</a>
<a href="delete.do?no=${vo.no } " type="button" class="btn btn-default"  style="float: right">글삭제</a>
<a href="list.do" type="button" class="btn btn-default"  style="float: right">리스트</a>
</tr>
</table>
</div>
</section>>
</html>