package automationPractice;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetAndHashSetProgram 
{
	public static void main(String[] args) 
	{
//		HashSet Concept
		HashSet a=new HashSet();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add('A');
		a.add("Apple");
		System.out.println(a);
		
		HashSet<Integer> b=new HashSet<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
//		b.add("Rahul");....not possible
		System.out.println(b);
		
//		Set Concept
		Set x=new HashSet();
		x.add(10);
		x.add('A');
		x.add("Mango");
		x.add(457.64);
		System.out.println(x);
		
//		c.get(2);..............no index concept
//		c.getIndex("Mango");....not possible
		
//		Iterator.....method of set
		 java.util.Iterator it=x.iterator();
//		 System.out.println(it.next());
//		 System.out.println(it.next());
//		 System.out.println(it.next());
//		 System.out.println(it.next());
		 
		 for(int i=0;i<x.size();i++)
		 {
			 System.out.println(it.next());
		 }	
		
	}

}
