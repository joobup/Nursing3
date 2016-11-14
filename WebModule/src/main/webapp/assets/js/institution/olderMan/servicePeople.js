/**
 * Created by horo on 2016/11/7.
 */
/*服务对象模块*/
//添加
$(function () {
    findAll(1);
    typeSelect();
    stateSelect();
    $("#cao").click(function () {
        $("#update-btn").hide();
        $("#add-btn").show();
    })
    $("#shanchu-yes").click(function () {
        $("#shanchu-yes").hide();
        $("#shanchu-no").show();
        $(".bianji").hide();
        $(".shanchu").show();
    })
    $("#shanchu-no").click(function () {
        $("#shanchu-no").hide();
        $("#shanchu-yes").show();
        $(".shanchu").hide();
        $(".bianji").show();
    })
})
function clearModal() {
    $("#servicePeopleName").val("");
    $("#servicePeopleAge").val("");
    $("#servicePeopleSex").val("");
    $("#servicePeopleRelation").val("");
    $("#servicePeopleAttention").val("");
    $("#servicePeopleTel").val("");
}
function add() {
    var url = domainUrl + '/serve/service_people/add';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeoplePicture = $("#servicePeoplePicture").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var nursingLeave = $("#nursingLeave").val();
    if(servicePeopleSex == "男"){
        servicePeopleSex = 1;
    }else{
        servicePeopleSex = 2;
    }
    servicePeopleRelation = 1;
    var postData = {
        servicePeopleName: servicePeopleName,
        servicePeopleAge: servicePeopleAge,
        servicePeopleSex: servicePeopleSex,
        servicePeopleRelation: servicePeopleRelation,
        servicePeopleAttention: servicePeopleAttention,
        userId: 1,
        servicePeopleTel: servicePeopleTel,
        servicePeopleStateId: stateClassify,
        servicePeopleTypeId: typeClassify,
        nursingLeave: nursingLeave,
    };
    console.log(postData)
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
        findAll(1);
        $("#myModal").modal("hide")
    })
}
//查询
function findAll(currentPage) {
    clearModal();
    var url = domainUrl + '/serve/service_people/findAll';
    var getData = {
        currentPage: currentPage,
        limit: limit
    };
    getAjax(url, false, getData, function (data) {
        var picture = '';
        console.log(JSON.stringify(data))
        var num = data.aaData.length;
        var html = '';
        var button = '';
        for (var i = 0; i < num; i++) {
            if (data.aaData[i].servicePeoplePicture == null) {
                picture = '<img style="width: 100px; height: 100px;cursor: pointer;" src="' + domainImg + '/assets/images/serve/old.png" onclick="uploadShow(' + data.aaData[i].id + ')"/>';
            } else {
                picture = '<img style="width: 100px; height: 100px;" src="' + domainFile + '/assets/uploadimg/' + data.aaData[i].servicePeoplePicture + '" onclick="uploadShow(' + data.aaData[i].id + ')" />';
            }
            if (data.aaData[i].isHaveServicePeopleRegister == 0) {
                button = ' <button type="button" class="btn btn-primary btn1-style" onclick="makeDetails(' + data.aaData[i].id + ')">添加详情</button> ';
            } else {
                button = '<button type="button" class="btn btn-primary btn1-style"  onclick="findAllDetails(' + data.aaData[i].isHaveServicePeopleRegister + ')">查看详情</button>'
            }
            html += '<ul class="box"> <li class="pull-left box-left">' + picture + '' +
                '</li> <li class="pull-left box-con"> <ul> <i class="glyphicon glyphicon-remove shanchu" title="删除" style="display:none;" onclick="del(' + data.aaData[i].id + ')"></i> ' +
                '<i class="glyphicon glyphicon-pencil bianji" title="编辑" data-toggle="modal" data-target="#myModal" onclick="make(' + data.aaData[i].id + ')" ></i>' +
                ' <li>姓名：<span>' + data.aaData[i].servicePeopleName + '</span></li> ' +
                '<li>年龄：<span>' + data.aaData[i].servicePeopleAge + '</span></li> <li>性别：<span>' + data.aaData[i].servicePeopleSex + '</span></li>' +
                ' <li>关系：<span>父亲</span></li></ul> </li> ' +
                '<li class="pull-left box-right"> <ul> <li>人员状态：<span>健康</span></li>' +
                ' <li>服务类型：<span>高级服务</span></li><li>护理级别：<span>高级护理</span></li>' +
                ' <li>联系方式：<span>' + data.aaData[i].servicePeopleTel + '</span></li> </ul> </li>' +
                '' + button + ' </ul>';
        }
        $(".zong").html(html)
    })
}
//删除
function del(id) {
    var url = domainUrl + '/serve/service_people/del';
    var postData = {
        id: id,
    }
    postAjax(url, false, postData, function (data) {
        alert("删除成功");
        $("#shanchu-yes").show();
        $("#shanchu-no").hide();
        findAll(1);
    })
}
//修改
function make(id) {
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl + '/serve/service_people/findAll';
    var getData = {
        currentPage: currentPage,
        limit: limit
    };
    var html = '';
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[i].id) {
                var servicePeopleName = data.aaData[i].servicePeopleName;
                var servicePeopleAge = data.aaData[i].servicePeopleAge;
                var servicePeopleSex = data.aaData[i].servicePeopleSex;
                var servicePeopleRelation = data.aaData[i].servicePeopleRelation;
                var servicePeopleTel = data.aaData[i].servicePeopleTel;
                var servicePeopleAttention = data.aaData[i].servicePeopleAttention;
            }
        }
        $("#servicePeopleName").val(servicePeopleName);
        $("#servicePeopleAge").val(servicePeopleAge);
        $("#servicePeopleSex").val(servicePeopleSex);
        $("#servicePeopleRelation").val(servicePeopleRelation);
        $("#servicePeopleAttention").val(servicePeopleAttention);
        $("#servicePeopleTel").val(servicePeopleTel);
        $("#uid").val(id);
    })

}
function update() {
    var url = domainUrl + '/serve/service_people/update';
    var servicePeopleName = $("#servicePeopleName").val();
    var servicePeopleAge = $("#servicePeopleAge").val();
    var servicePeopleSex = $("#servicePeopleSex").val();
    var servicePeopleRelation = $("#servicePeopleRelation").val();
    var servicePeopleAttention = $("#servicePeopleAttention").val();
    var userId = $("#userId").val();
    var servicePeopleTel = $("#servicePeopleTel").val();
    var servicePeopleStateId = $("#servicePeopleStateId").val();
    var servicePeopleTypeId = $("#servicePeopleTypeId").val();
    var nursingLeave = $("#nursingLeave").val();
    var id = $("#uid").val();
    var postData = {
        id: id,
        servicePeopleName: servicePeopleName,
        servicePeopleAge: servicePeopleAge,
        servicePeopleSex: servicePeopleSex,
        servicePeopleRelation: servicePeopleRelation,
        servicePeopleAttention: servicePeopleAttention,
        userId: 1,
        servicePeopleTel: servicePeopleTel,
        servicePeopleStateId: servicePeopleStateId,
        servicePeopleTypeId: servicePeopleTypeId,
        nursingLeave: nursingLeave,
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
        findAll(1);
        $("#myModal").modal("hide");
    })
}
/*服务对象状态级别*/
var typeClassify;
function typeSelect() {
    var url = domainUrl + "/serve/service_people_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].serviceTypePeopleName + '</option>';
        }
        $("#servicePeopleTypeId").html(html);
        var type = document.getElementById('servicePeopleTypeId');
        type.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr2").show();
                        typeSelect2();
                        typeClassify = null;
                    } else {
                        var selectIndex = document.getElementById("servicePeopleTypeId").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("servicePeopleTypeId").options[selectIndex].value //获得被选中的项目
                        typeClassify = selectText;
                        $("#tr2").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("servicePeopleTypeId").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("servicePeopleTypeId").options[selectIndex].value //获得被选中的项目
                typeClassify = selectText;
                $("#tr2").hide();
            }
        }
    })
}
function typeSelect2() {
    var url = domainUrl + "/serve/service_people_type/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].serviceTypePeopleName + '</option>';
        }
        $("#servicePeopleTypeId2").html(html);
        var type = document.getElementById('servicePeopleTypeId2');
        type.onchange = function () {
            var selectIndex = document.getElementById("servicePeopleTypeId2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("servicePeopleTypeId2").options[selectIndex].value //获得被选中的项目
            typeClassify = selectText;
        }
    })
}
/*护理级别*/
var stateClassify;
function stateSelect() {
    var url = domainUrl + "/serve/service_people_state/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option value="请选择">请选择</option>'
    getAjax(url, false, getData, function (data) {
        var num = data.aaData[0].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[0][i].id + '">' + data.aaData[0][i].servicePeopleStateName + '</option>';
        }
        $("#nursingLeave").html(html);
        var state = document.getElementById('nursingLeave');
        state.onchange = function () {
            var id = this.value;
            if (data.aaData[1] != undefined && id != "请选择") {
                for (var i = 0; i < data.aaData[1].length; i++) {
                    if (id == data.aaData[1][i].tid) {
                        $("#tr22").show();
                        stateSelect2();
                        stateClassify = null;
                    } else {
                        var selectIndex = document.getElementById("nursingLeave").selectedIndex;//获得是第几个被选中了
                        var selectText = document.getElementById("nursingLeave").options[selectIndex].value //获得被选中的项目
                        stateClassify = selectText;
                        $("#tr22").hide();
                    }
                }
            } else {
                var selectIndex = document.getElementById("nursingLeave").selectedIndex;//获得是第几个被选中了
                var selectText = document.getElementById("nursingLeave").options[selectIndex].value //获得被选中的项目
                stateClassify = selectText;
                $("#tr22").hide();
            }
        }
    })
}
function stateSelect2() {
    var url = domainUrl + "/serve/service_people_state/findTreeAll";
    var getData = {currentPage: currentPage, limit: limit};
    var html = '<option>请选择</option>'
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data));
        var num = data.aaData[1].length;
        for (var i = 0; i < num; i++) {
            html += '<option  value="' + data.aaData[1][i].id + '">' + data.aaData[1][i].servicePeopleStateName + '</option>';
        }
        $("#nursingLeave2").html(html);
        var state = document.getElementById('nursingLeave2');
        state.onchange = function () {
            var selectIndex = document.getElementById("nursingLeave2").selectedIndex;//获得是第几个被选中了
            var selectText = document.getElementById("nursingLeave2").options[selectIndex].value //获得被选中的项目
            stateClassify = selectText;
        }
    })
}
function upload(id) {
    $("#aaaa").hide();
    $("#box").hide();
    var url = domainUrl + '/serve/service_people/update';
    var postData = {
        id: id,
        mainPicture: pathList,
    };
    postAjax(url, false, postData, function (data) {
        alert("上传成功");
        findAll(1);
    })
}

