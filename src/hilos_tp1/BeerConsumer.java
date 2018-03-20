package hilos_tp1;

/**
 *
 * @author ramir
 */
public class BeerConsumer extends BeerProcess {

    public BeerConsumer(BeerHouse cerveceria) {
        super(cerveceria);
    }

    @Override
    public synchronized void run() {
        if (this.cerveceria.getStock().size() > 0) {
            String birra_consumida = this.getRandomCerveza();
            this.cerveceria.getStock().remove(birra_consumida);
            System.out.println("Se consumio: " + birra_consumida + " - " + this.cerveceria.getStock().size());
        }
    }

}
