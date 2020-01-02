function myrecord(call){
    let allData = {};
    let createNewPost = $.ajax(({
        type:"GET",
        url:"/record/all/" ,
        success:function (result) {
            allData.data = result;
        },
        error:function () {
            //todo 错误处理
        }
    }));

    $.when(createNewPost).done(()=>call(allData))
}