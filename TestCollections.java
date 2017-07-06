package arraylist;
import java.util.*;


public class TestCollections {

public static void main(String a[])
{
	//ArrayList<Car> araylist=new ArrayList<Car>();
	Set<Car> araylist=new HashSet<Car>();
	Car c=new Car("A1","white","Audi");
	araylist.add(new Car("A2","black","audi"));
	araylist.add(new Car("A10","white","audi"));
	araylist.add(new Car("A2","gray","audi20"));
	araylist.add(new Car("A20","red","audi"));
	araylist.add(new Car("A20","red","audi"));
	araylist.add(c);
	araylist.add(c);
	// b System.out.println(araylist);
	int size=araylist.size();
	System.out.println(size);
	//Collections.sort(araylist,new ColorComparator());
	
	for(Car car:araylist)
	{
		System.out.println("name-"+car.getName()+" "+"color-"+car.getColor()+" "+"model"+car.getModel());
	}
	
	
}
}
