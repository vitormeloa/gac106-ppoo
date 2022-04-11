public class Adicionais extends Sanduiche {

    private Sanduiche sanduiche;

    public Adicionais(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
        setDescricao(sanduiche.getDescricao());
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}