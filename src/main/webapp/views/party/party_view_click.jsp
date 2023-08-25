<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="member.model.vo.Member"%>
<%@page import="party.model.vo.Party"%>
<%
	Party party = (Party) request.getAttribute("party");
	Member member = (Member) request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>party_view</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/slick.min.css">
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/slick-theme.min.css">
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/jquery-ui.min.css"/>
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/main.css"/>
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/party_view_click.css"/>
	<script type="text/javascript" src="/comi/resources/js/lib/jquery.min.js"></script>
	<script type="text/javascript" src="/comi/resources/js/lib/slick.min.js"></script>
	<script type="text/javascript" src="/comi/resources/js/lib/axios.min.js"></script>
	<script type="text/javascript" src="/comi/resources/js/common.js"></script>
	<script type="text/javascript">
    	var party = {
    			paid : Number(<%= "\"" + party.getPaNum() + "\"" %>)
    			,meid : Number(<%= "\"" + party.getMeNum() + "\"" %>)
    			,title : <%= "\"" + party.getPaTitle() + "\"" %>
    			,price : Number(<%= "\"" + party.getPaTotalAmount() + "\"" %>)
    			,deposit : Number(<%= "\"" + party.getPaDeposit() + "\"" %>)
    			,peoplePrice : Number(<%= "\"" + party.getPaPerAmount() + "\"" %>)
    			
    			,title : <%= "\"" + party.getPaTitle() + "\"" %>
    			,contents : <%= "\"" + party.getPaCon() + "\"" %>
    			,enroll : <%= "\"" + party.getPaEnroll() + "\"" %>
    			,modDate : <%= "\"" + party.getPaModDate() + "\"" %>
    			,delDate : <%= "\"" + party.getPaDelDate() + "\"" %>
    			,act : <%= "\"" + party.getPaAct() + "\"" %>
    			,views : Number(<%= "\"" + party.getPaViews() + "\"" %>)
    			,likes : Number(<%= "\"" + party.getPaLike() + "\"" %>)
    			,count : Number(<%= "\"" + party.getPaComCount() + "\"" %>)
				
    			,genderSet : <%= "\"" + party.getPaGenderSet() + "\"" %>
    			,location : <%= "\"" + party.getPaLocation() + "\"" %>
    			,totalNum : Number(<%= "\"" + party.getPaTotalNum() + "\"" %>)
    			,genderLimit : <%= "\"" + party.getPaGenderLimit() + "\"" %>
    			,phNum : Number(<%= "\"" + party.getPhNum() + "\"" %>)
				,category : <%= "\"" + party.getCatNum() + "\"" %>
    			
    		}
		var member = {
			menum : Number(<%= "\"" + member.getMeNum() + "\"" %>)
			,name : <%= "\"" + member.getMeName() + "\"" %>
			,id : Number(<%= "\"" + member.getMeId() + "\"" %>)
			,email : <%= "\"" + member.getMeEmail() + "\"" %>
			,phone : <%= "\"" + member.getMePhone() + "\"" %>
			,address : <%= "\"" + member.getMeAdd() + "\"" %>
			,gender : <%= "\"" + member.getMeGender() + "\"" %>
			,birthday : <%= "\"" + member.getMeBDay() + "\"" %>
			,enroll : <%= "\"" + member.getMeEnroll() + "\"" %>
			,nickname : <%= "\"" + member.getMeAka() + "\"" %>
			,like : <%= "\"" + member.getMeLike() + "\"" %>
			,photo : <%= "\"" + member.getMePhotoAdd() + "\"" %>
			,admin : <%= "\"" + member.getMeAdmin() + "\"" %>
			,ban : <%= "\"" + member.getMeBan() + "\"" %>
			,point : Number(<%= "\"" + member.getMePoint() + "\"" %>)
		}
    </script>
	<script type="text/javascript" src="/comi/resources/js/party_view_click.js"></script>
	<script type="text/javascript" src="/comi/resources/js/slick_set.js"></script>
