//call by reference variable

public class ByRefVar 
/* {

	
	String color;
	int age;
	
	public static void main(String[] args) 
	{
	ByRefVar cat=new ByRefVar();
	cat.color="White";
	cat.age=3;
	System.out.println("Color is "+cat.color + "\nAge is "+cat.age );
	

	}


}    */

{
	String color;
	int age;
	public static void main(String[] args)
	{
		ByRefVar cat=new ByRefVar();
		cat.color="White";
		cat.age=3;
		System.out.println("Cat color is " +cat.color + "\nAge : " +cat.age);
		
		ByRefVar dog=new ByRefVar();
		dog.color="Black";
		dog.age=5;
		System.out.println("\nDog color is " +dog.color + "\nAge : " +dog.age);
		
		
		
	}
}