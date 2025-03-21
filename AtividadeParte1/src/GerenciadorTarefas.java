import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa (String descricao) {
        tarefas.add(new TarefaPendente(descricao));
        System.out.println("Tarefa adicionada!");
    }

    public void removerTarefa (int numTarefa) {
        try {
            tarefas.remove(numTarefa);
            System.out.println("Tarefa removida!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void marcarTarefaConcluida (int numTarefa) {
        try {
            Tarefa tarefa = tarefas.get(numTarefa);
            if (tarefa instanceof TarefaPendente) {
                tarefas.set(numTarefa, new TarefaConcluida (tarefa.getDescricao()));
                System.out.println("Tarefa marcada como concluída!");
            } else {
                System.out.println("Esta tarefa já está concluída!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void listarTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas!");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ".");
                tarefas.get(i).statusTarefa();
            }
        }
    }
}
