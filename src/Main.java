import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover Tarefa");
            System.out.println("0 - sair");
            System.out.print("Escolha uma opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Limpar buffer

            switch(opcao){
                case 1:
                    System.out.print("\nDigite a tarefa: ");
                    String tarefa = in.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa cadastrada!");
                    break;
            }
        } while (opcao != 0);

        in.close();
    }
}
