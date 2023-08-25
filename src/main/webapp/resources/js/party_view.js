/**
 * 파티 보여주는 페이지
 */

document.addEventListener("DOMContentLoaded", function(){
    /*
    //통신
    axios({
        url: '/comi/partysall?type=findParty', // 통신할 웹문서
        method: 'get', // 통신할 방식
        headers: { 'Content-Type': 'application/json' }
    }).then(function(response){
        var data = response.data;
        
        console.log('data : ' + data);
        var str = JSON.stringify(data);
        console.log('str : ' + str);
        var json = JSON.parse(str);
        console.log('json.list : ' + json.meid);
        
        //console.log('partyData : ' + partyData);

        for(var i in json.list) {
            console.log("i : " + i);
        }
        
    }).catch(function(error){
        console.log(error);
    });
    
    */

    var type = ($('title').eq(0).text() == 'party_view') ? 'findParty' : 'findReview';

    $.ajax({
        url : '/comi/partysall?type=' + type
        ,type : 'get'
        ,dataType : 'json'
        ,success : function(data){
            
            var str = JSON.stringify(data);
            var json = JSON.parse(str);
            var value = '';
            console.log('json : ' + json.list);

            var makeP = new makeParty();

            for(var i in json.list) {
                var obj = json.list[i];
                $('#portf_box').append(makeP.getTag(obj));
            }
        }
        ,error : function(jqXHR, textStatus, errorThrown){
            console.log('error : ' + jqXHR + ', '+ textStatus + ', ' + errorThrown);
        }
    })
});
