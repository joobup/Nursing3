/**
 * Created by horo on 2016/10/27.
 */
function findAll() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        console.log(JSON.stringify(data))
        var num = data.aaData[0].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[0][i].id+'">'+data.aaData[0][i].serveClassname+'</option>';
        }
        $("#sel1").html(html);
        var sel=document.getElementById('sel1');
        sel.onchange = function () {
            var id = this.value;
            for(var i = 0; i < data.aaData[1].length; i++){
                if(id == data.aaData[1][i].tid ){
                    $("#tr2").show();
                    findAll2();
                    serveClassify = null;
                }else{
                    var selectIndex = document.getElementById("sel1").selectedIndex;//获得是第几个被选中了
                    var selectText = document.getElementById("sel1").options[selectIndex].text //获得被选中的项目
                    serveClassify = selectText;
                    $("#tr2").hide();
                    $("#tr3").hide()
                }
            }
        }
    })
}
function findAll2() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        var num = data.aaData[1].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[1][i].id+'">'+data.aaData[1][i].serveClassname+'</option>';
        }
        $("#sel2").html(html);
        var sel=document.getElementById('sel2');
        sel.onchange = function () {
            var id = this.value;
            console.log(JSON.stringify(data))
            for(var i = 0; i < data.aaData[2].length; i++){
                if(id == data.aaData[2][i].tid ){
                    $("#tr3").show();
                    findAll3();
                }else{
                    var selectIndex = document.getElementById("sel2").selectedIndex;//获得是第几个被选中了
                    var selectText = document.getElementById("sel2").options[selectIndex].text //获得被选中的项目
                    serveClassify = selectText;
                    $("#tr3").hide()
                }
            }
        }
    })
}
function  findAll3() {
    var url=domainUrl+"/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 5;
    var getData = {currentPage:currentPage,limit:limit};
    getAjax(url,false,getData,function (data) {
        var html='<option>请选择</option>';
        var num = data.aaData[2].length;
        for(var i = 0; i < num; i++){
            html+='<option  value="'+data.aaData[2][i].id+'">'+data.aaData[2][i].serveClassname+'</option>';
        }
        $("#sel3").html(html);
        var sel=document.getElementById('sel3');
        sel.onchange = function () {
            var selectIndex = document.getElementById("sel3").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("sel3").options[selectIndex].text //获得被选中的项目
            serveClassify = selectText;
        }
    })
}