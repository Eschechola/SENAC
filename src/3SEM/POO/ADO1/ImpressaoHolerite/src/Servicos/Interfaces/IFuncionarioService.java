package Servicos.Interfaces;

import Entidades.Funcionario;

import java.util.ArrayList;

public interface IFuncionarioService {
    boolean adicionarFuncionario(Funcionario funcionario);
    boolean removerFuncionario(String idFuncionario);
    ArrayList<Funcionario> obterFuncionariosCadastrados();
    ArrayList<Funcionario> obterFuncionariosComSalarioLiquidoCalculado();
}
