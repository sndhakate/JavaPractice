Login details successfully enterd.....

<table border="2">
  <%
String [] employee = (String[]) request.getAttribute("data");
  
for (int i = 0; i < employee.length; i++) {
	%>
	<tr>
	<td>
	<input type="checkbox"/>
	</td>
	<td>
	<% 
	out.println(employee[i]);
	%>
	</td>
		<td><input type="button" value="edit"/></td>
		<td><input type="button" value="update"/></td>
		<td><input type="button" value="delete"/></td>
	
	
	</tr>
	<%	
	}
%>
</table>