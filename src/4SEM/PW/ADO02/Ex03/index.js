var resultado = document.getElementById("resultado");

function calcularMediaAritimetica(){
    var numero = Number(document.getElementById('numero').value);

    alert('O dobro é: ' + numero * 2)
}

resultado.addEventListener("click", calcularMediaAritimetica)