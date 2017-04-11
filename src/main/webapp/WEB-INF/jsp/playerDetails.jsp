
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="afterloginheader.jsp"></jsp:include>
<marquee behavior="scroll" direction="left"><h1> ${playerName}</h1></marquee>
<table bordercolor="black" cellpadding="10px" bgcolor="FloralWhite"
	cellspacing="10px" align="center">

	<c:forEach var="player" items="${playerDetails}">
	<tr>
			<th>DisplayPicture</th>
			<td><img src="${player.displayPicture}" width="180px" height="180px"/></td>
		</tr>
		<tr>
			<th>Id</th>
			<td>${player.id}</td>
		</tr>
		<tr>
			<th>Name</th>
			<td>${player.name}</td>
		</tr>
		
		<tr>
			<th>Role</th>
			<td>${player.role}</td>
		</tr>
		<tr>
			<th>BattingStyle</th>
			<td>${player.battingStyle}</td>
		</tr>
		<tr>
		<tr>
			<th>BowlingStyle</th>
			<td>${player.bowlingStyle}</td>
		</tr>
		<tr>
			<th>Nationality</th>
			<td>${player.nationality}</td>
		</tr>
		<tr>
			<th>Dob</th>
			<td>${player.dob}</td>
		</tr>
		<tr>
			<th>TeamId</th>
			<td>${player.teamId}</td>

		</tr>
		<tr>

			<td><a href="teamList">click here to go back team list</a></td>

		</tr>
	</c:forEach>
</table>

<jsp:include page="footer.jsp"></jsp:include>