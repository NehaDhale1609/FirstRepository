package automationPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDifferenceProgram 
{
	public static void main(String[] args) 
	{
		List x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(null);
		x.add(null);
		System.out.println(x);
		
		Set y=new HashSet();
		y.add(100);
		y.add(20);
		y.add('A');
		y.add("Neha");
		y.add(null);
		y.add(null);
		y.add("Dhale");
		System.out.println(y);
		
		
	}

}
