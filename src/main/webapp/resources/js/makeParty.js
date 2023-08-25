/**
 * 파티 생성
 */
function makeParty(){
    this.count = 0;
}

makeParty.prototype = {
    setSlide : function(data){
        if(!common.chkJsonNull(data)) return;

        var imgUrl = '/comi/resources/images/pic01.jpg';
        var tag = `
        <div>
            <div class="slide_box">
                <img class="picture_box" src="` + imgUrl + `" />
            </div>
        </div>
        `;
    },
    getTag : function(data){
        
        if(!common.chkJsonNull(data)) return;
        console.log('==data : ' + data);

        //클릭 시 url
        var url = '/comi/partysel?panum='+data.paid+'&act='+data.act;
        
        //이미지
        var imgSrc = String(data.phNum);
        console.log('imgSrc : ' + imgSrc+ '  imgSrc.legnth : ' + imgSrc.legnth);
        if(imgSrc === undefined || imgSrc === null || imgSrc.legnth === undefined || imgSrc.legnth < 10) {
            imgSrc = '/comi/resources/images/empty.png';
        }
        
        //레이지 로딩
        var lazTag = 'src="';
        if(this.count >= 10) {
            lazTag = 'class="lozad" data-src="';
        }
        this.count ++;

        //종료된 모임
        var endTag = (data.act = 'y') ? '' : '<div class="party_closed_bottom">종료된 모임이에요.</div>';
        //내보낼 태그
        var tag = `
        <a class="port_box flexBox" href="` + url + `">
            <div class="image featured">
                <img ` + lazTag + imgSrc + `" alt="" />
            </div>
            <div class="text_box">
                <div class="port_box_title">`+ decodeURIComponent(data.title).replace(/\+/gi, " ") +`</div>
                <div class="port_box_textbox">
                    <div class="port_box_price">가격 : <span class="price_all">` + common.comma(data.price) + `</span></div>
                    <div class="port_box_deposit port_box_text_right">예치금 : <span class="price_deposit">` + common.comma(data.deposit) + `</span></div>
                </div>
                <div class="port_box_textbox">
                    <div class="port_box_address">` + data.location + `</div>
                    <div class="port_box_date port_box_text_right">` + data.enroll + `</div>
                </div>
                <div class="port_box_textbox">
                    <div class="port_box_text">인원 모집 ` + data.totalNum + `명</div>
                    <div class="port_box_text port_box_text_right">인당 ` + common.comma(data.peopePrice) + `원</div>
                </div>
                `+endTag+`
            </div>
        </a>
        `
        //console.log(tag);
        return tag;
    }
}


