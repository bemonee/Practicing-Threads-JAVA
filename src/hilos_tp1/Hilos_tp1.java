package hilos_tp1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramir
 */
public class Hilos_tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        BeerHouse cerveceria = new BeerHouse(100);
        List<BeerProducter> productores = new ArrayList();

        // Le damos ventaja a los productores
        for (int i = 0; i < 1; i++) {
            BeerProducter productor = new BeerProducter(cerveceria);
            productores.add(productor);
            productor.start();
        }
        
        // Mas ventaja
        for (int i = 0; i < 1; i++) {
            productores.get(i).join();
        }

        // A escabiaaaaaaaaaaaaaaaaaaaaaaaaar
        while (!cerveceria.getStock().isEmpty()) {
            (new BeerProducter(cerveceria)).start();
            (new BeerConsumer(cerveceria)).start();
            (new BeerConsumer(cerveceria)).start();
        }

    }

}
