

document.addEventListener("DOMContentLoaded", function(){
    
    partyView = new PartyView();
    partyView.init();
    partyView.buttonEvent();

});


function PartyView() {
}

PartyView.prototype = {
    init : function(response) {
        if(!chkJsonNull(party) || !chkJsonNull(member)) return;
        var imgUrl = party.phNum;
        console.log('member : ' + member);
        var nickname = member.nickname;
        var region = member.address;
        var location = party.location;
        var beleiveNum = member.like;
        var belImgUrl = "/komi/resources/images/launcher.png";

        var title = party.title;
        var category = party.category;
        var befordate = 1;
        var price = party.price;
        var deposit = party.deposit;
        var barPercent = (deposit == 0) ? 0 : deposit/price * 100;
        var people = party.totalNum;
        var people_price = (price - deposit)/people;
        var detail = party.contents;

        var callNum = party.likes;
        var chatNum = party.count;
        var selecNum = party.views;

        //프로필
        $("#article-profile-image-box img").attr("src", imgUrl);
        $("#article-nickname").text(nickname);
        $("#article-region-name").text(region);
        
        //신뢰도
        $("#bar-color-id").css({"width" : beleiveNum+"%"})
        $("#temperature-face-id").attr("src", belImgUrl);
        $("#text-color-id").text(beleiveNum+"%");

        //게시글 타이틀
        $("#article-title").text(title);
        $("#article-category").text(category);
        $("#article-befordate").text(befordate + "일 전");
        if(location) $("#article-location").text('장소 : ' + location);

        //총금액
        $("#article-price").text("가격 : " + comma(String(price)) + "원");

        //거치금
        $("#article-deposit").text("예치금 : " + comma(String(deposit)) + "원");

        //막대 크기
        $("#article-deposit-bar").css({"width": barPercent + "%"});

        //인원
        $("#article-people").text("모집인원 " + people + "명");
        $("#article-people-price").text("인당 " + comma(String(people_price)) + "원");

        //게시글 내용
        $("#article-detail p").html(detail);

        //하단 
        $("#article-counts").text("찜 " + callNum + " ∙ 채팅 " + chatNum + " ∙ 조회 " + selecNum);

    }
    ,
    buttonEvent : function(){
        

        //프로필
        $("#article-profile-image").on("click", function(){
            
        })
        
    }
}

function ComentsView(){

}

ComentsView.prototype = {
    insert : function(index){
        //나의 턴일때 아닐때 구분

        //통신
        axios({
            url: '/comi/partych', // 통신할 웹문서
            method: 'get', // 통신할 방식
            data: { // 인자로 보낼 데이터
                partyid : 121
            },
            headers: { 'Content-Type': 'application/json' }
        }).then(function(response){
            console.log('data : ' + response.data);

            if(member.id == response.data.id) {
                //내 메시지

                $('#chating_box').append(this.message());
            }else{
                //다른 사람 메시지
                $('#chating_box').append(this.message());
            }

            
        }).catch(function(error){
            console.log(error);
        });


        

    }
    ,
    message : function(){
        var tag = 
        `
        <div class="chating-body-msg">
            <div class="chating-body-msg-w">
                <div class="chating-body-msg-profile">
                    <img class="chating-body-msg-profile-img" src="/komi/resources/images/profile.png">
                    <div class="chating-body-msg-profile-name">`+nickname+`</div>
                </div>
                <div class="chating-body-msg-box">
                    <div class="chating-body-msg-box-read bubble-msg">`
                        +contents+
                    `</div>
                    <div class="chating-body-msg-box-date">
                        `+date+`
                    </div>
                    <button class="chating-body-msg-box-pop">
                        <img class="chating-body-msg-box-pop-img" src="./komi/resources/images/msg_pop_img.png">
                    </button>
                </div>
            </div>
        </div>`;

        
    }
}