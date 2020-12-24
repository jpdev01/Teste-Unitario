package calculator;

import org.junit.Before;
import org.junit.jupiter.api.*;

class OperationsTest
{
	Operations op;

	@BeforeEach
	public void init(){
		op = new Operations();
	}
	@Test
	@DisplayName("Testa se 10 + 2 é igual a 12")
	@Tag("testCalculator")
	void testSomarInt()
	{
		//Arrange
		int num1 = 10;
		int num2 = 2;
		int expectedValue = 12;

		//Act

		int actualValue = op.somar(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);

	}

	@Test
	void testSomarDouble()
	{
	}

	@Test
	void subtr()
	{
	}

	@Test
	void testSubtr()
	{
	}

	@Test
	void multip()
	{
	}

	@Test
	void testMultip()
	{
	}

	@Test
	void div()
	{
	}

	@Test
	void testDiv()
	{
	}
}