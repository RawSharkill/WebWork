function myrecord(classId,call){
    let allData = {};
    let createNewPost = $.ajax(({
        type:"GET",
        url:"/record/userinfo/" + classId,
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