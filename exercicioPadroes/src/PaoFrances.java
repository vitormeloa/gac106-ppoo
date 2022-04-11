public class PaoFrances extends Sanduiche {

    public PaoFrances(String descricao) {
        setDescricao(descricao);
    }

    @Override
    public double preco () {
        return 1.50;
    }
}