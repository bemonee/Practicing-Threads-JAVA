package hilos_tp1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramir
 */
public final class BeerHouse {

    private final int limite;

    private final List<String> stock;

    public static final String[] TIPOS_CERVEZA = {
        "IPA", "Blonde", "Red Ale", "Porter"
    };

    public BeerHouse(int limite) {
        this.limite = limite;
        this.stock = new ArrayList();
    }
    
    public int getLimite() {
        return limite;
    }

    public List<String> getStock() {
        return stock;
    }
}
