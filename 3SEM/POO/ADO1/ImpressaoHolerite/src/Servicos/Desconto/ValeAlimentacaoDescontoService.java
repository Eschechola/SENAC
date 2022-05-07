package Servicos.Desconto;

import Utilidades.Valores;

public class ValeAlimentacaoDescontoService extends DescontoService {
    @Override
    public double obterValorASerDescontado(double salario) {
        if(salario < (Valores.SALARIO_MINIMO * 3))
            return 0;

        return salario * Valores.PORCENTAGEM_DESCONTO_VALE_ALIMENTACAO;
    }
}
