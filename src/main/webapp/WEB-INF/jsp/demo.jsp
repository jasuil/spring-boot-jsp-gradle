<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="ko">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<script src="/js/jquery321.js"></script>
<script src="/js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class='badge'>${result }</div>

<c:out value="${result }"></c:out>
<c:if test='${result ne null }'>
하하하
</c:if>

<!-- paging S-->
<c:if test='${page.prevPage != 1}'>
[이전]
</c:if>
<c:forEach var="i" begin="${page.blockBegin }" end="${page.blockEnd }" step="1" varStatus="status">
      <c:out value="${page.blockBegin + status.count - 1} " />
    </c:forEach>

<!-- paging E-->
</body>
</html>