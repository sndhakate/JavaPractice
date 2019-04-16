<font color=red>
<%
if(request.getAttribute("msg")!=null)
out.println(request.getAttribute("msg"));
%>
</font>

<form action="LoginServlet">
UserName: <input type="text" name="username"/>
PassWord: <input type="text" name="password"/>
Submit : <input type="submit" value="Click Me....................."/>
</form>