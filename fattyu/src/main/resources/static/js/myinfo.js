function myinfo(call) {
    let allData={};
    let infoRequest= $.ajax(({
                url:"/homepage/getmyinfo",
                type:"GET",
                success:function (result) {
                    allData.myinfo = result;
                    console.log(result);
                },
                error:function () {
                    //todo 错误处理
                }
            }
        ));
    $.when(infoRequest).done(()=>call(allData));
}
