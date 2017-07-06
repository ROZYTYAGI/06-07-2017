package newniit;

import training.Rectangle;
import training.Triangle;

public class Mainshape {
		public static void main(String a[]) {
			Triangle t = new Triangle();
			

			t.setHight(4);
			t.setWidth(3);

			t.draw();
			Shape Shape=new Shape() {
			
		
			public void draw() {
			
			 setHight(5);
			 setWidth(4);
			for (int x = 1; x <=getHight(); x++)
		        {
		            for (int i = 1; i <= x; i++)
		            {
		                System.out.print("*");
		            }
		            System.out.println("");
		        }
			
			
			}
			};
			 Shape.draw();		

		
			

}
}


			
			

