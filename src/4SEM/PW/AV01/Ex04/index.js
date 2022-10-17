var resultado = document.getElementById("resultado");

function calcularMenorNumero(){
    var primeiroNumero = document.getElementById("primeiroNumero").value;

    if(primeiroNumero == null || primeiroNumero == "")
        alert("Você precisa inserir o primeiro número!");

    var segundoNumero = document.getElementById("segundoNumero").value;

    if(segundoNumero == null || segundoNumero == "")
        alert("Você precisa inserir o segundo número!");

    var terceiroNumero = document.getElementById("terceiroNumero").value;

    if(primeiroNumero == null || primeiroNumero == "")
        alert("Você precisa inserir o terceiro número!");

    alert("O maior número é: " + Math.max(primeiroNumero, segundoNumero, terceiroNumero));
}

resultado.addEventListener("click", calcularMenorNumero)