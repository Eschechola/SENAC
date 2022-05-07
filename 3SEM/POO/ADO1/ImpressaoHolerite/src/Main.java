import Entidades.Funcionario;
import Servicos.Funcionario.FuncionarioService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static FuncionarioService _funcionarioService = new FuncionarioService();

    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        while(true)
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|                        - MENU -                         |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|                                                         |");
            System.out.println("| 1 - Adicionar Funcionário                               |");
            System.out.println("| 2 - Excluir Um Funcionário                              |");
            System.out.println("| 3 - Exibir Funcionários Cadastrados                     |");
            System.out.println("| 4 - Exibir Holerite dos Funcionários                    |");
            System.out.println("| 0 - Sair                                                |");
            System.out.println("|                                                         |");
            System.out.println("-----------------------------------------------------------");
            System.out.print("> ");
            int opcao = sn.nextInt();

            switch (opcao){
                case 1:
                    sn.nextLine();
                    System.out.print("Digite o nome do funcionário\n> ");
                    String nomeInserir = sn.nextLine();

                    System.out.print("Digite salário bruto do funcionário\n> ");
                    double salarioBrutoInserir = sn.nextDouble();

                    System.out.print("Digite o bônus do funcionário (Caso não tenha digite 0)\n> ");
                    double bonusInserir = sn.nextDouble();

                    System.out.print("O funcionário usa vale transporte? (1 - sim / 2 - não)\n> ");
                    boolean usaValeTransporteInserir = sn.nextInt() == 1;

                    int diasTrabalhadosInserir = 0;
                    double custoTransporteDiarioInserir = 0;
                    if(usaValeTransporteInserir){
                        System.out.print("Quantos dias o funcionário trabalhou no mês?\n> ");
                        diasTrabalhadosInserir = sn.nextInt();

                        System.out.print("Custo diário com transporte do funcionário?\n> R$");
                        custoTransporteDiarioInserir = sn.nextDouble();
                    }

                    var funcionario = new Funcionario(
                            nomeInserir,
                            salarioBrutoInserir,
                            bonusInserir,
                            usaValeTransporteInserir,
                            diasTrabalhadosInserir,
                            custoTransporteDiarioInserir);

                    _funcionarioService.adicionarFuncionario(funcionario);

                    System.out.println("Funcionário adicionado com sucesso!");
                    break;

                case 2:
                    sn.nextLine();
                    System.out.print("Digite o Id do funcionário que deseja remover\n> ");
                    String idRemover = sn.nextLine();

                    _funcionarioService.removerFuncionario(idRemover);
                    System.out.println("Funcionário removido com sucesso!");
                    break;

                case 3:
                    var funcionariosExibir = _funcionarioService.obterFuncionariosCadastrados();

                    if(funcionariosExibir.isEmpty())
                    {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    else
                    {
                        for(int i = 0; i< funcionariosExibir.size(); i++)
                        {
                            var funcionarioExibir = funcionariosExibir.get(i);
                            System.out.println(funcionarioExibir.toString());
                        }
                    }
                    break;

                case 4:
                    var funcionariosHoleriteExibir = _funcionarioService.obterFuncionariosComSalarioLiquidoCalculado();

                    if(funcionariosHoleriteExibir.isEmpty())
                    {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    else {
                        for (int i = 0; i < funcionariosHoleriteExibir.size(); i++) {
                            var funcionarioExibir = funcionariosHoleriteExibir.get(i);

                            System.out.println("-----------------------------------------------------------");
                            System.out.println("|                      - HOLERITE -                       |");
                            System.out.println("-----------------------------------------------------------");
                            System.out.println("|                                                         ");
                            System.out.printf("| Nome: %s\n", funcionarioExibir.getNome());
                            System.out.println("|                                                          ");
                            System.out.println("| CRÉDITOS - ");
                            System.out.printf("| Bônus: R$%.2f\n", funcionarioExibir.getBonus());
                            System.out.printf("| Salário Bruto: R$%.2f\n", funcionarioExibir.getSalarioBruto());
                            System.out.printf("| Salário Líquido: R$%.2f\n", funcionarioExibir.getSalarioLiquido());
                            System.out.println("|                                                          ");
                            System.out.println("| DÉBITOS - ");
                            System.out.printf("| Desconto IRPF: R$%.2f\n", funcionarioExibir.getDescontoIRPF());
                            System.out.printf("| Desconto INSS: R$%.2f\n", funcionarioExibir.getDescontoINSS());
                            System.out.printf("| Desconto Convênio Médico: R$%.2f\n", funcionarioExibir.getDescontoConvenio());
                            System.out.printf("| Desconto Vale Transporte: R$%.2f\n", funcionarioExibir.getDescontoTransporte());
                            System.out.printf("| Desconto Vale Alimentação: R$%.2f\n", funcionarioExibir.getDescontoAlimentacao());
                            System.out.printf("| Desconto Vale Refeição: R$%.2f\n", funcionarioExibir.getDescontoRefeicao());
                            System.out.println("|                                                         ");
                            System.out.println("-----------------------------------------------------------");
                        }
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    break;
            }

            System.out.print("\nAperte qualquer tecla para continuar...");
            System.in.read();
        }
    }
}
