/**
 * Created by horo on 2016/9/30.
 */
$(function () {
    findAll()
    //购物车图标的显示隐藏
    $("#shopping-cart button").mouseover(function () {
        $("#shopping-cart").find("img").attr("src","")
    })
    $("#shopping-cart button").mouseout(function () {
        $("#shopping-cart").find("img").attr("src",domainUrl+"/images/index/shoppcart.png")
    })
    //睡好觉 遮罩
    $(".tu").mouseover(function () {
        $(this).siblings(".popup").show();
        $(this).find(".blo").hide()
        $(this).find(".join").hide()
    })
    $(".popup").mouseout(function () {
        $(this).hide();
        $(this).find(".blo").show()
        $(this).find(".join").show()
    })
})


//收藏加入购物车的图标变换
$(function () {
    $(".mouseover1").mouseover(function () {

        $(this).find("img").attr("src",domainUrl+"/images/index/shoppcart1.png");
    })

    $(".mouseover1").mouseout(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/shoppcart2.png");
    })
})

$(function () {
    $(".mouseover2").mouseover(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/collect.png");
    })
    $(".mouseover2").mouseout(function () {
        $(this).find("img").attr("src",domainUrl+"/images/index/collect1.png");
    })
})
//查询
function findAll() {
    var url = domainUrl1 + '/serve/service_pack_state/findAll';
    var getData = {
        currentPage: 1, limit: 1000,state:1,
    }
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        if(num > 4){
            num = 4;
        }
        for(var i = 0; i< num; i++){
            if(i == 1 || i ==3){
                html+=' <div class="box" value="'+data.aaData[i].id+'"> <div class="pull-left line-l"></div> <div class="pull-left con"> <div class="line-t">' +
                    '</div> <div class="introduce"> <h2>'+data.aaData[i].servicePack.serveName+'</h2> <h3>￥'+data.aaData[i].servicePack.servrRebate+'</h3> <h4><a href="##" class="mouseover1"><img src="'+domainImg+'/assets/images/index/shoppcart2.png" >加入购物车</a>' +
                    ' <a href="##"  class="mouseover2"><img src="'+domainImg+'/assets/images/index/collect1.png">收藏</a> <div class="clear"></div> </h4> <button>立即购买</button> </div>' +
                    ' <div class="tu"> <img src="${domainUrl}/assets/images/index/22.png"  > </div> <div class="line-b"></div> </div> <div class="pull-right line-r"></div> ' +
                    '<div class="clear"></div> </div>' ;
            }else{
                html+=' <div class="box"  value="'+data.aaData[i].id+'"> <div class="pull-left line-l"></div> <div class="pull-left con"> <div class="line-t">' +
                    '</div> <div class="tu"> <img src='+domainUrl+'"/assets/images/index/22.png"  > </div> <div class="introduce">' +
                    ' <h2>'+data.aaData[i].servicePack.serveName+'</h2> <h3>￥'+data.aaData[i].servicePack.servrRebate+'</h3> <h4><a href="##" class="mouseover1"><img src="'+domainImg+'/assets/images/index/shoppcart2.png" >加入购物车</a> ' +
                    '<a href="##"  class="mouseover2"><img src="'+domainImg+'/assets/images/index/collect1.png">收藏</a> <div class="clear"></div> </h4> <button>立即购买</button> ' +
                    '</div> <div class="line-b"></div> </div> <div class="pull-right line-r"></div> <div class="clear"></div> </div>';
            }
        }
        html+='<div class="clear"></div>';
        $("#pic1").html(html)
        $(".box").click(function () {
            window.location = "product?id="+$(this).attr("value");
        })
    })
}
