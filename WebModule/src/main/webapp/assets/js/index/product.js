/**
 * Created by Administrator on 2016/11/16.
 */
$(function () {
    findAll();
})
/*取url*/
function UrlSearch() {
    var name, value;
    var str = location.href; //取得整个地址栏
    var num = str.indexOf( "?")
    str = str.substr(num + 1); //取得所有参数   stringvar.substr(start [, length ]
    var arr = str.split( "&"); //各个参数放到数组里
    for (var i = 0; i < arr.length; i++) {
        num = arr[i].indexOf( "=");
        if (num > 0) {
            name = arr[i].substring(0, num);
            value = arr[i].substr(num + 1);
            this[name] = value;
        }
    }
}
//查询
function findAll() {
    var url = domainUrl1 + '/serve/service_pack_state/findAll';
    var getData = {
        currentPage: 1, limit: 1000,state:1,
    }
    var html='';
    var Request = new UrlSearch(); //实例化
     var id = Request.id;
    getAjax(url,false,getData,function (data) {
        for(var i = 0; i < data.aaData.length; i++){
            if(id  == data.aaData[i].id){
                console.log(JSON.stringify(data.aaData[i]))

                var serveName1 = data.aaData[i].servicePack.serveName
                $("#serveName").html(serveName1);

                var serveBrief1 = data.aaData[i].servicePack.serveBrief
                $("#serveBrief").html(serveBrief1);



            }
        }

    })
}

