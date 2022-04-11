public abstract class Sanduiche {

    private String nome;
    private String descricao;

    public Sanduiche (){}

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public abstract double preco();
}