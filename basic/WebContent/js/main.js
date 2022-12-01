// 密码显示隐藏
let eye = document.querySelector("#eye");
let pwd = document.querySelector("#pwd");

let flag = 0;

function watch (){
    if(flag == 0){
        pwd.type = "text";
        console.log(eye);
        eye.innerHTML = "&#128516;";
        flag = 1;
    }else{
        pwd.type = "password";
        eye.innerHTML = "&#128515;";
        flag = 0;
    }
}




 // 切换页面
var workspace = window.parent.frames["frame3"];

function find() {
    console.log("ssss");
    // window.frames[0].location = "${basePath}/jsp/menu.jsp";
    workspace.location = "../jsp/messageFind.jsp";
}

function infor(){
    workspace.location = "../jsp/Information.jsp";
}


 // 键盘事件
var menu = window.parent.menu;
var flag2 = 0;

// window.document.addEventListener("keyup", function (e) {
//   console.log(e.key);
//   if (e.key == "q") {
//     if (flag2 == 0) {
//       menu.rows = "0,*";
//       flag2 = 1;
//     } else if (flag2 == 1) {
//       menu.rows = "140px,*";
//       flag2 = 0;
//     }
//   }
// });


// 菜单
function open(){
    var size = window.parent.menuSize;
    console.log(size);
//    size.cols = "0,*";
}