var $table = $('#cart_table');
$(function () {

    $table.bootstrapTable({
        url:baselocation+'/showCart/',
        method:'get',
        toolbar:'#toolbar',   //工具按钮用的容器
        striped:true,         //是否显示行间隔色
        cache:false,          //是否使用缓存
        detailView: true,
        pagination: true,     //是否显示分页
        paginationLoop: false,
        pageNumber:1,
        pageSize:5,
        pageList:[5,10,15,20,30],
        showRefresh:true,
        showColumns: true,
        minimumCountColumns: 2,
        clickToSelect: true,
        clickEdit:true,
        searchOnEnterKey: true,

        sidePagination:"server",
        //search:true,
        height:500,
        idField:"Product_prod_id",
        sortName:"Product_prod_id",
        sortOrder:"desc",
        showToggle:true,     //是否显示详细试图和列表试图的切换按钮
        cardView:false,      //是否显示详细视图
        columns:[
            {
                checkbox:true
            },
            {
                field:'Product_prod_id',
                title:'产品编号',
                align:'center',
                halign:'center',
                sortable:true
            },
            {
                field:'prod_name',
                title:'产品名',
                align:'center',
                halign:'center',
                sortable:true,
                editable:false
            },
            {
                field:'total_count',
                title:'数量',
                align:'center',
                halign:'center',
                sortable:true,
                editable:{
                    type:'text',
                    mode:'inline',
                    title:'购买数量',
                    validate:function(v)
                    {
                        if(!v) return '购买数量不能为空';
                    }
                }
            },
            {
                field:'total_price',
                title:'价格',
                align:'center',
                halign:'center',
                sortable:true,
                editable:false
            },
            {
                field:'cus_id',
                title:'顾客id',
                align:'center',
                halign:'center',
                sortable:true
            },],

        onEditableSave: function (field,row,oldValue,$el) {

            var newValue = row[field];
            var info =
                {
                    newValue:newValue,
                    prod_name:row.prod_name
                }
                $.ajax({
                    type:'post',
                    url:baselocation+'/update',
                    data:info,
                    dataType:'json',

                    success:function(data)
                    {
                        if(data.code === 1)
                        {
                            alert('modify success');
                            window.location.reload();
                        }
                        else
                        {
                            alert('not success');
                        }
                    }

                })

            }




    })


    $('#btn_delete').click(function ()
    {
        var rows = $table.bootstrapTable('getSelections'); //获得要删除的数据
        if(rows.length == 0)
        {
            alert("please choose at least one row that you wanna delete");
        }
        else
        {
            if(!confirm("are you sure to delete these?"))
                return;

            var ids = new Array();
            $(rows).each(function()
            {
                var obj = $(this);
                var key = "product_prod_id";
                var currentId = obj[0][key];
                ids.push(currentId);
            });

            console.log(ids);

            $.ajax({
                type:'post',
                url:baselocation+"/delete",
                data:{
                    ids:ids
                },
                dataType:'json',
                traditional: true,                 //防止jQuery深度序列化数组导致servlet api无法处理的情况
                success:function (data) {
                    console.info(ids);
                    if(data.code === 1)
                    {
                        alert('delete success');
                        window.location.reload();
                    }
                    else
                    {
                        alert('not success');
                    }
                }
            })
        }
    })
})


$(function () {
    $('#btn_submitOrder').click(function ()
    {
        $.ajax({
            type:'post',
            url:baselocation+"/addToOrder",
            success:function (data) {
                if(data.code === 1)
                {
                    alert('added to order!');
                }
                else
                {
                    alert('error: the status of web is '+data.code+', which means '+data.message+', debug it');
                }

            }

        })


    })

})