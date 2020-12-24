package test.calculator;

import main.calculator.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationsTest
{

	@Test
	@DisplayName("Testa se 10 + 2 é igual a 12")
	void testSomarInt()
	{
		//Arrange
		int num1 = 10;
		int num2 = 2;
		int expectedValue = 12;

		//Act
		Operations op = new Operations();
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