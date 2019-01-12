<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="static/js/jquery-3.3.1.js"></script>
<script>
	$(function(){
		$("form").submit(function(e){
			//一次获取所有表单数据
			var formData = new FormData(document,getElementById("form"));
			//通过Ajax提交数据
			$.ajax({
				url:"upload.jhtml",
				type:"POST",
				data:formData,
				//必须false才会自动加上正确的Content-Type
				contentType:false,
				//必须false才会避开jQuery对formdata的默认处理
				// XMLHttpRequest会对 formdata 进行正确的处理 
				processData:false,
				//若服务返回信息成功，该方法调用
				success:function(data){
					$("[id=status]").text(data);
				},
				error:function(){}
			});
			//阻止submit的默认提交事件，阻止submit表单提交到另一个servlet中
			return false;
		});
	});
</script>
</head>

<body>
	<form id="form" action="upload.jhtml" enctype="multipart/form-data"
		method="post">
		<table border="0px">
			<tr>
				<td>username:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>upload file:</td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td><span>status:</span> <span style="color: red" id="status"></span>
				</td>
				<td style="text-align: right;"><input type="submit"
					value="upload"></td>
			</tr>
		</table>
	</form>
</body>
</html>
