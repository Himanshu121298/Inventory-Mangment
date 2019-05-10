<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Project | Login</title>
  
  <script
  src="https://code.jquery.com/jquery-3.3.1.js"
   ></script>
  
      <link rel="stylesheet" href="css1/style.css">
<link rel="stylesheet" type="text/css" href="style1.css">
  
</head>

<body>

<div class="track">
    <div class="square"></div>
    <div class="square"></div>
</div>	  
	<div class="login-reg-panel">
		
							
		<div class="white-panel">
			<div class="login-show">
                            <form action="Login" method="post">
				<h1 id="h">LOGIN</h1>
                                <div><h3 style="color:red; font-size: 18px; margin-left:4%; "><%if (request.getParameter("info") != null) {
                            out.println(request.getParameter("info"));
                   out.println("<script src='https://code.jquery.com/jquery-1.9.1.min.js'></script>");
            out.println("<script src='https://unpkg.com/sweetalert/dist/sweetalert.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('LOGIN ERROR', 'USERNAME OR PASSWORD ARE INCORRECT', 'error');");
            out.println("});");
            out.println("</script>");
}%></h3></div>
				<input type="text" placeholder="Email" name="username" required>
                                <input type="password" placeholder="Password" name="password" required>
				<input type="submit" value="Login">
                            </form>
			</div>
		</div>
	</div>
    

 <script type="text/javascript" src="js1/style.js"></script>
  



  <!--#2196f3  #fff   #2196f3   linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b,#03a9f4)-->  

</body>

</html>
