package hilos_tp1;

import java.util.Random;

/**
 *
 * @author ramir
 */
public class BeerProcess extends Thread {

    protected final BeerHouse cerveceria;
    private final Random rand;

    public BeerProcess(BeerHouse cerveceria) {
        this.cerveceria = cerveceria;
        this.rand = new Random();
    }

    public String getRandomCerveza() {
        int cant_maxima = BeerHouse.TIPOS_CERVEZA.length;
        int random_i = this.rand.nextInt(cant_maxima);
        return BeerHouse.TIPOS_CERVEZA[random_i];
    }
}
