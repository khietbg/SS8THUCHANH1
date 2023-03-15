import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("Testing minus")
    void testCalculateMinus() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
        @Test
        @DisplayName("Testing muntiplication")
        void testCalculateMul () {
            int firstOperand = 2;
            int secondOperand = 2;
            char operator = '*';
            int expected = 4;
            int result = Calculator.calculate(firstOperand, secondOperand, operator);
            assertEquals(expected, result);
        }
        @Test
    @DisplayName("Testing division")
    void testCalculateDiv(){
        int firstOperand = 4;
        int secondOperand = 2;
        char operator = '/';
        int expected = 2;
        int result = Calculator.calculate(firstOperand,secondOperand,operator);
        assertEquals(expected,result);
        }
        @Test
    @DisplayName("Test division by zero")
    void testCalculateDivByZero(){
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                ()->{Calculator.calculate(firstOperand,secondOperand,operator);});
        }


    }