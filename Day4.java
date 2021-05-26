
public class Day4 {

	public static void main(String[] args) 
	{
			Student s=new Student();
			s.setId=(111);
			s.setName("Nabil");
			s.setAddress("Mumbai");
			s.setMarks(567);
			
	}

}

class Day4 extends Teacher
{
	int marks;
	void setMarks(int marks)
	{
		this.marks=marks;
}
	int getMarks()
	{
		return marks;
	}

}
