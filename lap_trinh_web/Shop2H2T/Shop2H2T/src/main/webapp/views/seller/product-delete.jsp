<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp" %>

<c:url value="/seller/product/delete?productId=${productId}" var="deleteUrl"></c:url>
<form method="post" action="${deleteUrl }">
	<h2>Do you want to delete this product from your system ?</h2>
	<button class="btn btn-danger" type="submit">Yes</button>
	<a class="btn btn-primary" href="<%=request.getContextPath() %>/common/home">No</a>
</form>
