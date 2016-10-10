/**
 * Created by horo on 2016/10/10.
 */
function register() {
    var username = $("#username").val();
    var userpass = $("#userpass").val();
    var url = "";
    var postData = {username:username,userpass:userpass}
    postAjax(url,postData,function () {

    })
}
