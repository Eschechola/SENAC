import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Queue queue = new Queue();

        while(true){
            System.out.println("----------------------------------");
            System.out.println("|                                |");
            System.out.println("| 1 - Enqueue                    |");
            System.out.println("| 2 - Dequeue                    |");
            System.out.println("| 3 - Empty                      |");
            System.out.println("| 4 - Front                      |");
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

                    queue.enqueue(value);

                    System.out.println("Value inserted!");
                    break;

                case 2:
                    queue.dequeue();
                    System.out.println("Value removed");
                    break;

                case 3:
                    System.out.println("Is empty? " + queue.empty());
                    break;

                case 4:
                    if(queue.empty())
                        System.out.println("Stack is empty!");
                    else
                        System.out.println("Front element: " + queue.front());
                    break;

                case 5:
                    System.out.println("Size of stack: " + queue.size());
                    break;

                case 6:
                    queue.show();
                    break;

                default:
                    continue;
            }

            System.out.println("\n\n");
        }
    }
}
