import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {


    private Calculator calculator;

    @BeforeEach
    public void createCalculator(){
        calculator = new Calculator();
    }

    //@AfterEach - po kazdym tescie
    //@BeforeAll - przed wszystkimi testami w klasie
    //@AfterAll - po wszystkich testach

    @Test
    public void addTest(){
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-10, calculator.add(-5, -5));
        assertEquals(5, calculator.add(-5, 10));
    }

    @Test
    public void removeTest() {
        assertEquals(5, calculator.remove(10, 5));
        assertEquals(1, calculator.remove(10, 0));
        assertEquals(1, calculator.remove(0, 0));
        assertEquals(4, calculator.remove(2, -2));
    }

    @Test
    public void subTest(){
        assertThrows(ArithmeticException.class, () -> calculator.sub(1, 0));
        assertDoesNotThrow(() -> calculator.sub(1, 0));
        assertEquals(1, calculator.sub(5,5 ));
        assertEquals(100, calculator.sub(1000,10 ));
    }
}
