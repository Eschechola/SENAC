package Servicos.Desconto;

import Utilidades.Valores;

public class ConvenioDescontoService extends DescontoService {
    @Override
    public double obterValorASerDescontado(double salario) {
        if(salario <= Valores.SALARIO_MINIMO)
            return 0;

        return salario * Valores.PORCENTAGEM_DESCONTO_CONVENIO_MEDICO;
    }
}
