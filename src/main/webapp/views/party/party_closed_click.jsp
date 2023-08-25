<%@page import="member.model.vo.Member"%>
<%@page import="party.model.vo.Party"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Party party = (Party) request.getAttribute("party");
	Member member = (Member) request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>party_closed</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/slick.min.css">
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/slick-theme.min.css">
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/jquery-ui.min.css"/>
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/main.css"/>
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/review.css"/>
	<link rel="stylesheet" type="text/css" href="/comi/resources/css/party_closed_click.css"/>
	<script type="text/javascript" src="/comi/resources/js/lib/jquery.min.js"></script>
	<script type="text/javascript" src="/comi/resources/js/lib/slick.min.js"></script>
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
	<script type="text/javascript" src="/comi/resources/js/makeParty.js"></script>
	<script type="text/javascript" src="/comi/resources/js/party_closed_click.js"></script>
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
									<img src="/comi/resources/images/ss.png" />
								</div>
								<div id="article-profile-left">
									<div id="article-nickname">긴급SOS</div>
									<div id="article-region-name">순천시 왕조1동</div>
								</div>
							</div>
							<div class="article-profile-right">
								<div class="temperature-wrap">
									<span>신뢰도</span>
									<span class="text-color text-color-03" id="text-color-id">35</span>
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
				<h1 id="article-title">ex삼겹살 먹으러 가실 분!</h1>
				<p id="article-category">
				  모임 ∙
				  <span id="article-befordate">
					 1일 전
				  </span>
				</p>
				<div id="article-price-box">
					
					<div id="article-deposit">거치금 : 100,000원</div>
					<div id="article-bar-box">
						<span id="article-price-bar"></span>
						<span id="article-deposit-bar"></span>
					</div>
					<div id="article-price">가격 : 150,000원</div>

					<div class="article-people-box">
						<div id="article-people">모집인원 2명</div>
						<div id="article-people-price">인당 25,000원</div>
					</div>
				</div>
				<div id="article-detail">
					<p>
						ex삼겹살 먹으러 가고 싶어요. 사람은 3명 정도면 좋을 것 같고요.
						<br>제가 10만원 걸고 5만원만 둘이서 n빵하면 될것 같아요.
						<br>장소는 동작구 성대시장 앞에 삼겹살 집이에요~ 
						<br>7시까지 만나요~
					</p>
				</div>
				<p id="article-counts">
				  찜 23 ∙
					채팅 89
				   ∙
				  조회 817
				</p>
			</section>
			<!-- 게시글 end-->


			<!-- 게시글 리뷰-->
			<section id="review">

				<!--댓글 헤드-->
				<div class="review-head">
					<span class="review-head-title">54개의 댓글</span>
					<button type="button" class="review-head-refresh" alt="새로고침">
						<img src="/comi/resources/images/refresh.png">
					</button>
				</div>
				<!--댓글 헤드 end-->

				<!--댓글 쓰기-->
				<div class="review-write">
					<form>
						<fieldset>
							<legend class="u_vc">댓글 쓰기</legend>
							<div class="review-write-inner">
								
								<div class="review-write-profilearea">
									<div class="review-write-profile">
										<img src="/comi/resources/images/deafault.png" class="img-profile">
										<span class="write-name">donkihotex</span>
									</div>
								</div>

								<div class="review-write-area">
									<div class="review-write-area-inbox">
										<textarea title="댓글" class="review-write-textarea" id="review_write_textarea_1" rows="3" cols="30"></textarea>
										<label for="review_write_textarea_1" class="u_cbox_guide">
											다양한 의견이 서로 존중될 수 있도록 다른 사람에게 불쾌감을 주는 욕설, 혐오, 비하의 표현이나 타인의 권리를 침해하는 내용은 주의해주세요.  
											모든 작성자는 <em class="guide_emphasis">본인이 작성한 의견에 대해 법적 책임을 갖는다는 점</em> 유의하시기 바랍니다.
										</label>
									</div>
								</div>
								
								<div class="review-write-count-box">
									<div class="review-write-count">
										<strong class="review-write-count-num">0</strong>/
										<span class="review-write-count-total">300</span>
									</div>
									<button type="button" class="review-write-upload">
										<span class="review-write-upload-text">등록</span>
									</button>
								</div>
							
							</div>
						</fieldset>
					</form>
				</div>
				<!--댓글 쓰기 end-->

				<!--댓글 정렬 버튼-->
				<div class="review-sort">
					<button class="review-sort-btn sort-type-1 active">공감순</button>
					<button class="review-sort-btn sort-type-2">최신순</button>
					<button class="review-sort-btn sort-type-3">답글순</button>
				</div>
				<!--댓글 정렬 버튼 end-->

				<!--댓글 보기-->
				<div class="review-body">
					
					<!--댓글 첫번째-->
					<div class="review-body-container reviewbody-first">

						<div class="review-body-box">

							<div class="review-body-list">
								<div class="review-body-list-profile">
									<img class="review-body-list-profile-img" src="/comi/resources/images/profile.png">
									<div class="review-body-list-profile-box">
										<div class="review-body-list-name">마이프레셔스</div>
										<div class="review-body-list-date">2023.08.05 14:57</div>
									</div>
								</div>
								<div class="review-body-list-right">
									<button class="review-body-list-right-btn">
										<img class="review-body-list-right-btn-img" src="/comi/resources/images/profile.png">
									</button>
								</div>
							</div>

							<div class="review-body-read">
								<div class="review-body-read-text">
									이 편지는 1956년 영국에서 시작되었습니다. 
									이 편지를 받은 사람은 저주에 빠지게 됨니다.
									그래서 돈을 보내야 함니다.
									이 편지는 1956년 영국에서 시작되었습니다. 
									이 편지를 받은 사람은 저주에 빠지게 됨니다.
									그래서 돈을 보내야 함니다.내야 함니다. 내야 함니다.
								</div>
							</div>

							<div class="review-body-bottom">
								<button class="review-body-bottom-retext">
									답글 <b>1</b>
								</button>
								<div class="review-body-bottom-heartbox">
									<button class="review-body-bottom-heart">
										<img class="review-body-bottom-heart-img" src="/comi/resources/images/heart.png">
									</button>
									<span>0</span>
								</div>
							</div>

						</div>

					</div>
					<!--댓글 첫번째 end-->

					<!--댓글 두번째-->
					<div class="review-body-container reviewbody-second">

						<div class="review-body-box">

							<div class="review-body-list">
								<div class="review-body-list-profile">
									<img class="review-body-list-profile-img" src="/comi/resources/images/profile.png">
									<div class="review-body-list-profile-box">
										<div class="review-body-list-name">마이프레셔스</div>
										<div class="review-body-list-date">2023.08.05 14:57</div>
									</div>
								</div>
								<div class="review-body-list-right">
									<button class="review-body-list-right-btn">
										<img class="review-body-list-right-btn-img" src="/comi/resources/images/profile.png">
									</button>
								</div>
							</div>

							<div class="review-body-read">
								<div class="review-body-read-text">
									이 편지는 1956년 영국에서 시작되었습니다. 
									이 편지를 받은 사람은 저주에 빠지게 됨니다.
									그래서 돈을 보내야 함니다.
									이 편지는 1956년 영국에서 시작되었습니다. 
									이 편지를 받은 사람은 저주에 빠지게 됨니다.
									그래서 돈을 보내야 함니다.내야 함니다. 내야 함니다.
								</div>
							</div>

							<div class="review-body-bottom">
								<button class="review-body-bottom-retext">
									답글 <b>1</b>
								</button>
								<div class="review-body-bottom-heartbox">
									<button class="review-body-bottom-heart">
										<img class="review-body-bottom-heart-img" src="/comi/resources/images/heart.png">
									</button>
									<span>0</span>
								</div>
							</div>

						</div>

					</div>
					<!--댓글 두번째 end-->

					<!--댓글 쓰기-->
					<div class="review-write review-rewriting">
						<form>
							<fieldset>
								<legend class="u_vc">댓글 쓰기</legend>
								<div class="review-write-inner">
									
									<div class="review-write-profilearea">
										<div class="review-write-profile">
											<img src="/comi/resources/images/deafault.png" class="img-profile">
											<span class="write-name">donkihotex</span>
										</div>
									</div>

									<div class="review-write-area">
										<div class="review-write-area-inbox">
											<textarea title="댓글" class="review-write-textarea" id="review_write_textarea_2" rows="3" cols="30"></textarea>
											<label for="review_write_textarea_2" class="u_cbox_guide">
												다양한 의견이 서로 존중될 수 있도록 다른 사람에게 불쾌감을 주는 욕설, 혐오, 비하의 표현이나 타인의 권리를 침해하는 내용은 주의해주세요.  
												모든 작성자는 <em class="guide_emphasis">본인이 작성한 의견에 대해 법적 책임을 갖는다는 점</em> 유의하시기 바랍니다.
											</label>
										</div>
									</div>
									
									<div class="review-write-count-box">
										<div class="review-write-count">
											<strong class="review-write-count-num">0</strong>/
											<span class="review-write-count-total">300</span>
										</div>
										<button type="button" class="review-write-upload">
											<span class="review-write-upload-text">등록</span>
										</button>
									</div>
								
								</div>
							</fieldset>
						</form>
					</div>
					<!--댓글 쓰기 end-->


				</div>
				<!--댓글 보기 end-->

			</section>
			<!-- 게시글 리뷰 end-->
			
			<!-- 공유 모임 더 보기 -->
			<section class="article-party-share">
				<div class="article-party-share-box">
					<div class="article-party-share-title">인기공유모임</div>
					<a id="article-party-share-re" href="/comi/views/party/party_view.html">더보기</a>
				</div>

				<div class="main_portfolio" id="portf_box">
					
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