/**
 * Created by horo on 2016/11/7.
 */
/*服务对象登记表*/
//添加
$(function () {
    findAll(1);
})
function add() {
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
    var childAll  = $("#childAll").val();
    var childBoy = $("#childBoy").val();
    var childGirl = $("#childGirl").val();
    var homeOldCard = $("#homeOldCard").val();
    var workName  = $("#workName").val();
    var checkPeoPle = $("#checkPeoPle").val();
    var checkDate = $("#checkDate").val();
    var postData = {
        servicePeopleId:servicePeopleId,
        birthday:birthday,
        nation:nation,
        identityCard:identityCard,
        homeAddress:homeAddress,
        liveCondition:liveCondition,
        selfCareAbility:selfCareAbility,
        personalClassify:personalClassify,
        politicsStatus:politicsStatus,
        cultureLevel:cultureLevel,
        medicalWay:medicalWay,
        monthIncome:monthIncome,
        marriageStatus:marriageStatus,
        faith:faith,
        call1Name:call1Name,
        call1Old:call1Old,
        call1:call1,
        call2Name:call2Name,
        call2Old:call2Old,
        call2:call2,
        childAll:childAll,
        childBoy:childBoy,
        childGirl:childGirl,
        homeOldCard:homeOldCard,
        workName:workName,
        checkPeoPle:checkPeoPle,
        checkDate:checkDate,
    };
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
    })
}
//查看
function findAll(currentPage) {
    var url = domainUrl + '/serve/service_people_register/findAll';
    var getData = {
        currentPage:currentPage,
        limit:limit,
    }
    var html='';
    getAjax(url,false,getData,function (data) {
        console.log(JSON.stringify(data))
    })
}
//删除
function del(id) {
    var url = domainUrl + '/serve/service_people_register/del';
    var postData = {
        id:id
    }
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(1);
    })
}
//修改
function update(id) {
    var url = domainUrl + '/serve/service_people_register/update';
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
    var childAll  = $("#childAll").val();
    var childBoy = $("#childBoy").val();
    var childGirl = $("#childGirl").val();
    var homeOldCard = $("#homeOldCard").val();
    var workName  = $("#workName").val();
    var checkPeoPle = $("#checkPeoPle").val();
    var checkDate = $("#checkDate").val();
    var postData = {
        id:id,
        servicePeopleId:servicePeopleId,
        birthday:birthday,
        nation:nation,
        identityCard:identityCard,
        homeAddress:homeAddress,
        liveCondition:liveCondition,
        selfCareAbility:selfCareAbility,
        personalClassify:personalClassify,
        politicsStatus:politicsStatus,
        cultureLevel:cultureLevel,
        medicalWay:medicalWay,
        monthIncome:monthIncome,
        marriageStatus:marriageStatus,
        faith:faith,
        call1Name:call1Name,
        call1Old:call1Old,
        call1:call1,
        call2Name:call2Name,
        call2Old:call2Old,
        call2:call2,
        childAll:childAll,
        childBoy:childBoy,
        childGirl:childGirl,
        homeOldCard:homeOldCard,
        workName:workName,
        checkPeoPle:checkPeoPle,
        checkDate:checkDate,
    }
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(1);
    })
}