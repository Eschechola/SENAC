import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Stack stack = new Stack();

        while(true){
            System.out.println("----------------------------------");
            System.out.println("|                                |");
            System.out.println("| 1 - Push                       |");
            System.out.println("| 2 - Pop                        |");
            System.out.println("| 3 - Empty                      |");
            System.out.println("| 4 - Top                        |");
            System.out.println("| 5 - Size                       |");
            System.out.println("| 6 - Show                       |");
            System.out.println("|                                |");
            System.out.println("----------------------------------");
            System.out.print("> ");
            int opcao = sn.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Value to insert:");
                    System.out.print("> ");
                    int value = sn.nextInt();

                    stack.push(value);

                    System.out.println("Value inserted!");
                    break;

                case 2:
                    stack.pop();
                    System.out.println("Value removed");
                    break;

                case 3:
                    System.out.println("Is empty? " + stack.empty());
                    break;

                case 4:
                    if(stack.empty())
                        System.out.println("Stack is empty!");
                    else
                        System.out.println("Top element: " + stack.top());
                    break;

                case 5:
                    System.out.println("Size of stack: " + stack.size());
                    break;

                case 6:
                    stack.show();
                    break;

                default:
                    continue;
            }

            System.out.println("\n\n");
        }
    }
}
