public class FuncionarioService {
    private Funcionario[] _funcionarios;

    public FuncionarioService(){
        _funcionarios = new Funcionario[0];
    }

    public void cadastrarFuncionarios(Funcionario[] funcionarios){
        for(int i = 0; i < funcionarios.length; i++)
            cadastrarFuncionario(funcionarios[i]);
    }

    public void cadastrarFuncionario(Funcionario funcionario){
        Funcionario[] _funcionariosAuxiliar = new Funcionario[_funcionarios.length + 1];

        for(int i = 0; i < _funcionarios.length; i++)
            _funcionariosAuxiliar[i] = _funcionarios[i];

        _funcionariosAuxiliar[_funcionariosAuxiliar.length - 1] = funcionario;

        int novoId = _funcionariosAuxiliar.length;
        _funcionariosAuxiliar[_funcionariosAuxiliar.length - 1].setId(novoId);

        _funcionarios = _funcionariosAuxiliar;
    }

    public boolean atualizarSalario(int idFuncionario, double salarioAtualizado) throws Exception {
        verificarSeOFuncionarioExiste(idFuncionario);

        for(int i = 0; i < _funcionarios.length; i++){
            if(_funcionarios[i].getId() == idFuncionario){
                _funcionarios[i].setSalario(salarioAtualizado);
                return true;
            }
        }

        return false;
    }

    public void removerFuncionario(int idFuncionario) throws Exception {
        verificarSeOFuncionarioExiste(idFuncionario);

        Funcionario[] _funcionariosAuxiliar = new Funcionario[_funcionarios.length - 1];
        int contadorFuncionarios = 0;

        for(int i = 0; i < _funcionarios.length; i++){
            if(_funcionarios[i].getId() != idFuncionario){
                _funcionariosAuxiliar[contadorFuncionarios] = _funcionarios[i];
                contadorFuncionarios++;
            }
            else
                continue;
        }

        _funcionarios = _funcionariosAuxiliar;
    }

    public Funcionario[] obterListaDeFuncionariosOrdenadoPorSalario(){
        return ordenarListaDeFuncionarioPorSalario();
    }

    public double obterDescontoRelativoAoPlanoDeSaude(int idFuncionario) throws Exception {
        verificarSeOFuncionarioExiste(idFuncionario);

        double salarioFuncionario = obterFuncionarioPorId(idFuncionario).getSalario();

        if(salarioFuncionario <= 2000)
            return salarioFuncionario - (salarioFuncionario * 0.005);

        else if(salarioFuncionario > 2000 && salarioFuncionario < 4000)
            return salarioFuncionario - (salarioFuncionario * 0.02);

        else
            return salarioFuncionario - (salarioFuncionario * 0.04);
    }

    private void verificarSeOFuncionarioExiste(int idFuncionario) throws Exception {
        if(!(obterFuncionarioPorId(idFuncionario) != null))
            throw new Exception("Funcionário não encontrado");
    }

    public Funcionario obterFuncionarioPorId(int idFuncionario) throws Exception {
        return realizarBuscaBinaria(idFuncionario, 0, _funcionarios.length - 1);
    }

    private Funcionario realizarBuscaBinaria(int idFuncionario, int menor, int maior) throws Exception {
        int media = (menor + maior ) / 2;
        int meio = _funcionarios[media].getId();

        if(menor > maior)
            throw new Exception("Funcionário não encontrado");

        else if(meio == idFuncionario)
            return _funcionarios[media];

        else if(meio < idFuncionario)
            return realizarBuscaBinaria(idFuncionario, media + 1, maior);

        else
            return realizarBuscaBinaria(idFuncionario, menor, media - 1);
    }

    private Funcionario[] ordenarListaDeFuncionarioPorSalario()
    {
        Funcionario[] funcionariosOrdenados = _funcionarios;

        for(int i = 0; i < _funcionarios.length; i++)
        {
            for(int j = i + 1; j < _funcionarios.length; j++)
            {
                double salarioFuncionarioAtual = funcionariosOrdenados[j].getSalario();
                double salarioProximoFuncionario = funcionariosOrdenados[i].getSalario();

                if(salarioFuncionarioAtual < salarioProximoFuncionario)
                {
                    Funcionario funcionarioAuxiliar = funcionariosOrdenados[i];
                    funcionariosOrdenados[i] = funcionariosOrdenados[j];
                    funcionariosOrdenados[j] = funcionarioAuxiliar;
                }
            }
        }

        return funcionariosOrdenados;
    }
}
