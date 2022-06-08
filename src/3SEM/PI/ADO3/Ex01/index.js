function exibirSoma(){
    console.log("a")
    const range = document.getElementById("range").value;
    const soma = somarInteirosPositivos(range);

    alert("A soma é " + soma)
}

function somarInteirosPositivos(range) {
    if(range < 0)
    {
        alert("O número deve ser inteiro e positivo");
        return;
    }
    
    var soma = 0;

    for(var i = 0; i <= range; i++)
        soma += i;

    return soma;
}

const button = document.getElementById("calculate");
button.addEventListener("click", exibirSoma);