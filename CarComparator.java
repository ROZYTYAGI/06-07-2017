package niit;
import java.util.*;
  class CarComparator implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		Car c1=(Car)o1;
		Car c2=(Car)o2;
		return o1.getName().compareTo(o2.name); 
		
	 
	  

}
	
	  

}
