import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartAppTest {

    @Test
    void testCalculateItemCost() {
        assertEquals(10.0, ShoppingCartApp.CalculateItemCost(5.0, 2));
        assertEquals(0.0, ShoppingCartApp.CalculateItemCost(0.0, 0));
    }

    @Test
    void testCalculateTotalCost() {
        assertEquals(10.0, ShoppingCartApp.CalculateTotalCost(10.0, 0.0));
        assertEquals(10.0, ShoppingCartApp.CalculateTotalCost(0.0, 10.0));
        assertEquals(0.0, ShoppingCartApp.CalculateTotalCost(0.0, 0.0));
        assertEquals(100.0, ShoppingCartApp.CalculateTotalCost(50.0, 50.0));
    }

}