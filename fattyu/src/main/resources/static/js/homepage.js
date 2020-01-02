function myinfo(call){
    let allData = {};
    let createNewPost = $.ajax(({
        type:"GET",
        url:"/homepage/userinfo",
        success:function (result) {
            allData.data = result;
            console.log(result);
        },
        error:function () {
            //todo 错误处理
        }
    }));

    $.when(createNewPost).done(()=>call(allData))

}


function myhomeWork(call){
    let allData = {};
    let createNewPost = $.ajax(({
        type:"GET",
        url:"/homepage/homework",
        success:function (result) {
            allData.data = result;
            console.log(result);
            },
        error:function () {
            //todo 错误处理
        }
    }));

    $.when(createNewPost).done(()=>call(allData))
}


