package Servicos.Desconto;

import Utilidades.Valores;

public class ValeRefeicaoDescontoService extends DescontoService {
    @Override
    public double obterValorASerDescontado(double salario) {
        if(salario <= Valores.SALARIO_MINIMO)
            return 0;

        return salario * Valores.PORCENTAGEM_DESCONTO_VALE_REFEICAO;
    }
}
