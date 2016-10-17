/**
 * Created by horo on 2016/10/14.
 */
$(function () {
    classifyFindAll();
    $("#leibie").bind("change",function(){
        if($(this).val()==0){
            return;
        }
        else{
            var id = $(this).val();
            leibieon(id);
        }
    });
})
function findAll() {
    var url = domainUrl + "/serve/services/findAll";

}
function classifyFindAll() {
    var url=domainUrl+"/serve/service_classes/findAll";
    var p = 1;
    var ps = 5;
    var getData = {currentPage:p,limit:ps};
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data));
        console.log(data.aaData[1]);
        var num = data.iTotalRecords;
        var html="<option>选择服务类别</option>";
        for(var i = 0; i < num; i++){
            if(data.aaData[i].serveClasslevel == 0){
                var id = data.aaData[i].id;
                html += '<option value="'+id+'">'+data.aaData[i].serveClassname+'</option>'
            }
        }
        $("#leibie").html(html);
    })
}
function leibieon(id) {
    var url=domainUrl+"/serve/service_classes/findAll";
    var p = 1;
    var ps = 5;
    var getData = {currentPage:p,limit:ps};
    if(id != "选择服务类别"){

        getAjax(url,false,getData,function (data) {
            var num = data.iTotalRecords;
            var html='<select name=""  class="form-control leibies">';
            for(var i = 0; i < num; i++){
                if(data.aaData[i].tid == id){
                    html+='<option onclick="leibieon(id)">'+data.aaData[i].serveClassname+'</option>';
                }
            }
            html+='</select>';
            $("#leibie").after(html);
        })
    }else{
        $(".leibies").remove();
    }
}
function add() {
    var leibiehtml="";
    var serveClassify = $("#leibie").val();
    var serveName = $("#mingcheng").val();
    var serveLimit = $("#jianjie").val();
    var servePeoples = $("#tiaojian").val();
    var url =domainUrl + "/serve/services/add";
    var getData = {serveClassify:serveClassify,serveName:serveName,serveLimit:serveLimit,servePeoples:servePeoples};
    getAjax(url,false,getData,function (data) {
        alert("添加成功")
    })
}