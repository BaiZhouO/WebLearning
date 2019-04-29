$(function () {
    $('#btn_register').click(function ()
    {
        function checkId() {
            //字母数字下划线
            var regex = /^[^_][A-Za-z]*[a-z0-9_]*$/;
            var inputValue = $("#loginName").val();  //注意，用jquery的语法$，就用匹配的.val()语法来获取值；用document.getElementById()就用.value
            var ret = regex.test(inputValue);
            if (inputValue == "") {
                $("id-message").innerHTML = ""
            } else if (inputValue.length > 20 || inputValue.length == 1 || ret != true) {
                $("id-message").innerHTML = "输入2-20位数字字母下划线";
                return false;
            } else {
                $("id-message").innerHTML = ""
            }
        }

        function checkPassword() {
            var inputValue = $("#loginPassword").val(); //#id是jQuery的选择器，CSS中选择元素的方式是#id,.class，jQuery和此相同
            if (inputValue.length == 1 || inputValue.length > 20) {
                $("password-message").innerHTML = "请输入2-20个任意字符"
                return false;
            } else {
                $("password-message").innerHTML = "";
            }
        }

        function checkPasswordRepeat() {
            var password = $("#loginPassword").val();
            var repassword = $("#passwordConfirm").val();
            if (repassword == "") {
                $("repassword-message").innerHTML = ""
            } else if (repassword != password) {
                $("repassword-message").innerHTML = "请确保两次输入的密码一致"
                return false;
            } else {
                $("repassword-message").innerHTML = "";
            }
        }

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

        /*function checkManager() {
            //只输入字母和汉字
            var word = /^[a-zA-Z\u4e00-\u9fa5]+$/;
            var manager = $("#description").val();
            var ret = word.test(manager);
            if (ret != true && manager.length > 0) {
                $("manager-message").innerHTML = "请确保您输入的内容只有汉字和字母";
                return false;
            } else {
                $("manager-message").innerHTML = "";
            }
        }*/


        /*function keyPress() {

            var keyCode = event.keyCode;

            if ((keyCode >= 48 && keyCode <= 57))

            {

                event.returnValue = true;

            } else {

                event.returnValue = false;

            }

        }*/

        if (checkId() == false || checkPassword() == false || checkPasswordRepeat() == false || checkPhone() == false || checkEmail() == false) {
            alert("您的表单包含无效信息，请检查并修改后再次提交！")
        }

        else {
            var info = {
                loginName: $("#loginName").val(),
                loginPassword: $("#loginPassword").val(),
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
                url:baselocation+"/register",
                data:info,
                dataType:'json',
                success:function(data){
                    console.info(data);
                    if(data.code === 1)
                    {
                        alert('register success!');
                    }
                    else {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }

            }
        )


    })

})


$(function() {
    $('#btn_gotoLogin').click(function() {
          window.location.href = baselocation + "/login";
    })
});