<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/index/settlement.css">
    <script src="${domainUrl}/assets/js/jQuery-1.9.1/jquery.min.js"></script>
    <script src="${domainUrl}/assets/js/bootstrap/bootstrap.min.js"></script>
    <title>购物结算</title>
</head>

<body>

<#include "/common/head.ftl"/>

<div class="section_container">
    <section>
        <div id="shopping_cart" class="full_page">
            <h1>我的购物车</h1>
            <div class="message success">已添加到购物车的服务项目</div>
            <div class="action_buttonbar">
                <button type="button"  class="continue">继续购物</button>
                <button type="button"  class="checkout">结算</button>
                <div class="clearfix"></div>
            </div>
            <div class="cart_table">
                <table class="data-table cart-table" id="shopping-cart-table" cellpadding="0" cellspacing="0">
                    <tbody><tr>
                        <th colspan="2">服务项目</th>
                        <th class="align_center" width="12%"></th>
                        <th class="align_center" width="8%">项目金额</th>
                        <th class="align_center" width="10%">数量</th>
                        <th class="align_center" width="12%">总价</th>
                        <th class="align_center" width="6%">删除</th>
                    </tr>
                    <tr>
                        <td width="10%"><img src="${domainUrl}/assets/images/index/fuwu/1.jpg" ></td>
                        <td class="align_left pa" width="44%"><a class="pr_name" href="##">日常保洁</a><span class="pr_info">室内</span></td>
                        <td class="align_center">编辑</td>
                        <td class="align_center vline"><span class="price">￥49.90</span></td>
                        <td class="align_center vline"><input class="qty_box" type="text"></td>
                        <td class="align_center vline"><span class="price">￥49.90</span></td>
                        <td class="align_center vline"><a href="#" class="remove"><span class="glyphicon glyphicon-remove"></span></a></td>
                    </tr>
                    <tr>
                        <td><img src="${domainUrl}/assets/images/index/fuwu/1.jpg" ></td>
                        <td class="align_left pa" width="44%"><a class="pr_name" href="##">床前陪护</a><span class="pr_info">工作日</span></td>
                        <td class="align_center">编辑</td>
                        <td class="align_center vline"><span class="price">￥49.90</span></td>
                        <td class="align_center vline"><input class="qty_box" type="text"></td>
                        <td class="align_center vline"><span class="price">￥49.90</span></td>
                        <td class="align_center vline"><a href="#" class="remove"><span class="glyphicon glyphicon-remove"></span></a></td>
                    </tr>
                    </tbody></table>
                <div class="totals">
                    <table id="totals-table">
                        <tbody><tr>
                            <td width="60%" colspan="1" class="pull-left"><strong>总计：</strong></td>
                            <td class="" style="pull-right"><strong><span class="price">$109.00</span></strong></td>
                        </tr>
                        </tbody></table>
                </div>
            </div>
            <div class="action_buttonbar">
                <button type="button" title="" class="continue">继续购物</button>
                <button type="button"  title="" class="checkout">结算</button>
                <div class="clearfix"></div>
            </div>
        </div>
    </section>
</div>


<#include "/WEB-INF/views/index/footer.ftl"/>

</body>
</html>