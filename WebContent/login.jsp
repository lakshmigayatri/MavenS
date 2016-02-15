<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>

<s:form action="verify">

	<s:textfield name="userstrutsbean.username" label="Enter Username" /><br>
	<s:password name="userstrutsbean.password" label="Enter Password" /><br>
     
    <s:submit value="Click" align="center" /> 



</s:form>
</body>
</html>