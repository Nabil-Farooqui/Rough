//Calling ByMethod Java

public class Animals {

	String color;
	int age;
	
	
	void ani (String c, int a)
	{
		color=c;
		age=a;
	}
	void display()
	{
		System.out.println(color+""+age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DOG");
		
		Animals dog=new Animals();
		dog.ani();
		dog.display();

	}

}
