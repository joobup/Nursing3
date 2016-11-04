/**
 * Created by horo on 2016/11/3.
 */
function sideUrl(url) {
    var url = domainUrl+url;
    $.ajax({
        type: "get",
        url: url,
        success: function (data) {
            $("#main-show").html(data)
        }
    });
}
