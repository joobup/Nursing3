<link href="${domainUrl}/assets/css/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${domainUrl}/assets/css/oldMan/report.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${domainUrl}/assets/css/OutCss/canvas/component.css" />

<!--柱狀圖-->
<script src="${domainUrl}/assets/js/OutJs/zhuzhuang/highcharts.js"></script>

<style>
    .main-body #main-show{
        background: none;
        overflow: hidden;
    }
</style>
<div class="side-button" id="right-canvas" style="left: auto; right: 0%; ">
    <img src="${domainUrl}/assets/images/report/right1.png" />
</div>
<div class="side-button le" id="left-canvas" style="left: 0%; right: auto; display: none;">
    <img src="${domainUrl}/assets/images/report/left1.png"  />

</div>

<div id="start" class="animated">
    <div id="mainMap" style="height:100%;width: 100%;padding:7% 14% 14% 14%;background:#1B1B1B">
    </div>
</div>
<script>
    $(function () {
        $("#right-canvas").click(function () {
            $("#start").removeClass("fadeInLeft").addClass("fadeOutLeft").hide(900);
            $("#shujuback").css(" opacity","1").removeClass("fadeOutRight").addClass("fadeInRight");
            $("#right-canvas").hide();
            $("#left-canvas").show();
            $("#demo-canvas").hide();
            $(".head-banner").hide(800)
            $("#main-side").hide(800)
        })
        $("#left-canvas").click(function () {
            $("#start").css("display","block").removeClass("fadeOutLeft").addClass("fadeInLeft");
            $("#shujuback").css(" opacity","0").removeClass("fadeInRight").addClass("fadeOutRight");
            $("#right-canvas").show();
            $("#left-canvas").hide();
            $("#demo-canvas").show();
            $(".head-banner").show(800)
            $("#main-side").show(800)
        })
    })
</script>
<div class="zong animated" id="shujuback">
    <h1>老人模块信息报表</h1>
    <div class="top">

        <div class="module moduleaa">
            <div class="mo_t red1" ></div>
            <h2>入住管理</h2>
            <div class="aa red2 blur"></div>
            <div class="mo_b">
                <div class="pull-left icon"> <img src="${domainUrl}/assets/images/report/qun.png"  /></div>
                <div class="pull-right txt">
                    <h3>床位入住率</h3>
                    <!--进度条-->
                    <div class="progress">
                        <div class="progress-bar progress-bar-danger progress-bar-striped active" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                            <span class="sr-only">60% Complete</span>
                        </div>
                    </div>
                    <h4>60%</h4>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        <div class="module moduleaa">
            <div class="mo_t yellow1"></div>
            <h2>服务收益</h2>
            <div class="aa yellow2 blur"></div>
            <div class="mo_b">
                <div class="pull-left icon"> <img src="${domainUrl}/assets/images/report/shouyi.png"  /></div>
                <div class="pull-right txt">
                    <h3>年度服务收益</h3>
                    <!--柱状图-->
                    <div id="container" style="min-width:20%; min-height:100px; margin: 0 auto;"></div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        <div class="module moduleaa">
            <div class="mo_t cheng1"></div>
            <h2>库存容量</h2>
            <div class="aa cheng2 blur"></div>
            <div class="mo_b">
                <div class="pull-left icon"> <img src="${domainUrl}/assets/images/report/kucun.png" /></div>
                <div class="pull-right txt">
                    <h3>仓库存量显示</h3>
                    <!--进度条-->
                    <div class="progress">
                        <div class="progress-bar progress-bar-info progress-bar-striped active" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
                            <span class="sr-only">80% Complete</span>
                        </div>
                    </div>
                    <h4>80%</h4>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        <div class="module bb">
            <div class="mo_t blue1"></div>
            <h2>人员年龄性别比例</h2>
            <div class="cc blue2 blur"></div>
            <div class="mo_b mo_b1">
                <div class='wrapper pull-left  animated bounceInUp ' id="quxianbiao">
                    <canvas height='350' id='canvas' width='800'></canvas>
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>

</div>
<!--曲线表-->
<script src="${domainUrl}/assets/js/linear/Chart.min.js"></script>
<script src="${domainUrl}/assets/js/linear/prefixfree.min.js"></script>
<script src="${domainUrl}/assets/js/linear/linear.js"></script>

