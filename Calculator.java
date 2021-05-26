
public class Calculator 
{

	public static void main(String[] args) 
	{
		
			int num1 = 10;
			int num2 = 20;
			int result;
			String symbol= "-";
			
			switch(symbol)
			{
			case "+": result = num1+num2;
			System.out.println(result);
			break;
			case "-": result = num1-num2;
			System.out.println(result);
			break;
			case "*": result = num1*num2;
			System.out.println(result);
			break;
			case "/": result = num1/num2;
			System.out.println(result);
			break;
				
			default : System.out.println("invalid symbol");
			break;

	}

}
}
