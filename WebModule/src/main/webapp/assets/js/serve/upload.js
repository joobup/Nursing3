/**
 * Created by Administrator on 2016/11/14.
 */
$(function () {
    findAll();
})
var serveNamePull='';
function findAll() {
    var url = domainUrl + '/serve/service_pack/findAll';
    var getData = {
        currentPage: currentPage, limit: 1000
    }
    var html='';
    var img;
    getAjax(url,false,getData,function (data) {

        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        for(var i = 0; i< num ; i++){
            if(data.aaData[i].serveDetailed.richTextHeadPicture == null){
                img = '' + domainImg + '/assets/images/serve/service.png';
            }else{
                img = domainFile + '/assets/uploadimg/' + data.aaData[i].serveDetailed.richTextHeadPicture;
            }
            html+='<div class="one" value="'+data.aaData[i].id+'" ><div class="tu"><img src="'+img+'" alt=""></div> <h4>'+data.aaData[i].serveName.substring(0,7)+'</h4> </div>';
        }
        html+=' <div class="clear"></div>';
        $(".modal-body").html(html);
        $(".one").click(function () {
            if ($(this).hasClass("theme")) {
                $(this).removeClass("theme")
                serveNamePull = serveNamePull.replace('' + $(this).attr("value") + ',', '');
            } else {
                serveNamePull += '' + $(this).attr("value") + ',';
                $(this).addClass("theme")
            }
        })
    })
}
function add() {
    var url = domainUrl+ '';
    var postData = {
        
    }
    postAjax(url,false,postData,function (data) {
        alert("上传成功")
    })
}