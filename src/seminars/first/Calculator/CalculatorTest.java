package seminars.first.Calculator;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[] args) {
        //позитивный тест
        assertThat(Calculator.calculatingDiscount(100.0, 5)).isEqualTo(95.0);
        //негативные тесты
        //некорректная скидка
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 0)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 100)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101)).isInstanceOf(ArithmeticException.class);
        // некорректная сумма
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 5)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(0, 5)).isInstanceOf(ArithmeticException.class);
    }
}