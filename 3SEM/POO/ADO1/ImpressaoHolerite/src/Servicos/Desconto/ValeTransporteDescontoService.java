package Servicos.Desconto;

import Entidades.Funcionario;
import Utilidades.Valores;

public class ValeTransporteDescontoService extends DescontoService {
    public double obterValorASerDescontado(Funcionario funcionario) {
        if(!funcionario.getUsaValeTransporte())
            return 0;

        double gastoTransporteMensal = funcionario.getCustoTransporteDiario() * funcionario.getDiasTrabalhados();
        double descontoMensalMaximo = funcionario.getSalarioBruto() * Valores.PORCENTAGEM_DESCONTO_VALE_TRANSPORTE;

        if(gastoTransporteMensal > descontoMensalMaximo)
            return descontoMensalMaximo;

        return gastoTransporteMensal;
    }
}
