//$代表document.getelementbyid(id)，相当于get一个元素
$(function(){
    $('#btn_login').click(function()
    {
        //运行一个简单的检查
        if($('#loginName').val()=="")
        {
            $.messager.alert('提示','用户名不能为空');
            return;
        }
        if($('#loginPassword').val()=="")
        {
            $.messager.alert('提示','密码不能为空');
            return;
        }
        else
        {
            var info =
                {
                    loginName: $("#loginName").val(),
                    loginPassword :$("#loginPassword").val(),
                    character:$("#chooseCharacter option:selected").val()

                }
        }
        $.ajax(
            {
                type:'post',
                url:baselocation+"/login",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.info(data);
                    if(data.code === 1){
                        if($("#chooseCharacter option:selected").val()==1)
                        {
                            window.location.href = baselocation + "/home/view";
                        }
                        else
                        {
                            window.location.href = baselocation + "/home/staffView";
                        }

                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }

            }
        )
    });
    }
);

$(function() {
    $('#btn_gotoRegister').click(function() {
        window.location.href = baselocation + "/registerPage";
    })
});