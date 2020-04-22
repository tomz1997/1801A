<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<h1>购买</h1>
     <form action="add" method="post">
                 英雄:<input type="text" name="name"><br>
                 价格:<input type="text" name="price"><br>
                  阵营:<select name="cid">
         
           </select><br>
              状态:<select name="status">
         <option value="0">未拥有</option>
         <option value="1">已拥有</option>
       </select><br>
       <input type="submit" value="添加">
     </form>
 <script type="text/javascript">
       $.post("findC",function(arr){
    	   for ( var i in arr) {
			$("[name=cid]").append("<option value='"+arr[i].id+"'>"+arr[i].cname+"</option>")
		}
       },"json")
   </script>
</body>
</html>