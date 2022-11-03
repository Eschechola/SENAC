while True:
    numero_a_ser_adicionado = 0
    lista_de_numeros = []

    while numero_a_ser_adicionado >= 0:
        numero_a_ser_adicionado = int(input("\n\nQual número deseja adicionar (DIGITE UM NÚMERO NEGATIVO CASO QUEIRA PARAR): "))
        
        if numero_a_ser_adicionado >= 0:
            lista_de_numeros.append(numero_a_ser_adicionado)

    numero_a_ser_pesquisado = int(input("\n\nQual número deseja pesquisar: "))

    if numero_a_ser_pesquisado in lista_de_numeros:
        print("\n\nO número " + str(numero_a_ser_pesquisado) + " EXISTE na lista!")
    else:
        print("\n\nO número " + str(numero_a_ser_pesquisado) + " NÃO EXISTE na lista!")