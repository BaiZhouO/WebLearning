$(function () {
    $("#btn_addProductToDB").click(function () {
        $.ajax({
            type:'post',
            url:baselocation+"/addProductToDB",
            data:{
                prod_name:$("#prod_name").val(),
                prod_price:$("#prod_price").val(),
                prod_description:$("#prod_description").val(),
                prod_pic_dir:$("#prod_pic_dir").val()
            },
            dataType:'json',
            success:function (data) {
                if(data.code === 1)
                {
                    alert('add success');
                }
                else
                {
                    alert('no success');
                }

            }
        })


    })

})