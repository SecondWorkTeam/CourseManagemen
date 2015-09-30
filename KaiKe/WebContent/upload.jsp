<%@ page import="util.Test"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
	<h1>导入Excel</h1>  
       <hr>  
       <form action="importExcel" method="post" enctype="multipart/form-data">  
           <input type="file" name="importExcel" id="importExcel">  
           <input type="submit" value="导入">   
       </form>  
	
</body>
</html>