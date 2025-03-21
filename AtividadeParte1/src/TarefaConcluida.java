public class TarefaConcluida extends Tarefa {
    public TarefaConcluida (String descricao) {
        super(descricao);
    }

    @Override
    public void statusTarefa() {
        System.out.println("Tarefa Concluída - "+getDescricao());
    }
}
