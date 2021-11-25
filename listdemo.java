//how to use the list .
import java.util.*;
class listdemo
{
	void func()
	{
		List lst=new ArrayList();
		lst.add("Coke");
		lst.add("Dairy milk");
		lst.add(100);
		lst.add(2.5);
		lst.add("Dairy milk");
		System.out.println(lst);
		System.out.println("No of items:"+lst.size());
		
	}
	public static void main(String args[])
	{
		listdemo obj=new listdemo();
		obj.func();
	}
} 