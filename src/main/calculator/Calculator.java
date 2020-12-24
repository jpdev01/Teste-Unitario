package main.calculator;

public class Calculator
{

	public static void main(String[] args)
	{
		System.out.println("-----CALCULADORA-------");
		Operations op = new Operations();

		System.out.println(op.div(2, 0));

	}
}
