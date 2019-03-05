var control_card = (function (){
    var activate_register = true;
    function changeState(){
        if(activate_register){
            activate_register = false;
        }
        else{
            activate_register = true;
        }
    }
    return {
        change: function (){
            changeState();
        },
        value: function (){
            return activate_register;
        }
    };
})();


document.getElementById("btn_no_registered").addEventListener("click", function (){
    if(control_card.value() === false){
        showCard("block", "none");
    }
    else{
        document.getElementsByClassName("ja_card")[0].classList.add("ja_shake");
        setTimeout(function (){
            document.getElementsByClassName("ja_card")[0].classList.remove("ja_shake");
        }, 500);
    }
});

document.getElementById("btn_login").addEventListener("click", function (){
    if(control_card.value()){
        showCard("none", "block");
    }
    else{
        document.getElementsByClassName("ja_card_login")[0].classList.add("ja_shake");
        setTimeout(function (){
            document.getElementsByClassName("ja_card_login")[0].classList.remove("ja_shake");
        }, 500);
    }
});

function showCard(register, login) {
    document.getElementsByClassName("register")[0].style.display = register;
    document.getElementsByClassName("login")[0].style.display = login;

    
    control_card.change();
}