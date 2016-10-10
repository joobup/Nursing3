/**
 * Created by horo on 2016/9/21.
 */
//===========================工具类函数============================
//只允许输入数字
function checkNumber(e) {
    var keynum = window.event ? e.keyCode : e.which;
    if ((48 <= keynum && keynum <= 57) || keynum == 8) {
        return true;
    } else {
        return false;
    }
}
//截取字符串
function cutString(text, num) {
    if (text.length > num) {
        return text.substring(0, num) + "...";
    }
    else {
        return text;
    }
}
//判断是否为JSON
function isJson(str) {
    if (!str.match("^\{(.+:.+,*){1,}\}$")) {
        return false;
    }
    else {
        return true;
    }
}
//ajax异步
function getAjax(url, fun) {
    $.ajax({
        type: "get",
        url: url,
        dataType: 'json',
        beforeSend: function () {

        },
        error: function (data) {
        },
        success: function (data) {

        }
    });
}
function postAjax(url, postData,fun) {
    $.ajax({
        type: "post",
        url: url,
        data: postData,
        dataType: 'json',
        beforeSend: function () {

        },
        error: function (data) {
        },
        success: function (data) {

        }
    });
}