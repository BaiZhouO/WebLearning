$(function() {
    $('#a_gotoHomepage').click(function() {
        window.location.href = baselocation + "/home/view";
    })
});
$(function() {
    $('#a_gotoHomepageForStaff').click(function() {
        window.location.href = baselocation + "/home/staffView";
    })
});


$(function() {
    $('#a_gotoViewOrder').click(function() {
        window.location.href = baselocation + "/showOrder/view";
    })
});

$(function() {
    $('#a_gotoViewOrderForStaff').click(function() {
        window.location.href = baselocation + "/showOrderForStaff/viewForStaff";
    })
});


$(function() {
    $('#a_gotoViewPersonInfo').click(function() {
        window.location.href = baselocation + "/info/viewPersonInfo/view";
    })
});

$(function() {
    $('#a_gotosocial').click(function() {
        window.location.href = baselocation + "/social/social/view";
    })
});

$(function() {
    $('#a_InsideGotoDataTotal').click(function() {
        window.location.href = baselocation + "/dataAnalyze/dataTotal/view";
    })
});

$(function() {
    $('#a_InsideGotoDataDiagram').click(function() {
        window.location.href = baselocation + "/dataAnalyze/dataDiagram/view";
    })
});

$(function() {
    $('#a_InsideGotoViewPersonInfo').click(function() {
        window.location.href = baselocation + "/info/viewPersonInfo/view";
    })
});

$(function() {
    $('#a_InsideGotoChangePersonInfo').click(function() {
        window.location.href = baselocation + "/info/changePersonInfo/view";
    })
});

$(function() {
    $('#a_InsideGotoPublishMsg').click(function() {
        window.location.href = baselocation + "/social/publishMsg/view";
    })
});

$(function() {
    $('#a_InsideGotoMsgDetail').click(function() {
        window.location.href = baselocation + "/social/msgDetail/view";
    })
});


$(function() {
    $('#btn_logout').click(function() {
        $.ajax({
            type:'get',
            url:baselocation+"/logout",
            success:function (data) {
                if(data.code === 1)
                {
                    window.location.href = baselocation+"/login";
                }
            }
        })
    })
});