/*老人详情*/
function makeDetails(id) {
    $("#myModal2").modal("show");
    $("#did").val(id);
}
function addDetails() {
    var url = domainUrl + '/serve/service_people_register/add';
    var servicePeopleId = $("#servicePeopleId").val();
    var birthday = $("#birthday").val();
    var nation = $("#nation").val();
    var identityCard = $("#identityCard").val();
    var homeAddress = $("#homeAddress").val();
    var liveCondition = $("#liveCondition").val();
    var selfCareAbility = $("#selfCareAbility").val();
    var personalClassify = $("#personalClassify").val();
    var politicsStatus = $("#politicsStatus").val();
    var cultureLevel = $("#cultureLevel").val();
    var medicalWay = $("#medicalWay").val();
    var monthIncome = $("#monthIncome").val();
    var marriageStatus = $("#marriageStatus").val();
    var faith = $("#faith").val();
    var call1Name = $("#call1Name").val();
    var call1Old = $("#call1Old").val();
    var call1 = $("#call1").val();
    var call2Name = $("#call2Name").val();
    var call2Old = $("#call2Old").val();
    var call2 = $("#call2").val();
    var childAll = $("#childAll").val();
    var childBoy = $("#childBoy").val();
    var childGirl = $("#childGirl").val();
    var homeOldCard = $("#homeOldCard").val();
    var workName = $("#workName").val();
    var checkPeoPle = $("#checkPeoPle").val();
    var checkDate = $("#checkDate").val();
    var id = $("#did").val();
    var postData = {
        servicePeopleId: id,
        birthday: birthday,
        nation: nation,
        identityCard: identityCard,
        homeAddress: homeAddress,
        liveCondition: liveCondition,
        selfCareAbility: selfCareAbility,
        personalClassify: personalClassify,
        politicsStatus: politicsStatus,
        cultureLevel: cultureLevel,
        medicalWay: medicalWay,
        monthIncome: monthIncome,
        marriageStatus: marriageStatus,
        faith: faith,
        call1Name: call1Name,
        call1Old: call1Old,
        call1: call1,
        call2Name: call2Name,
        call2Old: call2Old,
        call2: call2,
        childAll: childAll,
        childBoy: childBoy,
        childGirl: childGirl,
        homeOldCard: homeOldCard,
        workName: workName,
        checkPeoPle: checkPeoPle,
        checkDate: checkDate,
    };
    console.log(postData)
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
    })
}
function findAllDetails(id) {
    var url = domainUrl + '/serve/service_people_register/findOne';
    var getData = {
        id:id,
    }
    getAjax(url, false, getData, function (data) {
        console.log(JSON.stringify(data))
        $("#myModal3").modal("show");
        $("#muid").val(id);
            $("#birthday1").text(data.birthday.substring(0, 11));
            $("#nation1").text(data.nation);
            $("#identityCard1").text(data.identityCard);
            $("#homeAddress1").text(data.homeAddress);
            $("#liveCondition1").text(data.liveCondition);
            $("#selfCareAbility1").text(data.selfCareAbility);
            $("#personalClassify1").text(data.personalClassify);
            $("#politicsStatus1").text(data.politicsStatus);
            $("#cultureLevel1").text(data.cultureLevel);
            $("#medicalWay1").text(data.medicalWay);
            $("#monthIncome1").text(data.monthIncome);
            $("#marriageStatus1").text(data.marriageStatus);
            $("#faith1").text(data.faith);
            $("#call1Name1").text(data.call1Name);
            $("#call1Old1").text(data.call1Old);
            $("#call11").text(data.call1);
            $("#call2Name1").text(data.call2Name);
            $("#call2Old1").text(data.call2Old);
            $("#call21").text(data.call2);
            $("#childAll1").text(data.childAll);
            $("#childBoy1").text(data.childBoy);
            $("#childGirl1").text(data.childGirl);
            $("#homeOldCard1").text(data.homeOldCard);
            $("#workName1").text(data.workName);
            $("#checkPeoPle1").text(data.checkPeoPle);
            $("#checkDate1").text(data.checkDate);


    })
}
function makeUpdate() {
    var id = $("#muid").val();
    $("#myModal3").modal("hide");
    $("#myModal2").modal("show");
    var url = domainUrl + '/serve/service_people_register/findAll';
    var getData = {
        currentPage: 1,
        limit: limit,
    }
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < 1; i++) {
            if (id == data.aaData[i].id) {
                $("#birthday").val(data.aaData[i].birthday.substring(0, 11));
                $("#nation").val(data.aaData[i].nation);
                $("#identityCard").val(data.aaData[i].identityCard);
                $("#homeAddress").val(data.aaData[i].homeAddress);
                $("#liveCondition").val(data.aaData[i].liveCondition);
                $("#selfCareAbility").val(data.aaData[i].selfCareAbility);
                $("#personalClassify").val(data.aaData[i].personalClassify);
                $("#politicsStatus").val(data.aaData[i].politicsStatus);
                $("#cultureLevel").val(data.aaData[i].cultureLevel);
                $("#medicalWay").val(data.aaData[i].medicalWay);
                $("#monthIncome").val(data.aaData[i].monthIncome);
                $("#marriageStatus").val(data.aaData[i].marriageStatus);
                $("#faith").val(data.aaData[i].faith);
                $("#call1Name").val(data.aaData[i].call1Name);
                $("#call1Old").val(data.aaData[i].call1Old);
                $("#call1").val(data.aaData[i].call1);
                $("#call2Name").val(data.aaData[i].call2Name);
                $("#call2Old").val(data.aaData[i].call2Old);
                $("#call2").val(data.aaData[i].call2);
                $("#childAll").val(data.aaData[i].childAll);
                $("#childBoy").val(data.aaData[i].childBoy);
                $("#childGirl").val(data.aaData[i].childGirl);
                $("#homeOldCard").val(data.aaData[i].homeOldCard);
                $("#workName").val(data.aaData[i].workName);
                $("#checkPeoPle").val(data.aaData[i].checkPeoPle);
                $("#checkDate").val(data.aaData[i].checkDate);
            }
        }
    })
}