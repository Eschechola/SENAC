var resultado = document.getElementById("calcularResultado");

function calcularResultado(){
    var primeiroNumero = Number(document.getElementsByName('primeiroNumero')[0].value);
    var segundoNumero = Number(document.getElementsByName('segundoNumero')[0].value);

    var operacao = document.querySelector('input[name="opcao"]:checked').value;

    var resultado = 0;
    
    switch(operacao){
        case "soma":
            resultado = primeiroNumero + segundoNumero;
            break;

        case "subtracao":
            resultado = primeiroNumero - segundoNumero;
            break;

        case "multiplicacao":
            resultado = primeiroNumero * segundoNumero;
            break;

        case "divisao":
            resultado = primeiroNumero / segundoNumero;
            break;
    }


    document.getElementsByName('resultado')[0].value = resultado;

}

resultado.addEventListener("click", calcularResultado)