const checkObj ={
    "inputId" : false,
    "inputPw" : false,
    "inputPwConfirm" : false,
    "inputName" : false
};

const inputId = document.getElementById("inputId");

inputId.addEventListener("change", function() {

    const regExp = /^[a-z][\w]{5,13}$/;

    if( regExp.test(this.value)){
        this.style.backgroundColor = "lightgreen";
    }else{

    }



});