import java.util.*;
import java.util.Scanner;

public class Students {

	public void register()
	{
		System.out.print("Student Name is ");
	}
	
	public void name()
	{
		System.out.println("Nabil Farooqui");
	}
	
	public void student()
	{
		System.out.println("Enter Age");
		Scanner sc=new Scanner(System.in);
		String stud= sc.nextLine();
		System.out.println ("Age is: "+stud);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students st=new Students();
		st.register();
		st.name();
		st.student();		
	}

}
