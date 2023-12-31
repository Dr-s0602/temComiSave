var common
document.addEventListener("DOMContentLoaded", function(){
    
    common = new Common();

    var header = document.querySelector('#header_view');
    fetch('/comi/views/common/header.html')
    .then(res => res.text())
    .then(data => header.innerHTML = data)
    .then(function(response){
        //console.log('response : ' + response);
        listAddClass();
    });
    
    var footer = document.querySelector('#footer_view');
    fetch('/comi/views/common/footer.html')
    .then(res => res.text())
    .then(data => footer.innerHTML = data);
    
});

function listAddClass(){
    switch ($('title').eq(0).text()) {
        case 'party_make':
            $('.header_menu .header_text ul li').eq(0).addClass('active');
            break;
        case 'party_view':
            $('.header_menu .header_text ul li').eq(1).addClass('active');
            break;
        case 'party_closed':
            $('.header_menu .header_text ul li').eq(2).addClass('active');
            break;
        case 'question':
            $('.header_menu .header_text ul li').eq(3).addClass('active');
            break;
        default:
            break;
    }
}

function Common() {
}

Common.prototype = {
    comma : function (num) {
        var str = String(num);
        var str2 = str.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
        console.log('str2 : ' + str2);
        return (str2 == undefined || str2 == null || str2 == 'undefined') ? '0' : str2;
    },
    chkArrayNull : function (arr) {
        if(arr !== null && arr !== undefined && arr && arr.length > 0) {
            return true;
        }
        return false;
    },
    chkJsonNull : function (json) {
        if(json !== null && json !== undefined && json && Object.keys(json).length > 0) {
            return true;
        }
        return false;
    }
}




