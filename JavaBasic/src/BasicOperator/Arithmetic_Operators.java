package BasicOperator;

public class Arithmetic_Operators extends Operator
{
	int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    
	public void arithmetic()
	{
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++ = " + (a++));
		System.out.println("b-- = " + (b--));
		System.out.println("d++ = " + (d++));
		System.out.println("++d = " + (++d));
	}
}
