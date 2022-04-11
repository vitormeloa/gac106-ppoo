public class Queijo extends Adicionais {

    public Queijo(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double preco() {
        return 2.30 + getSanduiche.preco();
    }
}