import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.sum(3, 7));	}

}
