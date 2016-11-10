<link href="${domainUrl}/assets/css/serve/classify.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/food/foodWeek.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/OutCss/animate/animate.css" rel="stylesheet">
<script src="${domainUrl}/assets/js/institution/food/foodWeek.js"></script>
<script src="${domainUrl}/assets/js/OutJs/date/jquery.date_input.pack.js"></script>
<script src="${domainUrl}/assets/js/serve/pack.js"></script>
<script src="${domainUrl}/assets/js/OutJs/upload/diyUpload.js"></script>

<div id="now-position">
    您当前所在的位置：<span>本周食譜</span>
</div>
<div class="serve-banner">
<#--时间控件-->
    <script type="text/javascript">
        $(function () {
            $('.date_picker').date_input();
        })
    </script>
    <div id="date-input">
        <date>时间范围</date>
        <input type="text" class="date_picker" value="2015-01-01" style="text-align: center">
        <date><input type="button" id="cao" value="搜索"></date>
    </div>
</div>
<div class="content">
    <script>
        $(function () {
           $("#pull-right").click(function () {
                $(".recipesList").addClass("bounceInRight").removeClass("bounceInLeft");
               setTimeout(function(){
                   $(".recipesList").removeClass("bounceInRight")
               },2000);
           })
            $("#pull-left").click(function () {
                $(".recipesList").addClass("bounceInLeft").removeClass("bounceInRight");
                setTimeout(function(){
                    $(".recipesList").removeClass("bounceInLeft");},2000);
            })
        })
    </script>
    <h2>本周食谱:<span>(2016年11月7日</span>-<span>2016年11月13日)</span></h2>
    <!--本周食谱一周-->
    <div class="recipesList animated">
        <div class="box">
            <div class="list-group">
                <div class="list-group-item active_red">
                    <h3 class="list-group-item-heading">星期一</h3>
                </div>
                <div class="list-group-item pa">
                    <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-heart-empty"></i>早餐<span><button >编辑</button></span></h4>
                    <p class="list-group-item-text aa"><span class="food">油条</span><span class="food">豆浆</span></p>
                </div>
                <div class="list-group-item pa">
                    <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-cutlery"></i>午餐<span><button>编辑</button></span></h4>
                    <p class="list-group-item-text aa"><span class="food">米饭</span><span class="food">粥</span><span class="food">鱼香肉丝</span></p>
                </div>
                <div class="list-group-item pa">
                    <h4 class="list-group-item-heading"><i class="glyphicon glyphicon-compressed"></i>晚餐<span><button>编辑</button></span></h4>
                    <p class="list-group-item-text aa"><span class="food">油菜</span><span class="food">馒头</span><span class="food">糖醋鱼</span></p>
                </div>
            </div>
        </div>
    </div>


    <!--食物弹出详情-->
    <div class="introduce" id="introduce">
        <div class="list-group-item">
            <h4 class="list-group-item-heading">口味:</h4>
            <p class="list-group-item-text" id="dishesTaste">咸</p>
        </div>
        <div class="list-group-item">
            <h4 class="list-group-item-heading">过敏原:</h4>
            <p class="list-group-item-text" id="dishesAllergen">无</p>
        </div>
        <div class="list-group-item">
            <h4 class="list-group-item-heading">适合人群:</h4>
            <p class="list-group-item-text" id="dishesSuitPeople">1、高温、重体力劳动、经常出汗的人需要注意补充钠。
                　　
                2、皮肤黏膜及指甲等颜色苍白，体力活动后感觉气促、骨质疏松、心悸症状的人群。</p>
        </div>
        <div class="list-group-item">
            <h4 class="list-group-item-heading">营养价值:</h4>
            <p class="list-group-item-text" id="dishesNutritiveValue">提供能量：油条含有蛋白质、脂肪、碳水化合物、维生素及钙、磷、钾等矿物质，是高热量、高油脂的食物。</p>
        </div>
        <div class="list-group-item">
            <h4 class="list-group-item-heading">重量:</h4>
            <p class="list-group-item-text" id="dishesWeight">1.1kg</p>
        </div>
        <input type="button" value="关闭" id="closeFoodDiv" class="btn" >
    </div>
    <!--底部预览上一周食谱跟下一周食谱-->
    <div class="review">
        <button class="pull-right" id="pull-right">下一周<i class="glyphicon glyphicon-arrow-right"></i></button>
        <button class="pull-right" id="pull-left"><i class="glyphicon glyphicon-arrow-left"></i>上一周</button>
        <div class="clearfix"></div>
    </div>
</div>

<!--菜品选择-->
<div class="choose">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
            <h4 class="modal-title" id="myModalLabel">菜品选择</h4>
        </div>
        <div class="modal-body">
            <a  class="">油条</a>
            <a  class="bb" >干煸大头菜心</a>
            <div class="clearfix"></div>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn1" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn1">确认选择</button>
        </div>
    </div>
</div>




<script>
    $(document).ready(function(){
        $("#closeFoodDiv").click(function () {
            $("#introduce").slideUp("slow");
            $(".food").css("color","#000000")
        })
        $(".food").click(function(){
            $(this).css("color","#FF743D");
            var width = $("#main-side").width();
            var Win = document.documentElement.offsetWidth;
            var num = event.x - width;
            if(num+340 > Win - width){
                $("#introduce").css("margin-left",""+num-340+"").slideDown("slow");
            }else{
                $("#introduce").css("margin-left",""+num+"px").slideDown("slow");
            }

        });
    });

</script>