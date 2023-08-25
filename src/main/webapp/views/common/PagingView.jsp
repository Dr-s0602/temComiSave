<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
        <%if(currentPage <= 1){%>
            [맨처음]&nbsp;
        <%}else{ //currentPage > 1 %>  
            <a href="/first/blist?page=1">[맨처음]&nbsp;</a>
        <%}%>

        <%-- 이전 페이지 그룹으로 이동--%>
        <%if((currentPage - 10) < startPage && (currentPage -10) > 1 ){ %>
            <a href="/first/blist?page=<%= startPage-10 %>"> [이전]&nbsp; </a>
        <% }else{ %>  
            [이전]&nbsp;
        <%}%>



        <%for(int p = startPage; p<=endPage; p++){
           	 if(p==currentPage){ 
           		 
      %>
            <font color="blue" size="4"><b><%=p%></b></font>
        	<% }else{%>
            <a href="/first/blist?page=<%= p%>"><%= p%></a>
       		 <%}}%>
     
        
        
        

        <%-- 다음 페이지 그룹으로 이동--%>

        <%if((currentPage + 10) > endPage && (currentPage + 10) < maxPage ){ //다음그룹이 있다면  %>
            <a href="/first/blist?page=<%= endPage+10%>">[다음]&nbsp;</a>
        <%}else{ //다음그룹이 없다면 > 1 %>  
            [다음]&nbsp;
        <%}%>

        <%if(currentPage >= maxPage){%>
            [맨끝]&nbsp;
        <%}else{ //currentPage < maxPage %> 
            <a href="/first/blist?page=<%= maxPage %>">[맨끝]&nbsp;</a>
        <% } %>
    </div>
</body>
</html>