<!--柱状表-->
<#--<div class="pull-left histogram  animated bounceInUp" style="margin-top: 30px;">-->
    <#--<div id="chart_buttons"></div>-->
    <#--<div id="chart" style="width:95%;"></div>-->
<#--</div>-->

<!--柱状表-->
<script src="${domainUrl}/assets/js/histogram/d3.min.js"></script>
<script src="${domainUrl}/assets/js/histogram/histogram.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/TweenLite.min.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/EasePack.min.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/rAF.js"></script>
<script src="${domainUrl}/assets/js/OutJs/canvas/demo-1.js"></script>
<script src="${domainUrl}/assets/js/OutJs/map/charts/echarts.js"></script>
<script type="text/javascript">
    $('#document').ready(function(){
        getEcharts();
    });
</script>

<script type="text/javascript">
    var domain = '${domainUrl}/assets/js/OutJs/map/charts/echarts';
    function getEcharts(){
        // Step:3 conifg ECharts's path, link to echarts.js from current page.
        // Step:3 为模块加载器配置echarts的路径，从当前页面链接到echarts.js，定义所需图表路径
        require.config({
            paths: {
                echarts: './assets/js/OutJs/map/charts'
            }
        });
        // Step:4 require echarts and use it in the callback.
        // Step:4 动态加载echarts然后在回调函数中开始使用，注意保持按需加载结构定义图表路径
        require(
                [
                    'echarts',
                    'echarts/chart/map'
                ],
                function (ec) {
                    // --- 地图 ---
                    var myChart2 = ec.init(document.getElementById('mainMap'));
                    myChart2.setOption({
                        dataRange: {
                            min : 0,
                            max : 100,
                            calculable : false,
                            color: ['#ff3333', 'orange', 'yellow','lime','aqua'],
                            textStyle:{
                                color:'#fff'
                            }
                        },
                        series : [
                            {
                                name: '全国',
                                type: 'map',
                                roam: false,
                                hoverable: false,
                                mapType: 'china',
                                itemStyle:{
                                    normal:{
                                        borderColor:'rgba(100,149,237,1)',
                                        borderWidth:0.5,
                                        areaStyle:{
                                            color: '#1b1b1b'
                                        }
                                    }
                                },
                                data:[],
                                markLine : {
                                    smooth:true,
                                    symbol: ['none', 'circle'],
                                    symbolSize : 1,
                                    itemStyle : {
                                        normal: {
                                            color:'#fff',
                                            borderWidth:1,
                                            borderColor:'rgba(30,144,255,0.5)'
                                        }
                                    },
                                    data : [
                                    ],
                                },
                                geoCoord: {
                                    '上海': [121.4648,31.2891],
                                    '东莞': [113.8953,22.901],
                                    '东营': [118.7073,37.5513],
                                    '中山': [113.4229,22.478],
                                    '临汾': [111.4783,36.1615],
                                    '临沂': [118.3118,35.2936],
                                    '丹东': [124.541,40.4242],
                                    '丽水': [119.5642,28.1854],
                                    '乌鲁木齐': [87.9236,43.5883],
                                    '佛山': [112.8955,23.1097],
                                    '保定': [115.0488,39.0948],
                                    '兰州': [103.5901,36.3043],
                                    '包头': [110.3467,41.4899],
                                    '北京': [116.4551,40.2539],
                                    '北海': [109.314,21.6211],
                                    '南京': [118.8062,31.9208],
                                    '南宁': [108.479,23.1152],
                                    '南昌': [116.0046,28.6633],
                                    '南通': [121.1023,32.1625],
                                    '厦门': [118.1689,24.6478],
                                    '台州': [121.1353,28.6688],
                                    '合肥': [117.29,32.0581],
                                    '呼和浩特': [111.4124,40.4901],
                                    '咸阳': [108.4131,34.8706],
                                    '哈尔滨': [127.9688,45.368],
                                    '唐山': [118.4766,39.6826],
                                    '嘉兴': [120.9155,30.6354],
                                    '大同': [113.7854,39.8035],
                                    '大连': [122.2229,39.4409],
                                    '天津': [117.4219,39.4189],
                                    '太原': [112.3352,37.9413],
                                    '威海': [121.9482,37.1393],
                                    '宁波': [121.5967,29.6466],
                                    '宝鸡': [107.1826,34.3433],
                                    '宿迁': [118.5535,33.7775],
                                    '常州': [119.4543,31.5582],
                                    '广州': [113.5107,23.2196],
                                    '廊坊': [116.521,39.0509],
                                    '延安': [109.1052,36.4252],
                                    '张家口': [115.1477,40.8527],
                                    '徐州': [117.5208,34.3268],
                                    '德州': [116.6858,37.2107],
                                    '惠州': [114.6204,23.1647],
                                    '成都': [103.9526,30.7617],
                                    '扬州': [119.4653,32.8162],
                                    '承德': [117.5757,41.4075],
                                    '拉萨': [91.1865,30.1465],
                                    '无锡': [120.3442,31.5527],
                                    '日照': [119.2786,35.5023],
                                    '昆明': [102.9199,25.4663],
                                    '杭州': [119.5313,29.8773],
                                    '枣庄': [117.323,34.8926],
                                    '柳州': [109.3799,24.9774],
                                    '株洲': [113.5327,27.0319],
                                    '武汉': [114.3896,30.6628],
                                    '汕头': [117.1692,23.3405],
                                    '江门': [112.6318,22.1484],
                                    '沈阳': [123.1238,42.1216],
                                    '沧州': [116.8286,38.2104],
                                    '河源': [114.917,23.9722],
                                    '泉州': [118.3228,25.1147],
                                    '泰安': [117.0264,36.0516],
                                    '泰州': [120.0586,32.5525],
                                    '济南': [117.1582,36.8701],
                                    '济宁': [116.8286,35.3375],
                                    '海口': [110.3893,19.8516],
                                    '淄博': [118.0371,36.6064],
                                    '淮安': [118.927,33.4039],
                                    '深圳': [114.5435,22.5439],
                                    '清远': [112.9175,24.3292],
                                    '温州': [120.498,27.8119],
                                    '渭南': [109.7864,35.0299],
                                    '湖州': [119.8608,30.7782],
                                    '湘潭': [112.5439,27.7075],
                                    '滨州': [117.8174,37.4963],
                                    '潍坊': [119.0918,36.524],
                                    '烟台': [120.7397,37.5128],
                                    '玉溪': [101.9312,23.8898],
                                    '珠海': [113.7305,22.1155],
                                    '盐城': [120.2234,33.5577],
                                    '盘锦': [121.9482,41.0449],
                                    '石家庄': [114.4995,38.1006],
                                    '福州': [119.4543,25.9222],
                                    '秦皇岛': [119.2126,40.0232],
                                    '绍兴': [120.564,29.7565],
                                    '聊城': [115.9167,36.4032],
                                    '肇庆': [112.1265,23.5822],
                                    '舟山': [122.2559,30.2234],
                                    '苏州': [120.6519,31.3989],
                                    '莱芜': [117.6526,36.2714],
                                    '菏泽': [115.6201,35.2057],
                                    '营口': [122.4316,40.4297],
                                    '葫芦岛': [120.1575,40.578],
                                    '衡水': [115.8838,37.7161],
                                    '衢州': [118.6853,28.8666],
                                    '西宁': [101.4038,36.8207],
                                    '西安': [109.1162,34.2004],
                                    '贵阳': [106.6992,26.7682],
                                    '连云港': [119.1248,34.552],
                                    '邢台': [114.8071,37.2821],
                                    '邯郸': [114.4775,36.535],
                                    '郑州': [113.4668,34.6234],
                                    '鄂尔多斯': [108.9734,39.2487],
                                    '重庆': [107.7539,30.1904],
                                    '金华': [120.0037,29.1028],
                                    '铜川': [109.0393,35.1947],
                                    '银川': [106.3586,38.1775],
                                    '镇江': [119.4763,31.9702],
                                    '长春': [125.8154,44.2584],
                                    '长沙': [113.0823,28.2568],
                                    '长治': [112.8625,36.4746],
                                    '阳泉': [113.4778,38.0951],
                                    '青岛': [120.4651,36.3373],
                                    '韶关': [113.7964,24.7028]
                                },
                                markPoint : {
                                    symbol:'emptyCircle',
                                    symbolSize : function (v){
                                        return 10 + v/10
                                    },
                                    effect : {
                                        show: true,
                                        shadowBlur : 0
                                    },
                                    itemStyle:{
                                        normal:{
                                            label:{show:false}
                                        },
                                        emphasis: {
                                            label:{position:'top'}
                                        }
                                    },
                                    data : [
                                        {name:'上海',value:95},
                                        {name:'广州',value:90},
                                        {name:'大连',value:80},
                                        {name:'南宁',value:70},
                                        {name:'南昌',value:60},
                                        {name:'拉萨',value:50},
                                        {name:'长春',value:40},
                                        {name:'包头',value:30},
                                        {name:'重庆',value:20},
                                        {name:'常州',value:10}
                                    ]
                                }
                            },
                            {
                                name: '北京 Top10',
                                type: 'map',
                                mapType: 'china',
                                data:[],
                                markLine : {
                                    smooth:true,
                                    effect : {
                                        show: true,
                                        scaleSize: 1,
                                        period: 30,
                                        color: '#fff',
                                        shadowBlur: 10
                                    },
                                    itemStyle : {
                                        normal: {
                                            label:{show:false},
                                            borderWidth:1,
                                            lineStyle: {
                                                type: 'solid',
                                                shadowBlur: 10
                                            }
                                        }
                                    },
                                    data : [
                                        [{name:'上海'}, {name:'北京',value:95}],
                                        [{name:'广州'}, {name:'北京',value:90}],
                                        [{name:'大连'}, {name:'北京',value:80}],
                                        [{name:'南宁'}, {name:'北京',value:70}],
                                        [{name:'南昌'}, {name:'北京',value:60}],
                                        [{name:'拉萨'}, {name:'北京',value:50}],
                                        [{name:'长春'}, {name:'北京',value:40}],
                                        [{name:'包头'}, {name:'北京',value:30}],
                                        [{name:'重庆'}, {name:'北京',value:20}],
                                        [{name:'常州'}, {name:'北京',value:10}]
                                    ]
                                },
                                markPoint : {
                                    symbol:'emptyCircle',
                                    symbolSize : function (v){
                                        return 0.1
                                    },
                                    effect : {
                                        show: false,
                                        shadowBlur : 0
                                    },
                                    itemStyle:{
                                        normal:{
                                            label:{show:true,
                                                position:'top',
                                                textStyle: {
                                                    fontSize: 14
                                                }
                                            }
                                        },
                                        emphasis: {
                                            label:{show:false}
                                        }
                                    },
                                    data : [
                                        {name:'上海',value:95},
                                        {name:'广州',value:90},
                                        {name:'大连',value:80},
                                        {name:'南宁',value:70},
                                        {name:'南昌',value:60},
                                        {name:'拉萨',value:50},
                                        {name:'长春',value:40},
                                        {name:'包头',value:30},
                                        {name:'重庆',value:20},
                                        {name:'常州',value:10}
                                    ]
                                }
                            }
                        ]
                    });
                });
    }

    /*柱狀圖*/
    $(function () {
        Highcharts.chart('container', {
            chart: {
                type: 'column'
            },
            xAxis: {
                type: 'category',
                labels: {
                    rotation: -45,
                    style: {
                        fontSize: '13px',
                    }
                }
            },
            yAxis: {
                min: 0,
                title: {
                    text: ''
                }
            },
            legend: {
                enabled: false
            },
            tooltip: {
                pointFormat: ''
            },
            series: [{
                name: 'Population',
                data: [
                    ['1月', 23.7],
                    ['2月', 16.1],
                    ['3月', 14.2],
                    ['4月', 18.0],
                    ['5月', 20.5],
                    ['6月', 12.1],
                ],
                dataLabels: {
                    enabled: false,
                    rotation: -90,
                    color: '#FFFFFF',
                    align: 'right',
                    format: '{point.y:.1f}', // one decimal
                    y: 10, // 10 pixels down from the top
                    style: {
                        fontSize: '13px',
                        fontFamily: 'Verdana, sans-serif'
                    }
                }
            }]
        });
    });



</script>