function calcularImpostoDeRenda(){
    var desconto = 0;
    const salario = parseFloat(document.getElementById("salary").value);

    if(salario <= 1434)
        desconto = 0;
    
    else if(salario > 1434 && salario <= 2150)
        desconto = salario * 0.075

    else if(salario > 2150 && salario <= 2866)
        desconto = salario * 0.15;

    else if(salario > 2866 && salario <= 3582)
        desconto = salario * 0.225;

    else
        desconto = salario * 0.275

    const inputIR = document.getElementById("ir")
    inputIR.value = "Desconto de R$ " + desconto.toFixed(2);
}


const button = document.getElementById("button");
button.addEventListener("click", calcularImpostoDeRenda);