import java.util.Scanner;

public class Main {
    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args)
    {
        final int QUANTIDADE_FUNCIONARIOS_CADASTRAR = 100;
        FuncionarioService _funcionarioService = new FuncionarioService();

        while(true)
        {
            try
            {
                System.out.println("================================");
                System.out.println("1 - Cadastrar 100 funcionários");
                System.out.println("2 - Buscar dados de um funcionário");
                System.out.println("3 - Atualizar salário de um funcionário");
                System.out.println("4 - Remover um funcionário");
                System.out.println("5 - Exibir funcionários ordenados por salário");
                System.out.println("6 - Calcular desconto relativo ao plano de saúde");
                System.out.print("> ");
                int opcao = sn.nextInt();

                switch (opcao)
                {
                    case 1:
                        Funcionario[] funcionarios = new Funcionario[QUANTIDADE_FUNCIONARIOS_CADASTRAR];
                        for(int i = 0; i < funcionarios.length; i++){
                            System.out.println("\n\nFuncionário " + (i + 1));
                            System.out.println("Digite o nome do novo funcionário");
                            System.out.print("> ");
                            String nomeNovoFuncionario = sn.next();

                            System.out.println("Digite o cargo do novo funcionário");
                            System.out.print("> ");
                            String cargoNovoFuncionario = sn.next();

                            System.out.println("Digite o salário do novo funcionário");
                            System.out.print("> ");
                            double salarioNovoFuncionario = sn.nextDouble();

                            funcionarios[i] = new Funcionario(nomeNovoFuncionario, cargoNovoFuncionario, salarioNovoFuncionario);
                        }

                        _funcionarioService.cadastrarFuncionarios(funcionarios);

                        System.out.println("Funcionários cadastrados com sucesso!");
                        System.out.println("\nPressione 1 voltar ao menu...");
                        sn.nextInt();
                        break;

                    case 2:
                        System.out.println("Digite o id do funcionário que deseja buscar");
                        System.out.print("> ");
                        int idFuncionarioBuscar = sn.nextInt();

                        Funcionario funcionarioEncontrado = _funcionarioService.obterFuncionarioPorId(idFuncionarioBuscar);
                        System.out.println(funcionarioEncontrado.toString());

                        System.out.println("\nPressione 1 voltar ao menu...");
                        sn.nextInt();
                        break;

                    case 3:
                        System.out.println("Digite o id do funcionário que deseja atualizar o salário");
                        System.out.print("> ");
                        int idFuncionarioAtualizarSalario = sn.nextInt();

                        System.out.println("Digite o novo salário do funcionário");
                        System.out.print("> ");
                        double novoSalarioFuncionário = sn.nextInt();

                        _funcionarioService.atualizarSalario(idFuncionarioAtualizarSalario, novoSalarioFuncionário);

                        mensagemVoltarAoMenuPrincipal("Salário atualizado com sucesso!");
                        break;

                    case 4:
                        System.out.println("Digite o id do funcionário que deseja remover");
                        System.out.print("> ");
                        int idFuncionarioRemover = sn.nextInt();

                        _funcionarioService.removerFuncionario(idFuncionarioRemover);

                        mensagemVoltarAoMenuPrincipal("Funcionário removido com sucesso!");
                        break;

                    case 5:
                        Funcionario[] funcionariosOrdenadosPorSalario = _funcionarioService.obterListaDeFuncionariosOrdenadoPorSalario();

                        System.out.println("\n\nExibindo funcionários ordenados por salário");
                        for(int i = 0; i < funcionariosOrdenadosPorSalario.length; i++)
                            System.out.println("\n\n====\n\n" + funcionariosOrdenadosPorSalario[i].toString() + "\n\n====\n\n");

                        mensagemVoltarAoMenuPrincipal();
                        break;

                    case 6:
                        System.out.println("Digite o id do funcionário que deseja calcular o desconto");
                        System.out.print("> ");
                        int idFuncionarioCalcularDesconto = sn.nextInt();

                        double salarioComDesconto = _funcionarioService.obterDescontoRelativoAoPlanoDeSaude(idFuncionarioCalcularDesconto);

                        mensagemVoltarAoMenuPrincipal(String.format("O salário do funcionário com desconto é %.2f", salarioComDesconto));
                        break;

                    default:
                        mensagemVoltarAoMenuPrincipal("Opção não encontrada...");
                        break;
                }
            }
            catch (Exception error)
            {
                System.out.println("! ERRO !");
                System.out.println(error.getMessage());
            }
        }
    }

    public static void mensagemVoltarAoMenuPrincipal(){
        System.out.println("\nPressione 1 voltar ao menu...");
        sn.nextInt();
    }

    private static void mensagemVoltarAoMenuPrincipal(String mensagem){
        System.out.println(mensagem);
        mensagemVoltarAoMenuPrincipal();
    }
}