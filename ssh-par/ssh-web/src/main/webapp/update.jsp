<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
 
    
     <s:form action="EmpAction_updateempt" method="post" namespace="/action" >
              <s:hidden name="id"></s:hidden>
               <s:textfield  name="lastname" key="lastname" disabled="true"></s:textfield>
               <s:hidden name="lastname"></s:hidden>
                <s:textfield  name="birth" key="birth"></s:textfield>
                 <s:textfield  name="email" key="email"></s:textfield>
                
              <s:select list="#listd" key="department" name="deptid" listKey="deptid" listValue="deptname" headerValue="--请选择--"> 
                 </s:select> 
              
                 <s:submit value="提交"></s:submit>
              
              </s:form>
   
   
  </body>
</html>
