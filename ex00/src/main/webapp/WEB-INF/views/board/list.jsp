<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>�Խ��� ����Ʈ</title>
<style type="text/css">
.dataRow:hover {
	background: #eee;
	cursor: pointer;
}
</style>
<!-- Long no �Ѿ���� �ϴ� ����: list.jsp - boardController.view(Long no)
- BoardService - BoardServiceImpl - BoardMapper - BoardMapper.xml -->
</head>
<body>
<h1>�Խ��� ����Ʈ</h1>
<table>
<tr>
<th>�۹�ȣ</th>
<th>����</th>
<th>�ۼ���</th>
<th>�ۼ���</th>
<th>��ȸ��</th>
</tr>
<c:forEach items="${list }" var="vo">
	<tr  class="dataRow" onclick="location='view.do?no=${vo.no}'">
		<td>${vo.no }</td>
		<td>${vo.title }</td>
		<td>${vo.writer }</td>
		<td>${vo.writeDate }</td>
		<td>${vo.hit }</td>
	</tr>
</c:forEach>
</table>
<a href="view.do">�ۺ���</a>
<a href="write.do">�۾���</a>
</body>
</html>