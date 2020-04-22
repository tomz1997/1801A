<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="list" method="post">
     <select name="cid">
         <option>请选择</option>
     </select>
     <select name="status">
         <option>请选择</option>
         <option value="1">已拥有</option>
         <option value="0">未拥有</option>
     </select>
     价格区间:<input type="text" name="start">---<input type="text" name="end">
     <input type="submit" value="查询">
    </form>
     <a href="add.jsp">
       <input type="button" value="新增">
     </a>
   <table>
      <tr>
         <td></td>
         <td>ID</td>
         <td>英雄</td>
         <td>阵营</td>
         <td>价格(钻石)</td>
         <td>状态</td>
         <td>上线时间</td>
         <td>操作</td>
      </tr>
      <c:forEach items="${plist.getList()}" var="h">
      <tr>
          <td><input type="checkbox"></td>
         <td>${h.id}</td>
         <td>${h.name}</td>
         <td>${h.cname}</td>
         <td>${h.price}</td>
         <td>${h.status==0?"未拥有":"已拥有"}</td>
         <td>${h.uptime}</td>
         <td>
            <a href="real.jsp?id=${h.id}">详情</a>
            <a href="buy.jsp?id=${h.id}">购买</a>
         </td>
       </tr>  
      </c:forEach>
      <tr>
        <td colspan="8">
        <a href="list?pageNum=${plist.getFirstPage()}">首页</a>
        <a href="list?pageNum=${plist.getLastPage()}">上一页</a>
        <a href="list?pageNum=${plist.getNextPage()}">下一页</a>
        <a href="list?pageNum=${plist.getEndRow()}">尾页</a>
          ${plist.getPageNum()} /${plist.getPages()}
        </td>
      </tr>
   </table>
   <script type="text/javascript">
       $.post("findC",function(arr){
    	   for ( var i in arr) {
			$("[name=cid]").append("<option value='"+arr[i].id+"'>"+arr[i].cname+"</option>")
		}
       },"json")
   </script>
</body>
</html>