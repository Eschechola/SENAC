var resultado = document.getElementById("resultado");

function calcularSalarioComAumento(){
    var salarioAtual = document.getElementById("salarioAtual").value;
    var salarioComAumento = Number(salarioAtual) + (Number(salarioAtual) * 0.25);

    document.getElementById("exibirResultado").style.display = "block";
    
    document.getElementById("exibirSalarioAtual").innerHTML += salarioAtual;
    document.getElementById("exibirSalarioComAumento").innerHTML += salarioComAumento;
}

resultado.addEventListener("click", calcularSalarioComAumento)