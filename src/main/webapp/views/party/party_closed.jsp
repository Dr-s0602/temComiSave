<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="party.model.vo.Party"%>
<%@page import="java.util.ArrayList"%>
<% ArrayList<Party> partyList = (ArrayList<Party>) request.getAttribute("partyList"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>party_closed</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" type="text/css" href="/comi/resources/css/lib/jquery-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="/comi/resources/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="/comi/resources/css/party_view.css"/>
    <link rel="stylesheet" type="text/css" href="/comi/resources/css/party_view_click.css"/>
    <script type="text/javascript" src="/comi/resources/js/lib/jquery.min.js"></script>
    <script type="text/javascript" src="/comi/resources/js/lib/axios.min.js"></script>
    <script type="text/javascript" src="/comi/resources/js/lib/lozad.min.js"></script>
    <script type="text/javascript" src="/comi/resources/js/common.js"></script>
    <script type="text/javascript">
    	var partyData = [];
        <%= partyList.size() %>
    	<% for(Party party : partyList) { %>
    		partyData.push({
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
    			)
    			
    		})
    	<% } %>
    	
    </script>
    <script type="text/javascript" src="/comi/resources/js/party_view.js"></script>
</head>
<body>
    <!-- Header Section Begin -->
    <header id="header_view">    
    </header>
    <!-- Header Section End -->

    <!-- main -->
    <main class="main_wrapper">
        <div class="container">
            <div class="search-container">
                <div class="search-box">
                    <button class="search-btn">
                        <img src="/comi/resources/images/search_btn.png" class="search-image">
                    </button>
                    <input type="text" placeholder="예전에 진행되었던 공유 모임을 검색해보세요." class="search-box-text" value="">
                </div>
                <div class="search-classify">
                    <span class="search-classify-title">분류</span>
                    <select class="search-classify-select" onchange="changeCategory(this.value);">
                        <option value="all" selected>전체</option>
                        <option value="meeting">모임</option>
                        <option value="group">공구</option>
                        <option value="rental"> 렌탈</option>
                        <option value="game">게임</option>
                        <option value="etc"> 기타</option>
                    </select>

                    <select class="search-classify-select" onchange="changeSort(this.value);">
                        <option value="accuracy" selected>정확도순</option>
                        <option value="interest">관심순</option>
                        <option value="recent">최신순</option>
                    </select>

                </div>
            </div>

            <div class="main_portfolio" id="portf_box">
                
                
            </div>

            
        </div>
    </main>
    

    <!-- Footer Section Begin -->
    <footer id="footer_view">	
    </footer>
    <!-- Footer Section End -->
</body>
</html>