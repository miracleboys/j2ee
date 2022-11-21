let eye = document.querySelector("#eye");
let pwd = document.querySelector("#pwd");

let flag = 0;

function watch (){
    if(flag == 0){
        pwd.type = "text";
        eye.src = "${basePath}/images/open.png";
        flag = 1;
    }else{
        pwd.type = "password";
        eye.src = "${basePath}/images/close.png";
        flag = 0;
    }
}