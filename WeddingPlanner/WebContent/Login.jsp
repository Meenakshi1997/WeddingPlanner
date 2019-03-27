<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="background-image:url(images\\bg-body.jpg); height:100%; width:100%">
<jsp:include page="Navbar.jsp"/>

<br/><br/><br/>
<div class="container">
<%--
 <%
	Object msg=request.getAttribute("errorMsg");
   if(msg!=null){
	   %>
	   		<div class="alert alert-danger">
	   			Email or Password is incorrect...
	   		</div>
	   <%
   }
 %>	
  --%>

<c:if test="${not empty errorMsg}">
	<div class="alert alert-danger">
		${errorMsg}
	</div>
</c:if>  	
<div style="image-src:url(images\\separator.png)"></div>
  <div align="center"><h2>Login Form</h2></div>
  <form action="login" method="post" style="width:300px; margin-left:200px;">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div> 
    <button type="submit" class="btn btn-default">Login</button>
  </form>
</div>
<div style="margin-top:200px">
</div>
</div>

