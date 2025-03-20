import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartApplicationTest {

    @Test
    void testCalculateItemCost() {
        assertEquals(10.0, ShoppingCartApplication.CalculateItemCost(5.0, 2));
        assertEquals(0.0, ShoppingCartApplication.CalculateItemCost(0.0, 0));
    }

    @Test
    void testCalculateTotalCost() {
        assertEquals(10.0, ShoppingCartApplication.CalculateTotalCost(10.0, 0.0));
        assertEquals(10.0, ShoppingCartApplication.CalculateTotalCost(0.0, 10.0));
        assertEquals(0.0, ShoppingCartApplication.CalculateTotalCost(0.0, 0.0));
        assertEquals(100.0, ShoppingCartApplication.CalculateTotalCost(50.0, 50.0));
    }

}