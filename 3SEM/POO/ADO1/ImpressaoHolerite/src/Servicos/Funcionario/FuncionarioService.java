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

            descontarConvenio(funcionario);
            descontarValeTransporte(funcionario);
            descontarValeRefeicao(funcionario);
            descontarValeAlimentacao(funcionario);
            descontarIRPF(funcionario);
            descontarINSS(funcionario);
            descontarINSS(funcionario);

            aplicarBonusAoSalario(funcionario);
        }

        return _funcionarios;
    }

    private void descontarConvenio(Funcionario funcionario){
        var descontoService = new ConvenioDescontoService();

        double salarioBruto = funcionario.getSalarioBruto();
        double desconto = descontoService.obterValorASerDescontado(salarioBruto);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoConvenio(desconto);
    }

    private void descontarValeTransporte(Funcionario funcionario){
        var valeTransporteService = new ValeTransporteDescontoService();
        double desconto = valeTransporteService.obterValorASerDescontado(funcionario);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoTransporte(desconto);
    }

    private void descontarValeRefeicao(Funcionario funcionario){
        var valeRefeicaoService = new ValeRefeicaoDescontoService();

        double salarioBruto = funcionario.getSalarioBruto();
        double desconto = valeRefeicaoService.obterValorASerDescontado(salarioBruto);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoRefeicao(desconto);
    }

    private void descontarValeAlimentacao(Funcionario funcionario){
        var valeAlimentacaoService = new ValeAlimentacaoDescontoService();

        double salarioBruto = funcionario.getSalarioBruto();
        double desconto = valeAlimentacaoService.obterValorASerDescontado(salarioBruto);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoAlimentacao(desconto);
    }

    private void descontarIRPF(Funcionario funcionario){
        var IRPFService = new IRPFDescontoService();

        double salarioBruto = funcionario.getSalarioBruto();
        double desconto = IRPFService.obterValorASerDescontado(salarioBruto);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoIRPF(desconto);
    }

    private void descontarINSS(Funcionario funcionario){
        var INSSService = new INSSDescontoService();

        double salarioBruto = funcionario.getSalarioBruto();
        double salarioADescontar = salarioBruto - funcionario.getDescontoINSS();
        double desconto = INSSService.obterValorASerDescontado(salarioADescontar);

        funcionario.descontarDoSalario(desconto);
        funcionario.setDescontoINSS(desconto);
    }

    private void aplicarBonusAoSalario(Funcionario funcionario){
        funcionario.adicionarBonusAoSalario();
        funcionario.setDescontoCalculado(true);
    }
}
