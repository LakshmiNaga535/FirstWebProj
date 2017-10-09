<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <%-- 	<c:set var="msg" value="  How Are You My Friend  "> </c:set>
		${fn:toUpperCase(msg)}<br>
		${fn:toLowerCase(msg)}<br>
		${fn:length(msg)}<br>
		${fn:trim(msg)} <br>
		${fn:replace(msg,'Friend','Dear')}<br>
		${fn:substring(msg,5,12)}<br>  --%>
		
		<%
			Date date=new Date();
			request.setAttribute("date", date);
		%>
			 <fmt:formatDate value="${date}" pattern="dd/mm/yyyy HH:mm:ss"/>
</body>
</html>