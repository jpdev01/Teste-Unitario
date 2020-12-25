package calculator;

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
	@DisplayName("Testa se 10.0 + 2.0 é igual a 12.0")
	@Tag("testCalculator")
	void testSomarDouble()
	{
		//Arrange
		double num1 = 10.0;
		double num2 = 2.0;
		double expectedValue = 12.0;

		//Act
		double actualValue = op.somar(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 20-10 é igual a 10")
	@Tag("testCalculator")
	void testSubtrInt()
	{
		//Arrange
		int num1 = 20;
		int num2 = 10;
		int expectedValue = 10;

		//Act
		int actualValue = op.subtr(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 20.0-10.0 é igual a 10.0")
	@Tag("testCalculator")
	void testSubtrDouble()
	{
		//Arrange
		double num1 = 20.0;
		double num2 = 10.0;
		double expectedValue = 10.0;

		//Act
		double actualValue = op.subtr(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 2*2 é igual a 4")
	@Tag("testCalculator")
	void testMultipInt()
	{
		//Arrange
		int num1 = 2;
		int num2 = 2;
		int expectedValue = 4;

		//Act
		int actualValue = op.multip(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 2.0*2.0 é igual a 4.0")
	@Tag("testCalculator")
	void testMultipDouble()
	{
		//Arrange
		double num1 = 2.0;
		double num2 = 2.0;
		double expectedValue = 4.0;

		//Act
		double actualValue = op.multip(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 20/2 é igual a 10")
	@Tag("testCalculator")
	void testDivInt()
	{
		//Arrange
		int num1 = 20;
		int num2 = 2;
		int expectedValue = 10;

		//Act
		int actualValue = op.div(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}

	@Test
	@DisplayName("Testa se 20.0/2.0 é igual a 10.0")
	@Tag("testCalculator")
	void testDivDouble()
	{
		//Arrange
		double num1 = 20.0;
		double num2 = 2.0;
		double expectedValue = 10.0;

		//Act
		double actualValue = op.div(num1, num2);

		//Assert
		Assertions.assertEquals(expectedValue,actualValue);
	}
}