import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - ADICIONAR TAREFA");
            System.out.println("2 - REMOVER TAREFA");
            System.out.println("3 - MARCAR TAREFA COMO CONCLUÍDA");
            System.out.println("4 - LISTA DE TAREFAS");
            System.out.println("5 - SAIR");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite a tarefa.");
                        String descricao = sc.nextLine();
                        gerenciador.adicionarTarefa(descricao);
                        break;
                    case 2:
                        System.out.println("Digite o número da tarefa a ser removida.");
                        int tarefaRemover = sc.nextInt() - 1;
                        gerenciador.removerTarefa(tarefaRemover);
                        break;
                    case 3:
                        System.out.println("Digite o número da tarefa a ser marcada como concluída.");
                        int tarefaConcluida = sc.nextInt();
                        gerenciador.marcarTarefaConcluida(tarefaConcluida);
                        break;
                    case 4:
                        gerenciador.listarTarefas();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inválido! Digite um número válido.");
                sc.nextLine();
            }
        } while (opcao != 5);
        sc.close();
    }
}
