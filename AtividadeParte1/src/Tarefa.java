
abstract class Tarefa {
    private String descricao;

    public Tarefa (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public abstract void statusTarefa();
}
