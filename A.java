
public class A {

	int a =10;
	static int b=20;
	
	public static void main(String[] args) 
	{
		A ob1=new A();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.a=1000;
		ob1.b=2000;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		A ob2=new A();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
	}

}
