//post过去一个序列号，在controller那里获取序列号后对product_id映射，拿到一个product展示到viewDetails页面上去

$(function(){
    $('#btn_showDetails_1').click(function ()
    {
        var info = {
            sequenceNumber:1
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetails_2').click(function ()
    {
        var info = {
            sequenceNumber:2
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetails_3').click(function ()
    {
        var info = {
            sequenceNumber:3
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetails_4').click(function ()
    {
        var info = {
            sequenceNumber:4
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetails_5').click(function ()
    {
        var info = {
            sequenceNumber:5
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetails_6').click(function ()
    {
        var info = {
            sequenceNumber:6
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetails",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetails";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_1').click(function ()
    {
        var info = {
            sequenceNumber:1
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_2').click(function ()
    {
        var info = {
            sequenceNumber:2
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_3').click(function ()
    {
        var info = {
            sequenceNumber:3
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_4').click(function ()
    {
        var info = {
            sequenceNumber:4
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_5').click(function ()
    {
        var info = {
            sequenceNumber:5
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function(){
    $('#btn_showDetailsforStaff_6').click(function ()
    {
        var info = {
            sequenceNumber:6
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/viewDetailsForStaff",
                data:info,
                dataType:'json',
                success:function(data)
                {
                    console.info(data);
                    if(data.code === 1)
                    {
                        window.location.href = baselocation+"/viewDetailsForStaff";
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }
            }
        )

    })
})

$(function () {
    $('#btn_addToCart').click(function () {
        if($('#Prod_count').val()!=null || $('#Prod_count').val()!= '')
        {
            var info =
                {
                    Prod_count:$('#Prod_count').val()
                }
        }
        else
        {
            alert('please type in the number of products that you want to add to cart')
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/addToCart",
                data:info,
                dataType:'json',
                success:function (data) {
                    console.info(data);
                    if(data.code === 1)
                    {
                        alert('add success');
                    }
                    else
                    {
                        alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                    }
                }

            }
        )

    })

})


$(function() {
    $('#btn_showCart').click(function() {
        window.location.href = baselocation + "/showCart/view";
    })
});

$(function () {
    $('#btn_gotoAddProduct').click(function () {
        window.location.href = baselocation + "/addProductPage";
    })
})

$(function () {
    $('#btn_modifyProduct').click(function () {
        window.location.href = baselocation + "/modifyProduct";
    })

})

$(function () {
    $("#btn_deleteProduct").click(function () {
        $.ajax({
            type:'post',
            url:baselocation + "/deleteProduct",
            success:function (data) {
                if(data.code === 1)
                {
                    alert("delete success");
                    window.location.href = baselocation+"/home/staffView"
                }
            }
        })

    })

})


$(function () {
    $('#btn_modify').click(function () {
        $.ajax({
            type:'post',
            url:baselocation+"/modify",
            data:{
                prod_price:$("#prod_price").val(),
                prod_description:$("#prod_description").val()
            },
            dataType:'json',
            success:function (data) {
                if(data.code === 1)
                {
                    alert("modify success");
                }
                else
                {
                    alert("modify not success");
                }

            }
        })
    })

})