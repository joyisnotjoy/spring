<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ��� �ۺ��� </title>
</head>
<body>
<h1>�Խ��� �ۺ��� </h1>
��ȣ: ${vo.no }<br/>
����: ${vo.title }<br/>
����: ${vo.content }<br/>
�ۼ���: ${vo.writer }<br/>
�ۼ���:<fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd"/> <br/>
��ȸ��: ${vo.hit }<br/>	
<a href="update.do?no=${vo.no }" class="btn btn-defalt">����</a>
<a href="delete.do?no=${vo.no }" class="btn btn-defalt" id="deleteBtn">����</a>
<a href="list.do" class="btn btn-defalt">����Ʈ</a>

</body>
</html>