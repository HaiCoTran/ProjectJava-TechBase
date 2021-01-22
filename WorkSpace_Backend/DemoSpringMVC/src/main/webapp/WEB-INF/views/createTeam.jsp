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
    <h2>Tạo Team</h2>
	<form name="dpForm" action="${pageContext.request.contextPath}/SaveT" method="post" onsubmit="return validateForm()">
	  <label>ID:</label><br>
	  <input type="text" required="required" name="idteam"><br><br>
	  <label>Tên Team:</label><br>
	  <input type="text" required="required" name="tenteam"><br><br>
	  <label>Tên Phòng Ban:</label><br>
	  <select name="idpb" style="width: 177px;">
	  		  <option value="" disabled  selected="selected">--Chọn Phòng Ban--</option>
              <c:forEach var = "item" items="${dplist}">
                 <option value="${item.departmentid}">${item.departmentname}</option>
              </c:forEach>
      </select><br><br>
	 <input type="submit" value="Tạo">
	</form> 
  </article>
</section>

<footer>
  <p>Công ty ABC</p>
</footer>

</body>
<script type="text/javascript">
function validateForm() {
	  var pb = document.forms["dpForm"]["idpb"].value;
	  if (pb == "") {
	    alert("Vui lòng chọn phòng ban");
	    return false;
	  }
}
</script>
</html>
