<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 수정</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
 <h1>게시판 글 수정 폼</h1>
 <form action="update.do" method="post">
 <table class="table">
 <tr>
<th>번호</th>
<td><input name="no" value="${vo.no }" readonly="readonly"></td>
 </tr>
 <tr>
 <th>제목</th>
 <td><input name="title" value="${vo.title }"></td>
 </tr>
 <tr>
<th> 내용</th>
 <td><textarea rows="7" cols="80" name="content">${vo.content }</textarea></td>
 </tr>
 <tr>
 <th>작성자</th>
  <td><input name="writer" value="${vo.writer }"></td>
 <tr>
 </table>
  <button type="submit">수정</button>
  <button type="reset">새로입력</button>
 </form>
</body> 	
</html>