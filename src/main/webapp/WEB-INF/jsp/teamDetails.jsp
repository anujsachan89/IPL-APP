
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="afterloginheader.jsp"></jsp:include>
<marquee behavior="scroll" direction="left"><h1> ${teamName} team information</h1></marquee>
<table  bordercolor="black" cellpadding="5px" bgcolor="WhiteSmoke "
	cellspacing="5px" align="center">

	<c:forEach var="team" items="${teamDetails}">
		<tr>
			<th>Id:</th>
			<td>${team.id}</td>
	    </tr>
	    <tr>
	         <th>Name:</th>
			<td>${team.name}</td>
		</tr>
		<tr>	
		<th>Coach:</th>
			<td>${team.coach}</td>
			</tr>
			<tr>
			<th>Owner</th>
			<td>${team.owner}</td>
			</tr>
			<tr>
			<th>Captain</th>
			<td>${team.captain}</td>
			</tr>
			<tr>
			<th>Home Venue:</th>
			<td>${team.homeVenue}</td>
			</tr>
			<tr>
			<td><a href="<c:url value="playerList"/>?teamId=${team.id}&teamName=${team.name}">Click here to view all players</a></td>
				
		</tr>
	</c:forEach>
</table>
<jsp:include page="footer.jsp"></jsp:include>