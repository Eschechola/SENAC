function calcularValorDoProduto(){
    var preco = parseFloat(document.getElementById("price").value);
    var metodoDePagamento = parseInt(document.getElementById("payment-method").value);

    switch(metodoDePagamento){
        case 1:
            preco -= preco * 0.1;
            break;

        case 2:
            preco -= preco * 0.05;
            break;

        case 3:
            preco += preco * 0.1;
            break;
    }

    const inputIR = document.getElementById("product-value")
    inputIR.value = preco.toFixed(2);
}


const button = document.getElementById("button");
button.addEventListener("click", calcularValorDoProduto);