package edu.ucaldas.behaviour.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    @Test
    void shouldNotifyObservers() {
        Stock stock = new Stock();
        Observer investor = new Investor("Juan");

        stock.addObserver(investor);

        assertDoesNotThrow(() -> stock.setPrice(200));
    }
}
