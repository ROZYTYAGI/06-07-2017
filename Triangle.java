package training;



public class Triangle extends Shape {

	
	@Override
	public void draw() {
		int h=getHight();
		int w=getWidth();
		 for (int x = 1; x <=h; x++)
	        {
	            for (int i = 1; i <= x; i++)
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}




	
		
       
    }
	


