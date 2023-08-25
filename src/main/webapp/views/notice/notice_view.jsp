<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, notice.model.vo.Notice, common.Paging, java.sql.Date" %>
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	Paging paging = (Paging)request.getAttribute("paging");
		int startPage = paging.getStartPage();
		int endPage = paging.getEndPage();
		int maxPage = paging.getMaxPage();
		int currentPage = paging.getCurrentPage();
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>notice</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/jquery-ui.min.css"/>
	<link rel="stylesheet" href="/comi/resources/css/main.css"/>
	<link rel="stylesheet" href="/comi/resources/css/review.css"/>
	<link rel="stylesheet" href="/comi/resources/css/question.css"/>
	<script type="text/javascript" src="/comi/resources/js/lib/jquery.min.js"></script>
	<script type="text/javascript" src="/comi/resources/js/common.js"></script>
	<script type="text/javascript" src="/comi/resources/js/question.js"></script>
</head>
<body>
	<!-- Header Section Begin -->
    <header id="header_view">    
    </header>
    <!-- Header Section End -->

	<!-- main -->
	<main class="main_wrapper">
		<div class="container">

			<div class="no-title">
				<br><br><span style="font-size: 20px;">공지사항</span>
			</div>
			
			<!--상단-->
			<div class="search-container">
				
				<div class="search-box question" style="text-align: center; margin: auto;">
					<button class="search-btn">
						<img src="/comi/resources/images/search_btn.png" class="search-image">
					</button>
					<input type="text" placeholder="제목을 입력해보세요." class="search-box-text" value="">
				</div>
			</div>
			<!--상단end-->

			<!--게시판-->
			<div style="width: 500px; border: 1px solid #ffed76; margin: 0 auto; text-align: center;">
				<!-- <h1>게시글 총 : <%= paging.getListCount()%></h1> 넘어오는거 확인 완료 -->
				<table>
					<tr><th>번호</th><th>제목</th><th>날짜</th><th>조회수</th><th>글쓴이</th></tr>
					<% for(Notice n : list){%>
					<tr>
						<td><a href="/comi/noticesel?nonum=<%=n.getNoNum()%>&page=<%= currentPage %>""></a><%= n.getNoNum() %></a></td>
						<td><a href="/comi/noticesel?nonum=<%=n.getNoNum()%>&page=<%= currentPage %>""><%= n.getNoTitle()%></a></td>
						<td><a href="/comi/noticesel?nonum=<%=n.getNoNum()%>&page=<%= currentPage %>""></a><%= n.getNoEnroll()%></a></td>
						<td><a href="/comi/noticesel?nonum=<%=n.getNoNum()%>&page=<%= currentPage %>""></a><%= n.getNoViews()%></a></td>
						<td><a href="/comi/noticesel?nonum=<%=n.getNoNum()%>&page=<%= currentPage %>""></a><%= n.getMeNum()%></a></td>
					</tr>
					<%}%>
				</table>
			</div>
			<hr>
			<!--게시판end-->

			<!--버튼박스-->
			<div class="no-container">
				<div class="no-btnbox">
					<button class="no-write-btn" id="write_btn" onclick="javascript:location.href='/comi/views/notice/notice_write.jsp'">글쓰기</button>
				</div>
				<div class="no-navbox">
					<button class="no-nav-btn prevnext-btn" id="no_nav_btn_prev">
						<img src="/comi/resources/images/prevBtn.png">
					</button>
					<div class="no-navbox-btnbox">
						<button class="no-nav-btn active" id="no_nav_btn_1">1</button>
						<button class="no-nav-btn" id="no_nav_btn_2">2</button>
					</div>
					<button class="no-nav-btn prevnext-btn" id="no_nav_btn_next">
						<img src="/comi/resources/images/nextBtn.png">
					</button>
				</div>
			</div>
			<!--버튼박스end-->
			
		</div>
	</main>
	

	<!-- Footer Section Begin -->
	<footer id="footer_view">	
	</footer>
	<!-- Footer Section End -->
</body>
</html>