package hilos_tp1;

/**
 *
 * @author ramir
 */
public class BeerProducter extends BeerProcess {

    public BeerProducter(BeerHouse cerveceria) {
        super(cerveceria);
    }
    
    @Override
    public synchronized void run() {
        if (this.cerveceria.getStock().size() < this.cerveceria.getLimite()) {
            String birra_producida = this.getRandomCerveza();
            this.cerveceria.getStock().add(this.getRandomCerveza());
            System.out.println("Se Produjo: " + birra_producida + " - " + this.cerveceria.getStock().size());
        }
    }
    
}
