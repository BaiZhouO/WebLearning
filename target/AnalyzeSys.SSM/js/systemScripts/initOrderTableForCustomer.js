var $table = $('#order_table');
$(function () {

    $table.bootstrapTable({
        url: baselocation + '/showOrder/',
        method: 'get',
        toolbar: '#toolbar',   //工具按钮用的容器
        striped: true,         //是否显示行间隔色
        cache: false,          //是否使用缓存
        detailView: true,
        pagination: true,     //是否显示分页
        pageNumber: 1,
        pageSize: 5,
        pageList: [5, 10, 15, 20, 30],
        showRefresh: true,
        showColumns: true,
        minimumCountColumns: 2,
        clickToSelect: true,
        clickEdit: true,
        searchOnEnterKey: true,

        sidePagination: "server",
        //search:true,
        height: 500,
        idField: "order_id",
        sortName: "order_id",
        sortOrder: "desc",
        showToggle: true,     //是否显示详细试图和列表试图的切换按钮
        cardView: false,      //是否显示详细视图
        columns: [
            {
                checkbox: true
            },
            {
                field: 'order_id',
                title: '订单编号',
                align: 'center',
                halign: 'center',
                sortable: true
            },
            {
                field: 'cus_id',
                title: '会员编号',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            },
            {
                field: 'prod_id',
                title: '商品编号',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            },
            {
                field: 'prod_count',
                title: '数量',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            },
            {
                field: 'price',
                title: '价格',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            },
            {
                field: 'status',
                title: '状态',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            },
            {
                field: 'submit_date',
                title: '提交日期',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false,
                formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }
            },
            {
                field: 'handle_date',
                title: '处理日期',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false,
                formatter: function (value, row, index) {
                    return changeDateFormat(value)
                }
            },
            {
                field: 'sendAddress',
                title: '发货地址',
                align: 'center',
                halign: 'center',
                sortable: true,
                editable: false
            }
        ]
    })
})

function changeDateFormat(cellval) {
    var dateVal = cellval + "";
    if (cellval != null) {
        var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

        var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
        var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
        var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();

        return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
    }
}