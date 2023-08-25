/**
 * 파티 보여주는 페이지
 */
document.addEventListener("DOMContentLoaded", function(){
    console.log('partyDatalength : ' + partyData.length);
    
    makeElement = new MakeElement();
    makeElement.init();
    

    var observer = lozad();//레이지 로딩
    observer.observe();

});


function MakeElement(){
    
}

MakeElement.prototype = {
    init :function(){
        
        if(!chkArrayNull(partyData)) return;

        //데이터가 제대로 넘어오면 태그 생성
        for(var i=0; i<partyData.length; i++) {
            this.insert(this.getTag(i));
        }
    }
    ,
    getTag : function(index){
        var data = partyData[index];
        if(!chkJsonNull(data)) return;

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
        if(index >= 10) {
            lazTag = 'class="lozad" data-src="';
        }

        //종료된 모임
        var endTag = (data.act = 'y') ? '' : '<div class="party_closed_bottom">종료된 모임이에요.</div>';

        //내보낼 태그
        var tag = `
        <a class="port_box flexBox" href="` + url + `">
            <div class="image featured">
                <img ` + lazTag + imgSrc + `" alt="" />
            </div>
            <div class="text_box">
                <div class="port_box_title">`+ data.title +`</div>
                <div class="port_box_textbox">
                    <div class="port_box_price">가격 : <span class="price_all">` + data.price + `</span></div>
                    <div class="port_box_deposit port_box_text_right">예치금 : <span class="price_deposit">` + data.deposit + `</span></div>
                </div>
                <div class="port_box_textbox">
                    <div class="port_box_address">` + data.location + `</div>
                    <div class="port_box_date port_box_text_right">` + data.enroll + `</div>
                </div>
                <div class="port_box_textbox">
                    <div class="port_box_text">인원 모집 ` + data.totalNum + `명</div>
                    <div class="port_box_text port_box_text_right">인당 ` + comma(data.peopePrice) + `원</div>
                </div>
                `+endTag+`
            </div>
        </a>
        `
        //console.log(tag);
        return tag;
    }
    ,
    insert : function(tag){
        $('#portf_box').append(tag);
    }


}


