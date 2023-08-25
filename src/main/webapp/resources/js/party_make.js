
var ZOOM_RATE = 1;
var globalClick = {
    x: 0,
    y: 0
};

document.addEventListener("DOMContentLoaded", function(){

    //드래그
    $('#view-price-cursor').draggable({
        start : function(e, ui) {
            e.clientX;
            e.clientY;
        },
        drag : function(e, ui) {

        },
        stop : function() {
            
        }
    })

    //드롭
    $('#view-price-cursor').droppable({
        drop : function(e, ui) {

        }
    })
});