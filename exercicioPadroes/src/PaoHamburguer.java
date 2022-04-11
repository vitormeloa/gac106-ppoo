public class PaoHamburguer extends Sanduiche {

    public PaoHamburguer (String descricao) {
        setDescricao(descricao);
    }

    @Override
    public double preco () {
        return 2.50;
    }
}