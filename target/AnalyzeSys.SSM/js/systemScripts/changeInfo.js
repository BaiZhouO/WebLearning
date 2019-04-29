$(function () {
    $('#btn_changeInfo').click(function ()
    {
        function checkPhone() {
            //只输入数字
            var number = /^1[3|4|5|7|8][0-9]\d{4,8}$/;
            var phone = $("#cus_phone").val();
            var ret = number.test(phone);
            if (phone == "") {
                $("cus_phone-message").innerHTML = "";
            } else if ((phone.length < 11 && phone.length > 0) || (ret != true && phone.length > 0)) {
                $("cus_phone-message").innerHTML = "请确保正确输入11位手机号码";
                return false;
            } else {
                $("cus_phone-message").innerHTML = "";
            }
        }

        function checkEmail()
        {
            var emailFormat = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
            var email = $("#Email").val();
            var ret = emailFormat.test(email);

            if(email == ""){
                $("email-message").innerHTML = "";
            }
            else if(ret != true && email.length>0)
            {
                $("email-message").innerHTML = "请检查邮箱格式";
                return false;
            }
            else
            {
                $("email-message").innerHTML = "";
            }

        }

        if(checkPhone()==false||checkEmail()==false)
        {
            alert("您的表单包含无效信息，请检查并修改后再次提交！")
        }

        else
        {
            var info ={
                cus_name: $("#cus_name").val(),
                cus_phone: $("#cus_phone").val(),
                cus_address: $("#cus_address").val(),
                sex: $("#sex").val(),
                Email :$("#Email").val()
            }
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/changeInfo",
                data:info,
                dataType:'json',
                success:function (data) {
                    console.info(data);
                    if(data.code === 1)
                    {
                        alert('modify success!');
                    }

                    else
                    {
                        alert('error: the status of web is '+data.code+', debug it!');//查看webResult的code
                    }


                }

            }
        )

    })

})