package array;
import java.util.HashMap;
import java.util.Map;

import array.Car;

public class MapPerson {
	public static void main(String a[]) {
		Person p=new Person("g",31);
		//Car c=new Car("A2","gray","audi");
		
	HashMap<Person, Car> map=new HashMap<Person, Car>();
	
	map.put(new Person("D",34), new Car("A2","black","audi"));
	map.put(new Person("f",36), new Car("A10","black","audi"));
	map.put(new Person("g",31), new Car("A2","gray","audi"));
	map.put(new Person("r",30), new Car("A10","black","audi"));
	map.put(new Person("r",30), new Car("A11","black","audi"));
	map.put(null, new Car("A10","black","audi"));
	for(Map.Entry<Person, Car>car:map.entrySet())
	{
		System.out.println("key:"+car.getKey()+"value"+car.getValue());
	}
	//System.out.println(map);
System.out.println("value for 1, g is"+map.get(p));
	   
 } 
}

