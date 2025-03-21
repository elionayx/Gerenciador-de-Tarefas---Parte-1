public class TarefaPendente extends Tarefa{
    public TarefaPendente (String descricao) {
        super(descricao);
    }

    @Override
    public void statusTarefa() {
        System.out.println("Tarefa Pendente - " + getDescricao());
    }
}
