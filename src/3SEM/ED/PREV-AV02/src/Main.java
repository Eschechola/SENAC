import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Tree tree = new Tree();

        try
        {
            while(true)
            {
                System.out.println("+------------------------------------------+");
                System.out.println("+                                          +");
                System.out.println("+ 1 - Inserir                              +");
                System.out.println("+ 2 - Ordem                                +");
                System.out.println("+ 3 - Pós Ordem                            +");
                System.out.println("+ 4 - Pré Ordem                            +");
                System.out.println("+ 5 - Pesquisar                            +");
                System.out.println("+ 6 - Menor Valor                          +");
                System.out.println("+ 7 - Maior Valor                          +");
                System.out.println("+ 8 - Level do Nó                          +");
                System.out.println("+ 9 - Soma dos Valores                     +");
                System.out.println("+                                          +");
                System.out.println("+------------------------------------------+");
                System.out.println("+                                          +");
                System.out.print("+ > ");
                int option = sn.nextInt();

                switch (option)
                {
                    case 1:
                        System.out.println("Value to insert");
                        System.out.print("> ");
                        int valueToInsert = sn.nextInt();

                        tree.insert(valueToInsert);

                        System.out.println("Value " + valueToInsert + " inserted!");
                        break;

                    case 2:
                        tree.order(tree.getRoot());
                        break;

                    case 3:
                        tree.postOrder(tree.getRoot());
                        break;

                    case 4:
                        tree.preOrder(tree.getRoot());
                        break;

                    case 5:
                        System.out.println("Value to search");
                        System.out.print("> ");
                        int valueToSearch = sn.nextInt();

                        tree.search(valueToSearch, tree.getRoot());
                        break;

                    case 6:
                        tree.minValue(tree.getRoot());
                        break;

                    case 7:
                        tree.maxValue(tree.getRoot());
                        break;

                    case 8:
                        System.out.println("Value to get level");
                        System.out.print("> ");
                        int valueToGetNode = sn.nextInt();

                        tree.getLevelOfNode(valueToGetNode);
                        break;

                    case 9:
                        tree.sumElements();
                        break;
                }

                System.out.print("\nAperte qualquer tecla para continuar...");
                System.in.read();
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ocorreu um erro, por favor tente novamente");
        }
    }
}
