/**
 * Created by horo on 2016/10/27.
 */
function findAll() {
    clearModal();
    cost();
    var url = domainUrl + "/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 15;
    var getData = {currentPage: currentPage, limit: limit};
    getAjax(url, false, getData, function (data) {
        var html = '<option>请选择</option>';
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].serveClassname + '</option>';
        }
        $("#sel1").html(html);
        var sel = document.getElementById('sel1');
        sel.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined) {
                for (var x = 0; x < data.aaData[1].length; x++) {
                    if (id == data.aaData[1][x].tid) {
                        $("#tr2").show();
                        findAll2(id);
                        serveClassify = null;
                        return false;
                    }else{
                        var selectIndex = document.getElementById("sel1").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("sel1").options[selectIndex].value //获得被选中的项目
                        serveClassify = selectText;
                        $("#tr2").hide();
                        $("#tr3").hide()
                    }
                }
            } else {
                var selectIndex = document.getElementById("sel1").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("sel1").options[selectIndex].value //获得被选中的项目
                serveClassify = selectText;
                $("#tr2").hide();
                $("#tr3").hide()
            }
        }
    })
}
function findAll2(id) {
    var url = domainUrl + "/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 15;
    var getData = {currentPage: currentPage, limit: limit};
    getAjax(url, false, getData, function (data) {
        var html = '<option>请选择</option>';
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[1][i].tid) {
                html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].serveClassname + '</option>';
            }
        }
        $("#sel2").html(html);
        var sel = document.getElementById('sel2');
        sel.onchange = function () {
            var id2 = this.value;
            if(data.aaData[2] != undefined){
                for (var x = 0; x < data.aaData[2].length; x++) {
                    if (id2 == data.aaData[2][x].tid) {
                        $("#tr3").show();
                        findAll3(id2);
                        serveClassify = null;
                        return false;
                    }else{
                        var selectIndex = document.getElementById("sel2").selectedIndex;//获得是第几个被选中了
                        var selectValue = document.getElementById("sel2").options[selectIndex].value //获得被选中的项目
                        serveClassify = selectValue;
                        $("#tr3").hide()
                    }
                }
            }else{
                var selectIndex = document.getElementById("sel2").selectedIndex;//获得是第几个被选中了
                var selectValue = document.getElementById("sel2").options[selectIndex].value //获得被选中的项目
                serveClassify = selectValue;
                $("#tr3").hide()
            }
        }
    })
}
function findAll3(id) {
    var url = domainUrl + "/serve/service_classes/findTreeAll";
    var currentPage = 1;
    var limit = 15;
    var getData = {currentPage: currentPage, limit: limit};
    getAjax(url, false, getData, function (data) {
        var html = '<option>请选择</option>';
        var num = data.aaData[2].length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[2][i].tid) {
                html += '<option  value="' + data.aaData[2][i].id + '">' + data.aaData[2][i].serveClassname + '</option>';
            }
        }
        $("#sel3").html(html);
        var sel = document.getElementById('sel3');
        sel.onchange = function () {
            var selectIndex = document.getElementById("sel3").selectedIndex;//获得是第几个被选中了
            var selectValue = document.getElementById("sel3").options[selectIndex].value //获得被选中的项目
            serveClassify = selectValue;

        }
    })
}