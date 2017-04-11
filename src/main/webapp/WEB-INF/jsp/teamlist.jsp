
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
tr{
float:left;
padding-left:75px; 
}
</style>

<jsp:include page="afterloginheader.jsp"></jsp:include>
<marquee behavior="scroll" direction="left"><h1>IPL 2016 TEAM LIST</h1></marquee>

<table  bordercolor="black" cellpadding="10px"
	cellspacing="10px" align="left">
	<c:forEach var="team" items="${teamInfo}">
		<tr>
			<td><a href="<c:url value="teamDetails"/>?teamName=${team.name}"><img src="${team.logo}" width="280px" height="280px"/></a></td>
				
				</tr>
	</c:forEach>
</table>
<jsp:include page="footer.jsp"></jsp:include>