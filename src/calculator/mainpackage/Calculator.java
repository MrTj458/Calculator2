package calculator.mainpackage;

import java.util.Scanner;

public class Calculator
{
	private Scanner usrInput;
	boolean loop = true;
	
	public Calculator()
	{
		usrInput = new Scanner(System.in);
	}
	
	public void start()
	{
		calculator();
	}
	
	private void calculator()
	{
		while (loop == true)
		{
			System.out.println("Enter First Number: ");
			double number1 = usrInput.nextDouble();
			System.out.println("Enter Operator: ");
			String operator = usrInput.next();
			System.out.println("Enter Second Number: ");
			double number2 = usrInput.nextDouble();
			
			if (operator.equals("+"))
			{
				System.out.println("The answer is " + (number1 + number2));
			}
			else if (operator.equals("-"))
			{
				System.out.println("The answer is " + (number1 - number2));
			}
			else if (operator.equals("*"))
			{
				System.out.println("The answer is " + (number1 * number2));
			}
			else if (operator.equals("/"))
			{
				System.out.println("The answer is " + (number1 / number2));
			}
			else
			{
				System.out.println("Invalid operation, please try again.");
			}
		}
	}
}
