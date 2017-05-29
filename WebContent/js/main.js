/**
 * Created by Guo Haoming on 2017/4/24.
 */

function today() {
    var datenode = document.getElementsByName("date");
    var date = new Date();
    var day = date.getMonth() + 1;
    for (var i = 0; i < datenode.length; i++) {
	datenode[i].innerHTML = "今天是" + date.getFullYear() + "年" + day + "月"
	+ date.getDate() + "日";
    }
}

$('#myAffix').affix({
    offset : {
	top : 150
    }
})

function repeatPassword() {
    var p1 = document.getElementsByName("password");
    var p2 = document.getElementsByName("passwordrepeat");
    if (p1[0].value != p2[0].value) {
	alert("两次输入密码不一致");
    }
}
