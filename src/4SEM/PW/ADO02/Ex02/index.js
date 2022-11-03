var resultado = document.getElementById("resultado");

function calcularMediaAritimetica(){
    var primeiroNumero = Number(document.getElementById('primeiroNumero').value);
    var segundoNumero = Number(document.getElementById('segundoNumero').value);
    var terceiroNumero = Number(document.getElementById('terceiroNumero').value);
    var quartoNumero = Number(document.getElementById('quartoNumero').value);

    var media = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;

    alert('A média é: ' + media)
}

resultado.addEventListener("click", calcularMediaAritimetica)