package training;

public class MainTra {
	public static void main(String a[]) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();

		t.setHight(4);
		t.setWidth(3);

		t.draw();
		r.setHight(4);
		r.setWidth(5);

		r.draw();

	}

}
