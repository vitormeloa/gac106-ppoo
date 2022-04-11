public class Cebola extends Adicionais {

    public Cebola(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double preco () {
        return 1.30 + getSanduiche.preco();
    }
}
