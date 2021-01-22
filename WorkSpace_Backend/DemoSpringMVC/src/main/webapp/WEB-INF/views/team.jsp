<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Team</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #666;
  padding: 10px;
  text-align: center;
  font-size: 10px;
  color: white;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 5px;
  text-align: center;
  color: white;
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
   article {
    width: 100%;
    height: auto;
  }
}

#team {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 40%;
  margin: 0px auto;
}

#team td, #team th {
  border: 1px solid #ddd;
  padding: 8px;
}

#team tr:nth-child(even){background-color: #f2f2f2;}

#team tr:hover {background-color: #ddd;}

#team th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #666;
  color: white;
}
</style>
</head>
<body>
<header>
  <h2>Công Ty ABC</h2>
</header>

<section>
  <article>
    <h1>Danh sách team</h1>
    	<table id="team">
		  <tr>
		    <th>ID</th>
		    <th>Tên Team</th>
		     <th>ID Phòng Ban</th>
		  </tr>
		  <c:forEach items="${teamlist}" var="objTeam">
		   <tr> 	
			<td>${objTeam.teamid}</td>
			<td>${objTeam.teamname}</td>
			<td>${objTeam.departmentid}</td>
		   </tr>
		 </c:forEach>
		 <a href="${pageContext.request.contextPath}/Create Team">Tạo mới</a>
	</table>
  </article>
</section>

<footer>
  <p>Công ty ABC</p>
</footer>

</body>
</html>
