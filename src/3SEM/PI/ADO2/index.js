var continuar = true;

while (continuar) {
    var option = prompt("1 - Calcular Idade" +
        "\n2 - Calcular quantidade de degraus" +
        "\n0 - Sair");

    switch (option) {
        case "1":
            var anoNascimento = prompt("Digite o ano que você nasceu: ");
            var anoAtual = prompt("Digite o ano atual: ");
            
            var idade = parseInt(anoAtual) - parseInt(anoNascimento);

            alert("Voce tem " + idade + " anos");
            break;

        case "2":
            var alturaDegrau = prompt("Digite a altura de cada degrau (m): ");
            var tamanhoEscada = prompt("Qual a altura que deseja alcançar com a escada? ");

            var quantidadeDegraus = parseFloat(tamanhoEscada) / parseFloat(alturaDegrau);

            alert("A quantidade de degraus necessários são " + quantidadeDegraus);
            break;

        case 0:
            continuar = false;
            break;
    }
}
