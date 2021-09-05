function mysel03() {
    var sel03 = document.getElementById("sel03");
    var index = sel03.selectedIndex;
    var text = sel03.options[index].text;

    if (text == "河南") {
        var lab = document.createElement("label");
        lab.innerHTML = "市: ";
        lab.className = "text-left";
        lab.id = "text-sous";
        var headbox = document.getElementById("div02");

        var sel = document.createElement("select");
        sel.id = "sel04";
        var opt1 = document.createElement("option");
        opt1.innerHTML = "郑州";
        opt1.value = 1;
        sel.add(opt1);
        var opt2 = document.createElement("option");
        opt2.innerHTML = "开封";
        opt2.value = 2;
        sel.add(opt2);
        var opt3 = document.createElement("option");
        opt3.innerHTML = "洛阳";
        opt3.value = 3;
        sel.add(opt3);
        sel.className = "form-control";

        headbox.appendChild(lab);
        headbox.appendChild(sel);
    }
}

function mysel01() {
    // 货物sel01下拉框元素
    var sel01 = document.getElementById("sel01");
    var index = sel01.selectedIndex;
    var value = sel01.options[index].value;
    //当选择value=1时 改变后面输入信息
    if (sel01.options[index].value == 1) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }

        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "年  份：";
        var label03 = document.createElement("label");
        label03.className = "text-left";
        label03.id = "text-sou";
        label03.innerHTML = "来  源：";
        var sel02 = document.createElement("select");
        sel02.id = "sel02";
        sel02.className = "form-control";
        var sel03 = document.createElement("select");
        sel03.id = "sel03";
        sel03.className = "form-control";

        var opt1 = document.createElement("option");
        opt1.value = 1;
        opt1.innerHTML = "2020";
        sel02.add(opt1);
        var opt2 = document.createElement("option");
        opt2.value = 2;
        opt2.innerHTML = "2019";
        sel02.add(opt2);
        var opt3 = document.createElement("option");
        opt3.value = 3;
        opt3.innerHTML = "2018";
        sel02.add(opt3);
        var opt4 = document.createElement("option");
        opt4.value = 1;
        opt4.innerHTML = "2017";
        sel02.add(opt4);
        var opt5 = document.createElement("option");
        opt5.value = 1;
        opt5.innerHTML = "全国Ⅰ卷";
        sel03.add(opt5);
        var opt6 = document.createElement("option");
        opt6.value = 2;
        opt6.innerHTML = "全国Ⅱ卷";
        sel03.add(opt6);
        var opt7 = document.createElement("option");
        opt7.value = 3;
        opt7.innerHTML = "北京卷";
        sel03.add(opt7);
        var opt8 = document.createElement("option");
        opt8.value = 4;
        opt8.innerHTML = "江苏卷";
        sel03.add(opt8);


        var div = document.getElementById("head-box");
        div02.appendChild(label02);
        div02.appendChild(sel02);

        div02.appendChild(label03);
        div02.appendChild(sel03);

        div.appendChild(div02);
    }
    //当选择value=2时 改变后面输入信息
    if (sel01.options[index].value == 2) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }


        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "年  份：";
        var label03 = document.createElement("label");
        label03.className = "text-left";
        label03.id = "text-sou";
        label03.innerHTML = "来  源：";
        var sel02 = document.createElement("select");
        sel02.id = "sel02";
        sel02.className = "form-control";
        var sel03 = document.createElement("select");
        sel03.id = "sel03";
        sel03.className = "form-control";

        var opt1 = document.createElement("option");
        opt1.value = 1;
        opt1.innerHTML = "2020";
        sel02.add(opt1);
        var opt2 = document.createElement("option");
        opt2.value = 2;
        opt2.innerHTML = "2019";
        sel02.add(opt2);
        var opt3 = document.createElement("option");
        opt3.value = 3;
        opt3.innerHTML = "2018";
        sel02.add(opt3);
        var opt4 = document.createElement("option");
        opt4.value = 1;
        opt4.innerHTML = "2017";
        sel02.add(opt4);
        var opt5 = document.createElement("option");
        opt5.value = 1;
        opt5.innerHTML = "全国Ⅰ卷";
        sel03.add(opt5);
        var opt6 = document.createElement("option");
        opt6.value = 2;
        opt6.innerHTML = "全国Ⅱ卷";
        sel03.add(opt6);
        var opt7 = document.createElement("option");
        opt7.value = 3;
        opt7.innerHTML = "北京卷";
        sel03.add(opt7);
        var opt8 = document.createElement("option");
        opt8.value = 4;
        opt8.innerHTML = "江苏卷";
        sel03.add(opt8);


        var div = document.getElementById("head-box");

        div02.appendChild(label02);
        div02.appendChild(sel02);

        div02.appendChild(label03);
        div02.appendChild(sel03);

        div.appendChild(div02);

    }

    //当选择value=3时 改变后面输入信息
    if (sel01.options[index].value == 3) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }

        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "年  份：";
        var label03 = document.createElement("label");
        label03.className = "text-left";
        label03.id = "text-sou";
        label03.innerHTML = "来  源：";
        var sel02 = document.createElement("select");
        sel02.id = "sel02";
        sel02.className = "form-control";
        var sel03 = document.createElement("select");
        sel03.id = "sel03";
        sel03.className = "form-control";

        var opt1 = document.createElement("option");
        opt1.value = 1;
        opt1.innerHTML = "2020";
        sel02.add(opt1);
        var opt2 = document.createElement("option");
        opt2.value = 2;
        opt2.innerHTML = "2019";
        sel02.add(opt2);
        var opt3 = document.createElement("option");
        opt3.value = 3;
        opt3.innerHTML = "2018";
        sel02.add(opt3);
        var opt4 = document.createElement("option");
        opt4.value = 1;
        opt4.innerHTML = "2017";
        sel02.add(opt4);
        var opt5 = document.createElement("option");
        opt5.value = 1;
        opt5.innerHTML = "北京卷";
        sel03.add(opt5);
        var opt6 = document.createElement("option");
        opt6.value = 2;
        opt6.innerHTML = "上海卷";
        sel03.add(opt6);
        var opt7 = document.createElement("option");
        opt7.value = 3;
        opt7.innerHTML = "河南卷";
        sel03.add(opt7);


        var div = document.getElementById("head-box");

        div02.appendChild(label02);
        div02.appendChild(sel02);

        div02.appendChild(label03);
        div02.appendChild(sel03);

        div.appendChild(div02);

    }

    //当选择value=4时
    if (sel01.options[index].value == 4) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }


        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "年  份：";
        var label03 = document.createElement("label");
        label03.className = "text-left";
        label03.id = "text-sou";
        label03.innerHTML = "来  源：省： ";
        var sel02 = document.createElement("select");
        sel02.id = "sel02";
        sel02.className = "form-control";
        var sel03 = document.createElement("select");
        sel03.id = "sel03";

        //给sel03加onchange事件
        sel03.onchange = mysel03;

        sel03.className = "form-control";

        var opt1 = document.createElement("option");
        opt1.value = 1;
        opt1.innerHTML = "2020";
        sel02.add(opt1);
        var opt2 = document.createElement("option");
        opt2.value = 2;
        opt2.innerHTML = "2019";
        sel02.add(opt2);
        var opt3 = document.createElement("option");
        opt3.value = 3;
        opt3.innerHTML = "2018";
        sel02.add(opt3);
        var opt4 = document.createElement("option");
        opt4.value = 1;
        opt4.innerHTML = "2017";
        sel02.add(opt4);
        var opt5 = document.createElement("option");
        opt5.value = 1;
        opt5.innerHTML = "北京";
        sel03.add(opt5);
        var opt6 = document.createElement("option");
        opt6.value = 2;
        opt6.innerHTML = "上海";
        sel03.add(opt6);
        var opt7 = document.createElement("option");
        opt7.value = 3;
        opt7.innerHTML = "河南";
        sel03.add(opt7);


        var div = document.getElementById("head-box");

        div02.appendChild(label02);
        div02.appendChild(sel02);

        div02.appendChild(label03);
        div02.appendChild(sel03);

        div.appendChild(div02);
    }

    //当选择value=5时
    if (sel01.options[index].value == 5) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }

        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "教材版本：";
        var label03 = document.createElement("label");
        label03.className = "text-left";
        label03.id = "text-sou";
        label03.innerHTML = "年  级：";
        var sel02 = document.createElement("select");
        sel02.id = "sel02";
        sel02.className = "form-control";
        var sel03 = document.createElement("select");
        sel03.id = "sel03";
        sel03.className = "form-control";
        var sel04 = document.createElement("select");
        sel04.id = "sel04";
        sel04.className = "form-control";
        var sel05 = document.createElement("select");
        sel05.id = "sel05";
        sel05.className = "form-control";


        var label04 = document.createElement("label");
        label04.className = "text-left";
        label04.innerHTML = "章 节： ";
        var sel04 = document.createElement("select");
        sel04.id = "sel04";
        sel04.className = "form-control";
        var sel05 = document.createElement("select");
        sel05.id = "sel05";
        sel05.className = "form-control";

        var opt1 = document.createElement("option");
        opt1.value = 1;
        opt1.innerHTML = "人教版";
        sel02.add(opt1);
        var opt2 = document.createElement("option");
        opt2.value = 2;
        opt2.innerHTML = "苏教版";
        sel02.add(opt2);
        var opt3 = document.createElement("option");
        opt3.value = 3;
        opt3.innerHTML = "青岛版";
        sel02.add(opt3);
        var opt5 = document.createElement("option");
        opt5.value = 1;
        opt5.innerHTML = "小学一年级";
        sel03.add(opt5);
        var opt6 = document.createElement("option");
        opt6.value = 2;
        opt6.innerHTML = "小学二年级";
        sel03.add(opt6);
        var opt7 = document.createElement("option");
        opt7.value = 3;
        opt7.innerHTML = "小学三年级";
        sel03.add(opt7);


        var opt8 = document.createElement("option");
        opt8.value = 1;
        opt8.innerHTML = "第一章";
        sel04.add(opt8);

        var opt9 = document.createElement("option");
        opt9.value = 2;
        opt9.innerHTML = "第二章";
        sel04.add(opt9);

        var opt10 = document.createElement("option");
        opt10.value = 3;
        opt10.innerHTML = "第三章";
        sel04.add(opt10);

        var opt11 = document.createElement("option");
        opt11.value = 1;
        opt11.innerHTML = "第一节";
        sel05.add(opt11);

        var opt12 = document.createElement("option");
        opt12.value = 2;
        opt12.innerHTML = "第二节";
        sel05.add(opt12);

        var opt13 = document.createElement("option");
        opt13.value = 3;
        opt13.innerHTML = "第三节";
        sel05.add(opt13);

        var div = document.getElementById("head-box");

        div02.appendChild(label02);
        div02.appendChild(sel02);

        div02.appendChild(label03);
        div02.appendChild(sel03);

        div02.appendChild(label04);
        div02.appendChild(sel04);
        div02.appendChild(sel05);

        div.appendChild(div02);

    }
    //当选择value=6时
    if (sel01.options[index].value == 6) {
        var div02 = document.getElementById("div02");
        if (div02) {
            div02.remove();
        }
        var div02 = document.createElement("div");
        div02.className = "div02"
        div02.id = "div02";
        var label02 = document.createElement("label");
        label02.className = "text-left";
        label02.id = "text-sou02";
        label02.innerHTML = "来源信息：";
        var input = document.createElement("input");


        var div = document.getElementById("head-box");

        div02.appendChild(label02);
        div02.appendChild(input);

        div.appendChild(div02);
    }
}