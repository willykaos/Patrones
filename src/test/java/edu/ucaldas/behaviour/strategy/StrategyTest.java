package edu.ucaldas.behaviour.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void shouldExecutePaymentStrategy() {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());

        assertDoesNotThrow(() -> context.executePayment(100));
    }
}
