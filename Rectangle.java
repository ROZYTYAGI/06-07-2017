package training;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int h = getHight();
		int w = getWidth();
		for (int x = 1; x <= h; x++) {
			for (int i = 1; i <= w; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
