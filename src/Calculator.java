import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {
    void shouldAddIntegers() {
        Calculator calc = new Calculator();

        int result = calc.add(2,3);
        assertEquals(5, result);
    }

}
