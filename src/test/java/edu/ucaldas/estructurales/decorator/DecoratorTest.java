package edu.ucaldas.estructurales.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void shouldAddCheeseToProduct() {
        Product product = new BasicProduct();
        product = new CheeseDecorator(product);

        assertTrue(product.getPrice() > 10);
        assertTrue(product.getDescription().toLowerCase().contains("queso"));
    }
}
