while True:
    quantidade_de_numeros = int(input("\nDigite a quantidade de números que deseja ler: "))

    lista_de_numeros = []

    for i in range(quantidade_de_numeros):
        numero_a_ser_adicionado = int(input("\nDigite o " + str(i + 1) + " número: "))
        lista_de_numeros.append(numero_a_ser_adicionado)

    numero_a_ser_pesquisado = int(input("\n\nQual número deseja pesquisar: "))

    if numero_a_ser_pesquisado in lista_de_numeros:
        print("\n\nO número " + str(numero_a_ser_pesquisado) + " EXISTE na lista!")
    else:
        print("\n\nO número " + str(numero_a_ser_pesquisado) + " NÃO EXISTE na lista!")