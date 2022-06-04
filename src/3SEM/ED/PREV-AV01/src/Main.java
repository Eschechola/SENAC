import arrays.ArraysMain;
import listaEncadeada.ListaEncadeadaMain;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while(true){
            try{
                System.out.println("\n\n\n");
                System.out.println("----------------------------------");
                System.out.println("1 - Executar Arrays");
                System.out.println("2 - Executar Lista Encadeada");
                int opcao = sn.nextInt();

                switch (opcao){
                    case 1:
                        ArraysMain.Execute();
                        break;

                    case 2:
                        ListaEncadeadaMain.Execute();
                        break;
                }
            }
            catch(IOException error){}
        }
    }
}
