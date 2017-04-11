
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
tr{
float:left;
padding-left:95px; 
}
</style>

<jsp:include page="afterloginheader.jsp"></jsp:include>
<marquee behavior="scroll" direction="left"><h1> IPL 2016 ${teamName} Team Player List</h1></marquee>
<table  bordercolor="black" cellpadding="10px"
	cellspacing="10px" align="left">
	<c:forEach var="player" items="${playerInfo}">
		<tr>
			<td><a href="<c:url value="playerDetails"/>?playerName=${player.name}"><img src="${player.displayPicture}" width="250px" height="200px"/></a></td>
			
				</tr>
	</c:forEach>
</table>
<jsp:include page="footer.jsp"></jsp:include>