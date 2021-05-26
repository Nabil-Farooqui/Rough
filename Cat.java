//constructor


public class Cat {
	  int catAge;
	  String catName;

	  public void Main (int catage, String catName)
	  {
	    age=catage;
	    name=catName;
	  }

	  public static void main(String[] args) {
	    Cat lil = new Cat();
	    lil.Main(4, "Eclipse");
	    System.out.println(Cat.catAge + " " + Cat.catName);
	  }
	}