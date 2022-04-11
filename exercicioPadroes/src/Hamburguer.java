public class Hamburguer extends Adicionais {
    
    public Hamburguer (Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public double preco () {
        return 4.00 + getSanduiche.preco();
    }
}