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
     <form action="">
        ID:<input type="text" readonly="readonly" value="${param.id}" name="id"><br>
                 英雄:<input type="text" readonly="readonly" name="name"><br>
                 价格:<input type="text" readonly="readonly" name="price"><br>
                  阵营:<select name="cid" >
         
           </select><br>
              状态:<select name="status">
         <option value="0">未拥有</option>
         <option value="1">已拥有</option>
       </select><br>
       <button onclick="buy()">购买</button>
     </form>
     <script type="text/javascript">
       $.post("findC",function(arr){
    	   for ( var i in arr) {
			$("[name=cid]").append("<option value='"+arr[i].id+"'>"+arr[i].cname+"</option>")
		}
    	   $.post("findOne",{id:$("[name=id]").val()},function(re){
    		     $("[name=name]").val(re.name);
    		     $("[name=price]").val(re.price);
    		     $("[name=cid]").val(re.cid);
    		     $("[name=status]").val(re.status);
    	   },"json")
       },"json")
       function buy(){
    	   var id = $("[name=id]").val();
    	   $.post("buy",{id:id},function(re){
    		   if(re){
    			   alert("购买成功")
    			   history.go(4);
    		   }else{
    			   alert("购买失败")
    		   }
    	   },"json")
       }
   </script>
</body>
</html>