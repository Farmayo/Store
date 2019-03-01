var val_month = (function () {
    var value = 12;
    function changeValue(val) {
        value = val;
    }
    return{
        getValue: function () {
            return value;
        },
        setValue: function (val) {
            changeValue(val);
        }
    };
})();

var val_taxes = (function () {
    var taxes = 0.02;
    function changeValue(tax) {
        taxes = tax;
    }
    return{
        getValue: function () {
            return taxes;
        },
        setValue: function (tax) {
            changeValue(tax);
        }
    };
})();

document.getElementById("chk_personal").addEventListener("click", function () {
    var personal = document.getElementById("chk_personal");
    if (personal.checked) {
        document.getElementById("chk_rotative").checked = false;
        changeOption("block", "none");
    }
});

document.getElementById("chk_rotative").addEventListener("click", function () {
    var rotative = document.getElementById("chk_rotative");
    if (rotative.checked) {
        document.getElementById("chk_personal").checked = false;
        changeOption("none", "block");
    }
});

function changeOption(personal, rotative) {
    document.getElementsByClassName("personal")[0].style.display = personal;
    document.getElementsByClassName("rotative")[0].style.display = rotative;
}

document.getElementById("chk_personal").addEventListener("click", function () {
    changeOption("block", "none");
});

document.getElementById("chk_rotative").addEventListener("click", function () {
    changeOption("none", "block");
});

document.getElementById("inp_amount").addEventListener("input", function () {
    updateValue();
});

document.getElementById("inp_amountR").addEventListener("input", function () {
    updateValueCR();
});

function changeOption(personal, rotative) {
    document.getElementsByClassName("personal")[0].style.display = personal;
    document.getElementsByClassName("rotative")[0].style.display = rotative;
}

function updateMonths(e) {
    val_month.setValue(e.value);
    var tax = val_month.getValue() % 10;

    if (tax === 0) {
        tax = 10;
    }
    val_taxes.setValue(tax / 10);
    updateValue();
}

function updateValueCR() {
    var salida = document.getElementById("inp_amountR").value;
    salida = replaceSymbol(salida, '$');
    salida = replaceSymbol(salida, ' ');
    salida = replaceSymbol(salida, '.');

    if (parseFloat(salida) >= 500000) {
        var month = document.getElementById("inp_termR").value;
        var life_Insurance = parseFloat(24000);
        var firstMonthlyFeeWLI = Math.floor(salida / month) * 0.19;
        var val = parseInt(firstMonthlyFeeWLI);
        var val2 = parseInt(life_Insurance);
        var val3 = parseInt(val) + parseFloat(val2);
        document.getElementById("valueSSV").innerHTML = "$ - " + val;
        document.getElementById("valueSV").innerHTML = "$ - " + val2;
        document.getElementById("valueCSV").innerHTML = "$ - " + val3;
    } else {
        document.getElementById("valueSSV").innerHTML = "$ - ";
        document.getElementById("valueSV").innerHTML = "$ - ";
        document.getElementById("valueCSV").innerHTML = "$ - ";
    }
    var aux_out = formatNumber(salida);
    document.getElementById("inp_amountR").value = "$ " + aux_out;
}

function updateValue() {
    var out = document.getElementById("inp_amount").value;
    out = replaceSymbol(out, '$');
    out = replaceSymbol(out, ' ');
    out = replaceSymbol(out, '.');

    if (parseFloat(out) >= 1000000) {
        var taxes = Math.floor((out * val_taxes.getValue()) / val_month.getValue()).toFixed(2);
        var val = Math.floor(out / val_month.getValue()).toFixed(2);
        val = parseFloat(val) + parseFloat(taxes);

        val = formatNumber(val);
        document.getElementById("out_value").innerHTML = "Cuota Mensual : $     " + val;
    } else {
        document.getElementById("out_value").innerHTML = "El monto tiene que ser superior a $ 1.000.000";
    }
    var aux_out = formatNumber(out);
    document.getElementById("inp_amount").value = "$ " + aux_out;
}

function replaceSymbol(a, symbol) {
    var tmp = "";

    for (var i = 0; i < a.length; i++) {
        if (a.charAt(i) !== symbol) {
            tmp += a.charAt(i);
        }
    }
    return tmp;
}

function formatNumber(a) {
    var out = "";
    a = String(a);

    var counter = 0;
    for (var i = a.length - 1; i >= 0; i--) {
        if (counter === 3) {
            out = "." + out;
            counter = 0;
        } else {
            counter++;
        }
        out = a.charAt(i) + out;
    }
    return out;
}