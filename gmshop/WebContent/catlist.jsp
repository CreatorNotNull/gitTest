<%@page import="cn.jbit.dto.ImageDTO"%>
<%@page import="cn.jbit.dto.ProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE	html PUBLIC	"-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html	xmlns="http://www.w3.org/1999/xhtml">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <title>贵美商城</title>
 <link rel="stylesheet"	type="text/css"	href="css/global.css"	/>
 <link rel="stylesheet"	type="text/css"	href="css/layout.css"	/>
 <script type="text/JavaScript">
 	function multiCheck(oThis){
 		var oInput=document.getElementsByTagName("input");
 		for (var i=1;i<oInput.length;i++){ 	
 				oInput[i].checked=oThis.checked;}
 	}
	</script>
</head>
<body>
<div id="container">
	<iframe id="header" runat="server" src="header.jsp" width="980" height="136" frameborder="0" scrolling="no"></iframe>
	<div class="catlist a_c">
	
		<%
		
			List<ProductDTO> resultList = (List<ProductDTO>)request.getAttribute("productByCategoryList");
			
		%>
		<ul class="w20p check">
			<h3><input type="checkbox" name="checkall" onclick="multiCheck(this)" />全选</h3>
			<%
				for(int i = 0 ; i < resultList.size() ; i ++){
					out.print("<li><input type='checkbox' /></li>");
				}
			%>
		</ul>
		<ul class="w20p">
			<h3>商品图片</h3>
			<%
			for(int i = 0 ; i < resultList.size() ; i ++){
				ProductDTO dto = resultList.get(i);
				ImageDTO imageDTO = null;
				if(null != dto.getImagesDTO()){
					 imageDTO = dto.getImagesDTO().iterator().next();
				} 
				out.print("<li><a href='showProduceDetailByIdAction.action?productQueryDTO.id="+dto.getId()+"'><img width=90 height=90 src='upload/"+imageDTO.getUrl()+"'/></a></li>");
			}
			%>
		</ul>
		<ul class="w50p info">
			<h3>商品名称</h3>
			<%
			for(int i = 0 ; i < resultList.size() ; i ++){
				ProductDTO dto = resultList.get(i);
				ImageDTO imageDTO = null;
				if(null != dto.getImagesDTO()){
					 imageDTO = dto.getImagesDTO().iterator().next();
				}
				out.print("<li><a href='showProduceDetailByIdAction.action?productQueryDTO.id="+dto.getId()+"'>"+dto.getName()+"</a><br /></li>");
			}
			%>
		</ul>
		<ul class="w10p price">
			<h3>价格</h3>
			<%
				for(int i = 0 ; i < resultList.size() ; i ++){
					out.print("<li>一口价：<br />"+resultList.get(i).getPrice()+"</li>");		
				}
			%>
		</ul>
	</div>
	<iframe id="footer"  src="footer.jsp" width="980" height="136" frameborder="0" scrolling="no"></iframe>
</div> <!--container end-->	
</body>
</html>
