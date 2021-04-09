<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 쓰기</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
 <h1>게시판 글 쓰기 폼</h1>
 <div class="container">
 <form action="write.do" method="post">
 <table class="table">
 <tr>
 <th>제목 </th>
  <td><input name="title"></td>
  </tr>
 <tr>
  <th>내용 </th>
  <td><textarea name="content" rows="7" cols="80"></textarea><br>
  </tr>
 <tr>
<th>  작성자 </th>
  <td><input name="writer"></td>
  </tr>
 </table>
  <button type="button" class="btn btn-default">등록</button>
 </form>
 </div>
</body> 	
</html>