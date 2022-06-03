var continuar = true;

while (continuar) {
    var option = prompt("1 - Somar 2 números" +
        "\n2 - Calcular o quadrado de um número" +
        "\n3 - Calcular a média de 3 notas" +
        "\n4 - Somar 3 números" +
        "\n0 - Sair");

    switch (option) {
        case "1":
            var numero1 = prompt("Digite o primeiro número: ");
            var numero2 = prompt("Digite o segundo número: ");
            
            var resultado = parseInt(numero1) + parseInt(numero2);

            alert("O resultado da soma é: " + resultado);
            break;

        case "2":
            var numero = prompt("Digite um número: ");
            
            var resultado = parseInt(numero) ** 2;

            alert("O quadrado soma é: " + resultado);
            break;

        case "3":
            var nota1 = prompt("Digite a primeira nota: ");
            var nota2 = prompt("Digite a segunda nota: ");
            var nota3 = prompt("Digite a terceira nota: ");

            var media = (parseFloat(nota1) + parseFloat(nota2) + parseFloat(nota3)) / 3;

            alert("O resultado da média é: " + media.toFixed(2));
            break;

        case "4":
            var numero1 = prompt("Digite o primeiro número: ");
            var numero2 = prompt("Digite o segundo número: ");
            var numero3 = prompt("Digite o terceiro número: ");
            
            var resultado = parseInt(numero1) + parseInt(numero2) + parseInt(numero3);

            alert("O resultado da soma é: " + resultado);
            break;

        case 0:
            continuar = false;
            break;
    }
}
