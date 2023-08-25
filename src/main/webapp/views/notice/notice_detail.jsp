<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="notice.model.vo.Notice"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
	int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<main class="main_wrapper">
		<div class="container">

			<div class="no-title">
				<br><br><span style="font-size: 20px;">공지사항 상세</span>
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
			<h1><%=notice.getNoNum()%> 번째 공지글 입니다.</h1>
			<!--공지사항 출력-->
			<div style="width: 500px; border: 1px solid #ffed76; margin: 0 auto; text-align: center;">
				<tr>
					<th width="120">제 목</th>
					<td><%=notice.getNoTitle()%></td>
				</tr>
				<tr>
					<th width="120">작 성 자</th>
					<td><%= notice.getMeNum()%></td>
				</tr>
				<tr>
					<th width="120">등록날짜</th>
					<%if(notice.getNoModDate() == null){%>
						<td><%= notice.getNoEnroll()%></td>
					<%}else{%>
						<td><%= notice.getNoModDate()%></td>
					<%}%>
				</tr>
				<tr>
					<th width="120">첨부파일</th>
					<td></td>
				</tr>
				<tr>
					<th width="120">내 용</th>
					<td><%= notice.getNoCon()%></td>
				</tr>
				<tr>
				
			</div>
			<hr>
			<!--공지사항 end-->

			<!--버튼박스-->
			<div class="no-container">
				<div class="no-btnbox">
					<button class="no-write-btn" id="write_btn" onclick="javascript:location.href='/comi/nomovepage?nonum=<%=notice.getNoNum()%>'">수정하기</button>
					<button class="no-write-btn" id="delete_btn" onclick="javascript:location.href='/comi/noticedel?nonum=<%=notice.getNoNum()%>'">삭제하기</button>
				</div>
				<div class="no-navbox">
					<button class="no-nav-btn prevnext-btn" id="no_nav_btn_prev">
						<img src="/comi/resources/images/prevBtn.png">
					</button>
					<div class="no-navbox-btnbox">
						<button class="no-nav-btn active" id="no_nav_btn_1">페이징 들어갈 부분</button>
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