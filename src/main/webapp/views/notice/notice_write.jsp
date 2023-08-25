<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
			<h1>공지사항 쓰는곳</h1>
			<!--공지사항 출력-->
			<div style="width: 500px; border: 1px solid #ffed76; margin: 0 auto; text-align: center; background-color: #ffed76;">
				<form action="/comi/noticeins" method="post">
                    <table>
                    <tr>
                        <th>제 목</th>
                        <td><input type="text" name="title" size="50"></td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td><input type="text" name="writer" readonly value="2" size="50"></td>
                    </tr>
                    <tr>
                        <th>내 용</th>
                        <td><textarea rows="5" cols="50" name="content"></textarea></td>
                    </tr>
                    <tr>
                        <th colspan="2">
                            <input type="submit" value="등록하기">
                            <input type="reset" value="작성취소">
                            <input type="button" value="목록"
                            onclick="javascript:location.href='/comi/views/noitce/notice_view.jsp'; return false;"> 
                            <!-- 목록 지금 404 에러 -->
                            
                        </th>

                    </tr>
                </table>
                </form>
			</div>
			<hr>
			<!--공지사항 end-->

			<!--버튼박스-->
			<div class="no-container">
				<div class="no-btnbox">
					<button class="no-write-btn" id="write_btn"></button>
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