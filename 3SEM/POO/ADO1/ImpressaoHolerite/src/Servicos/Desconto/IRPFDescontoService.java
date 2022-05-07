package Servicos.Desconto;

import Utilidades.Valores;

public class IRPFDescontoService extends DescontoService {
    @Override
    public double obterValorASerDescontado(double salario) {
        if(salario < 1903.98)
            return 0;

        else if(salario > 1903.98 && salario <= 2826.65)
            return salario * Valores.PORCENTAGEM_DESCONTO_IRPF_FAIXA1;

        else if(salario > 2826.65 && salario < 3751.06)
            return salario * Valores.PORCENTAGEM_DESCONTO_IRPF_FAIXA2;

        else if(salario > 3751.06 && salario <= 4664.68)
            return salario * Valores.PORCENTAGEM_DESCONTO_IRPF_FAIXA3;

        else
            return salario * Valores.PORCENTAGEM_DESCONTO_IRPF_FAIXA4;
    }
}
