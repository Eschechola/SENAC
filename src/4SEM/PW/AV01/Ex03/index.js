var resultado = document.getElementById("resultado");

function calcularTemperatura(){
    var temperaturaFahrenheit = document.getElementById("fahrenheit").value;

    if(temperaturaFahrenheit == null || temperaturaFahrenheit == "")
        alert("Você precisa inserir um valor válido!");

    var temperaturaGraus = Number((temperaturaFahrenheit-32) * 5/9);

    alert("A temperatura convertida é " + temperaturaGraus.toFixed(1) + " graus");
}

resultado.addEventListener("click", calcularTemperatura)