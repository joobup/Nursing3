/**
 * Created by horo on 2016/11/3.
 */
$(function () {
    $(".submenu li").click(function () {
        $(this).addClass("back-color").siblings().removeClass("back-color");
    })
})

function sideUrl(url) {
    var url = domainUrl+url;
    console.log(url)
    $.ajax({
        type: "get",
        url: url,
        success: function (data) {
            $("#main-show").html(data)
        }
    });
}
/*上传图片显示*/
function uploadShow(id) {
    $("#box").show();
    $('#test').diyUpload({
        url:domainUrl+'/uploads',
        success:function( data ) {
            console.info( data );
        },
        error:function( err ) {
            console.info( err );
        }
    });
    $("#box").css("background-color","#a0a3a3");
    var html='<input type="button" value="确认添加" onclick="upload('+id+')">'
    $("#test").append(html);
}
