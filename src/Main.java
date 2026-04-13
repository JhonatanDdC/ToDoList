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

                case 2:
                    if (tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa cadastrada!");
                    } else {
                        System.out.println("\n Suas tarefas:");
                        for (int i = 0; i < tarefas.size(); i++){
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        break;
                    }

                case 3:
                    System.out.print("Digite o índice da tarefa: ");
                    int index = in.nextInt() - 1;
                    tarefas.remove(index);
                    System.out.println("Tarefa removida!");
                    break;
            }
        } while (opcao != 0);

        in.close();
    }
}
