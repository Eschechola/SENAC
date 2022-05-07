package Servicos.Funcionario;

import Entidades.Funcionario;
import Servicos.Desconto.*;
import Servicos.Interfaces.IFuncionarioService;

import java.util.ArrayList;

public class FuncionarioService implements IFuncionarioService
{
    private static ArrayList<Funcionario> _funcionarios;

    public FuncionarioService(){
        _funcionarios = new ArrayList<Funcionario>();
    }

    @Override
    public boolean adicionarFuncionario(Funcionario funcionario) {
        _funcionarios.add(funcionario);
        return true;
    }

    @Override
    public boolean removerFuncionario(String idFuncionario) {
        for(int i = 0; i < _funcionarios.size(); i++)
        {
            if(_funcionarios.get(i).getId().equals(idFuncionario))
                _funcionarios.remove(i);
        }

        return true;
    }

    @Override
    public ArrayList<Funcionario> obterFuncionariosCadastrados() {
        return _funcionarios;
    }

    @Override
    public ArrayList<Funcionario> obterFuncionariosComSalarioLiquidoCalculado() {
        for(int i = 0; i < _funcionarios.size(); i++)
        {
            Funcionario funcionario = _funcionarios.get(i);

            if(funcionario.getDescontoCalculado())
                continue;

            double salarioBruto = funcionario.getSalarioBruto();

            double descontoConvenio = new ConvenioDescontoService().obterValorASerDescontado(salarioBruto);
            double descontoTransporte = new ValeTransporteDescontoService().obterValorASerDescontado(funcionario);
            double descontoRefeicao = new ValeRefeicaoDescontoService().obterValorASerDescontado(salarioBruto);
            double descontoAlimentacao = new ValeAlimentacaoDescontoService().obterValorASerDescontado(salarioBruto);
            double descontoIRPF = new IRPFDescontoService().obterValorASerDescontado(salarioBruto);
            double descontoINSS = new INSSDescontoService().obterValorASerDescontado(salarioBruto - descontoIRPF);

            funcionario.descontarDoSalario(descontoConvenio);
            funcionario.descontarDoSalario(descontoTransporte);
            funcionario.descontarDoSalario(descontoRefeicao);
            funcionario.descontarDoSalario(descontoAlimentacao);
            funcionario.descontarDoSalario(descontoIRPF);
            funcionario.descontarDoSalario(descontoINSS);

            funcionario.setDescontoConvenio(descontoConvenio);
            funcionario.setDescontoTransporte(descontoTransporte);
            funcionario.setDescontoRefeicao(descontoRefeicao);
            funcionario.setDescontoAlimentacao(descontoAlimentacao);
            funcionario.setDescontoIRPF(descontoIRPF);
            funcionario.setDescontoINSS(descontoINSS);

            funcionario.adicionarBonusAoSalario();

            funcionario.setDescontoCalculado(true);
        }

        return _funcionarios;
    }
}
