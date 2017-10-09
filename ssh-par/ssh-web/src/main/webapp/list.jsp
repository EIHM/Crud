<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    <script src="js/jquery-1.7.2.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function(){
				
				$(".del").click(function(){
				
					 var lastname=$(this).next(":hidden").val();
					
					var flag=confirm("确定要删除"+lastname+"吗");
					
					if(flag){
					var tr=$(this).parent().parent();
					
					var url1=this.href;
					
					$.ajax({
						
						type:"get",
						url:url1,
						success:function(data){
							
							tr.remove();
						}
						
						
					});
					
					} 
					return false;
				});
				
				
				
			});
			
		</script>
	

  </head>
  
  <body>
    
   
    
    
     
                <table border="1px" cellspacing="1px" cellpadding="1px">
                   <tr>
                    
                    <th>deptname</th>
                    <th>id</th>
                    <th>lastname</th>
                    <th>email</th>
                    <th>birth</th>
                    <th>createtime</th>
                   </tr>
                  
                  <s:iterator value="#lists" var="objarr">
                   <tr>
                    
                    <td><s:property value="#objarr[0].deptname"/></td>
                    <td><s:property value="#objarr[1].id"/></td>
                    <td><s:property value="#objarr[1].lastname"/></td>
                    <td><s:property value="#objarr[1].email"/></td>
                    <td><s:property value="#objarr[1].birth"/></td>
                    <td><s:property value="#objarr[1].createtime"/></td>
                    <td><a class="del" href="action/EmpAction_delemp?id=<s:property value="#objarr[1].id"/>" >删除</a>
                         <input type="hidden" value="<s:property value="#objarr[1].lastname"/>">                   
                    </td>
                    <td><a class="update" href="action/EmpAction_updateemp?id=<s:property value="#objarr[1].id"/>" >修改</a>
                                        
                    </td>
                   </tr>                
                  </s:iterator>
                  
                  
                </table>
    
  </body>
</html>
