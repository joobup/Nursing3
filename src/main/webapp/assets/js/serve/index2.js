$(function () {
    $(".side-list").click(function () {
        if(this.id == "serve"){
            location.href=""
        }else if(this.id == "ify"){
            location.href=""
        }else if(this.id == "cost"){
            location.href=""
        }else if(this.id == "staff"){
            location.href="/nursing/rest/serve/staff/staff2"
        }else if(this.id == "pack"){
            location.href=""
        }
    })
})