package Servicos.Desconto;

import Utilidades.Valores;

public class INSSDescontoService extends DescontoService {
    @Override
    public double obterValorASerDescontado(double salario) {
        double desconto = 0;

        if(salario <= 1212)
            desconto = salario * Valores.PORCENTAGEM_DESCONTO_INSS_FAIXA1;
        else if(salario > 1212 && salario < 2427.35)
            desconto = salario * Valores.PORCENTAGEM_DESCONTO_INSS_FAIXA2;
        else if(salario > 2427.35 && salario <= 3641.03)
            desconto = salario * Valores.PORCENTAGEM_DESCONTO_INSS_FAIXA3;
        else
            desconto = salario * Valores.PORCENTAGEM_DESCONTO_INSS_FAIXA4;

        if(desconto > Valores.TETO_INSS)
            return Valores.TETO_INSS;

        return desconto;
    }
}