</head>
<body>
    <!-- Header Section Begin -->
    <header id="header_view">    
    </header>
    <!-- Header Section End -->

	<!-- main -->
	<main class="main_wrapper">
		<div class="container side_margin_zero">

			<!-- 슬라이더 -->
			<div class="main_slider">

				<div id="slider_main">
					<div>
						<div class="slide_box">
							<img class="picture_box" src="/comi/resources/images/pic01.jpg" />
						</div>
					</div>

					<div>
						<div class="slide_box">
							<img class="picture_box" src="/comi/resources/images/pic01.jpg" />
						</div>
					</div>

					<div>
						<div class="slide_box">
							<img class="picture_box" src="/comi/resources/images/pic01.jpg" />
						</div>
					</div>
					
				  </div>
			</div>
		</div>

		<div class="container">
			<!-- 프로필 -->
			<section id="article-profile">
				<div class="article-profile-box">
					<a class="article-profile-link" href="#">
						<div class="space-between">
							<div class="display-align-items-center">
								<div id="article-profile-image-box">
									<img src="" />
								</div>
								<div id="article-profile-left">
									<div id="article-nickname"></div>
									<div id="article-region-name"></div>
								</div>
							</div>
							<div class="article-profile-right">
								<div class="temperature-wrap">
									<span>신뢰도</span>
									<span class="text-color text-color-03" id="text-color-id"></span>
								</div>
								<div class="meters">
									<div class="bar bar-color-03" id="bar-color-id"></div>
								</div>
								<div class="temperature-face">
									<img id="temperature-face-id" src="/comi/resources/images/launcher.png" />
								</div>
							</div>
						</div>
					</a>
				</div>
			</section>
			<!-- 프로필 end-->
			
			<!-- 게시글 -->
			<section id="article-description">
				<h1 id="article-title"></h1>
				<p id="article-category">
				  모임 ∙
				  <span id="article-befordate">
					
				  </span>
				</p>
				<p id="article-location">

				</p>
				<div id="article-price-box">
					
					<div id="article-deposit"></div>
					<div id="article-bar-box">
						<span id="article-price-bar"></span>
						<span id="article-deposit-bar"></span>
					</div>
					<div id="article-price"></div>

					<div class="article-people-box">
						<div id="article-people"></div>
						<div id="article-people-price"></div>
					</div>
				</div>
				<div id="article-detail">
					<p>
						
					</p>
				</div>
				<p id="article-counts">
					
				</p>
			</section>
			<!-- 게시글 end-->

			<!-- 채팅 리뷰-->
			<section id="chating">
				<!--채팅 헤드-->
				<div class="chating-head">
					<span class="chating-head-title">엔브레드톡</span>
				</div>
				<!--채팅 헤드 end-->
				
				<!--채팅 바디-->
				<div class="chating-body">
					<div class="chating-body-box" id="chating_box">

						

					</div>
				</div>

				<!--채팅 바디end-->

				<!--채팅 입력-->
				<div class="chating-input" id="chating-input-talk">
					<div class="chating-input-area">
						<textarea placeholder="엔브레드톡에 참여해보세요" class="chating-input-area-write"></textarea> 
						<button type="button" class="chating-post-stickerbtn">
							<img class="chating-post-sendbtn-image" src="/comi/resources/images/stickerbtn.png">
						</button>
					</div>
					<div class="chating-post-area">
						<button type="button" class="chating-post-sendbtn">
							<img class="chating-post-sendbtn-image" src="/comi/resources/images/sendbtn.png">
						</button>
					</div>
				</div>
				<!--채팅 입력 end-->
			</section>


			<!--참여 버튼 버튼을 클릭해야 채팅을 할 수 있음 - 참여하지 않으면 채팅기록만 볼수 있음-->
			<section class="chating-allow">
				<button class="chating-allow-btn">참여</button>
			</section>
			<!--참여 버튼 end-->


			<!-- 공유 모임 더 보기 -->
			<section class="article-party-share">
				<div class="article-party-share-box">
					<div class="article-party-share-title">인기공유모임</div>
					<a id="article-party-share-re" href="/comi/views/party/party_view.html">더보기</a>
				</div>

				<div class="main_portfolio">
					<a class="port_box flexBox" href="/comi/views/party/party_view_click.html">
						<div class="image featured">
							<img src="/comi/resources/images/pic01.jpg" alt="" />
						</div>
						<div class="text_box">
							<div class="port_box_title">카드 판매합니다.</div>
							<div class="port_box_textbox">
								<div class="port_box_price">가격 : <span class="price_all">230000</span></div>
								<div class="port_box_deposit">예치금 : <span class="price_deposit">130000</span></div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_address">서울시 동작구 상도로 15길</div>
								<div class="port_box_date">3일전</div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_text">인원 모집 3명</div>
								<div class="port_box_text">인당 5,000원</div>
							</div>
						</div>
					</a>
					<a class="port_box flexBox" href="/comi/views/party/party_view_click.html">
						<div class="image featured">
							<img src="/comi/resources/images/pic01.jpg" alt="" />
						</div>
						<div class="text_box">
							<div class="port_box_title">카드 판매합니다.</div>
							<div class="port_box_textbox">
								<div class="port_box_price">가격 : <span class="price_all">230000</span></div>
								<div class="port_box_deposit">예치금 : <span class="price_deposit">130000</span></div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_address">서울시 동작구 상도로 15길</div>
								<div class="port_box_date">3일전</div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_text">인원 모집 3명</div>
								<div class="port_box_text">인당 5,000원</div>
							</div>
						</div>
					</a>
					<a class="port_box flexBox" href="/comi/views/party/party_view_click.html">
						<div class="image featured">
							<img src="/comi/resources/images/pic01.jpg" alt="" />
						</div>
						<div class="text_box">
							<div class="port_box_title">카드 판매합니다.</div>
							<div class="port_box_textbox">
								<div class="port_box_price">가격 : <span class="price_all">230000</span></div>
								<div class="port_box_deposit">예치금 : <span class="price_deposit">130000</span></div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_address">서울시 동작구 상도로 15길</div>
								<div class="port_box_date">3일전</div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_text">인원 모집 3명</div>
								<div class="port_box_text">인당 5,000원</div>
							</div>
						</div>
					</a>
					<a class="port_box flexBox" href="/comi/views/party/party_view_click.html">
						<div class="image featured">
							<img src="/comi/resources/images/pic01.jpg" alt="" />
						</div>
						<div class="text_box">
							<div class="port_box_title">카드 판매합니다.</div>
							<div class="port_box_textbox">
								<div class="port_box_price">가격 : <span class="price_all">230000</span></div>
								<div class="port_box_deposit">예치금 : <span class="price_deposit">130000</span></div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_address">서울시 동작구 상도로 15길</div>
								<div class="port_box_date">3일전</div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_text">인원 모집 3명</div>
								<div class="port_box_text">인당 5,000원</div>
							</div>
						</div>
					</a>
					<a class="port_box flexBox" href="/comi/views/party/party_view_click.html">
						<div class="image featured">
							<img src="/comi/resources/images/pic01.jpg" alt="" />
						</div>
						<div class="text_box">
							<div class="port_box_title">카드 판매합니다.</div>
							<div class="port_box_textbox">
								<div class="port_box_price">가격 : <span class="price_all">230000</span></div>
								<div class="port_box_deposit">예치금 : <span class="price_deposit">130000</span></div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_address">서울시 동작구 상도로 15길</div>
								<div class="port_box_date">3일전</div>
							</div>
							<div class="port_box_textbox">
								<div class="port_box_text">인원 모집 3명</div>
								<div class="port_box_text">인당 5,000원</div>
							</div>
						</div>
					</a>
				</div>
			</section>
			<!-- 공유 모임 더 보기 end-->

		</div>
	</main>
	

	<!-- Footer Section Begin -->
	<footer id="footer_view">	
	</footer>
	<!-- Footer Section End -->
</body>
</html>