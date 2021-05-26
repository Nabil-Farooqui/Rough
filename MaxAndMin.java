import java.util.*;

public class MaxAndMin {

	public static void main(String[] args) {

		List<Integer>list=  new ArrayList<Integer>();  //List<String>list=new ListArray<String>();
		list.add(54);
		list.add(96);
		list.add(72);
		list.add(14);
		list.add(47);
		list.add(341);
		list.add(85);
		list.add(765);
		list.add(235);
		list.add(1414);
		list.add(824234);
		list.add(7546);
		list.add(5544);
		list.add(891321);
		list.add(8913);
		list.add(8234);
		list.add(294);
		list.add(494);
		list.add(594);
		
		System.out.println("Max Number is :"  +Collections.max(list));
		System.out.println("Min Number is :"  +Collections.min(list));

	}

}
