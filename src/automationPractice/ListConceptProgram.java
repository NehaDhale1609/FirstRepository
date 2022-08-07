package automationPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConceptProgram 
{
	public static void main(String[] args)
	{
		List a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add('N');
		a.add("Neha");
		System.out.println(a);
		
		List<Double> b=new ArrayList<Double>();
		b.add(41.85);
		b.add(45.354);
		b.add(748.32);
//		b.add(41);.......Not possible
		
		System.out.println(b.get(1));
		b.remove(2);
		System.out.println(b);
		
		List c=new LinkedList();
		List<Double>d=new LinkedList<Double>();
		
		
		
		
		
		
	}

}
