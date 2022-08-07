package automationPractice;

import java.util.ArrayList;

public class CollectionProgram 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
//		All type data
		a.add(10);
		a.add(40);
		a.add(125.6);
		a.add(748.85);
		a.add('N');
		a.add("Neha");
		System.out.println(a);
		System.out.println(a.get(5));
		
//		Specific type data
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
//		b.add(500.5); .....Not possible
//		b.add("Apple"));...Not possible
		System.out.println(b);
		System.out.println(b.get(0));
		
//		String type data
		ArrayList<String> c=new ArrayList<String>();
		c.add("Anil");
		c.add("Nirmala");
		c.add("Sadhna");
		c.add("Archana");
		c.add("Sangita");
		c.add("Prasad");
		c.add("Neha");
		c.add("Priya");
//		c.add('D');.......Not possible
		System.out.println(c);
		System.out.println(c.get(2));
		
//		Replace using set method
		c.set(2, "Sadhana");
		System.out.println(c.get(2));
		System.out.println(c);
		
//		remove method
		c.remove(7);
		System.out.println(c);
		
//		size method
		System.out.println("Size of arraylist c is "+c.size());
		
//		How to get index of any element in ArrayList
//		System.out.println(ArrayList.indexOf(c,"Nirmala"));
		System.out.println(c.indexOf("Nirmala"));
		
//		Another form of add method();
		c.add(7,"Shravi");
		System.out.println(c);
	
		
	}

}
