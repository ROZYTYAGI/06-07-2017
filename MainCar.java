package niit;

public class MainCar {
	public static void main(String a[])
	{
	Car c1=new Car("A6","Black","audi");
	Car c2=new Car("A10","Black","aud");
	System.out.println(new CarComparator().compare(c1, c2));
	}
	}

