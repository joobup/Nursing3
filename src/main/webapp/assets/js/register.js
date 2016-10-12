/**
 * Created by horo on 2016/10/10.
 */

// $(function () {
//     $("#newname").mouseleave(function () {
//         var value = $("#newname").val();
//         var valueyan =$("#nameyan").html();
//         if(value == ""){
//             $("#nameyan").html("请输入用户名").css("opacity","1")
//         }
//     })
// })
$(function () {
    $("#one-btn").click(function () {
        $("#one").css("display","none");
        $("#two").addClass("animated fadeIn").css("display","block");
        $("#jindu2").addClass("border-black");
        $("#jindu22").removeClass("title-num-n");
        $("#jindu222").removeClass("title-font-n")
    })
    $("#two-btn").click(function () {
        $("#two").css("display","none");
        $("#three").addClass("animated fadeIn").css("display","block");
        $("#jindu3").addClass("border-black");
        $("#jindu33").removeClass("title-num-n");
        $("#jindu333").removeClass("title-font-n")
    })
})
function register() {
    var loginTel = $("#loginTel").val();
    var loginPassword = $("#loginPassword").val();
    var loginName = $("#loginName").val();
    var url = domainUrl+"/login/register/user_register";
    var postData = {loginTel:loginTel,loginPassword:loginPassword,loginName:'loginName'}
    postAjax(url, false,postData,function () {
        alert("封装好了")
    })
}
/*第二步*/
function registerTwo() {

}
/*验证*/
/*
 * drag 1.0
 * create by tony@jentian.com
 * date 2015-08-18
 * 拖动滑块
 */
(function($){
    $.fn.drag = function(options){
        var x, drag = this, isMove = false, defaults = {
        };
        var options = $.extend(defaults, options);
        //添加背景，文字，滑块
        var html = '<div class="drag_bg"></div>'+
            '<div class="drag_text" onselectstart="return false;" unselectable="on">拖动滑块验证</div>'+
            '<div class="handler handler_bg"></div>';
        this.append(html);
        var handler = drag.find('.handler');
        var drag_bg = drag.find('.drag_bg');
        var text = drag.find('.drag_text');
        var maxWidth = drag.width() - handler.width();  //能滑动的最大间距

        //鼠标按下时候的x轴的位置
        handler.mousedown(function(e){
            isMove = true;
            x = e.pageX - parseInt(handler.css('left'), 10);
        });

        //鼠标指针在上下文移动时，移动距离大于0小于最大间距，滑块x轴位置等于鼠标移动距离
        $(document).mousemove(function(e){
            var _x = e.pageX - x;
            if(isMove){
                if(_x > 0 && _x <= maxWidth){
                    handler.css({'left': _x});
                    drag_bg.css({'width': _x});
                }else if(_x > maxWidth){  //鼠标指针移动距离达到最大时清空事件
                    $("#register-btn").css("background-color","#000000").css("pointer-events","auto");
                    $("#message-yanzheng").css("pointer-events","auto")
                    dragOk();
                }
            }
        }).mouseup(function(e){
            isMove = false;
            var _x = e.pageX - x;
            if(_x < maxWidth){ //鼠标松开时，如果没有达到最大距离位置，滑块就返回初始位置
                handler.css({'left': 0});
                drag_bg.css({'width': 0});
            }
        });

        //清空事件
        function dragOk(){
            handler.removeClass('handler_bg').addClass('handler_ok_bg');
            text.text('验证通过');
            drag.css({'color': '#fff'});
            handler.unbind('mousedown');
            $(document).unbind('mousemove');
            $(document).unbind('mouseup');
        }
    };
})(jQuery);


