package java1004;

public class FigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure sqr = new Square();
		
		System.out.println(sqr.area(3, 2));
		
		Figure cir = new Circle();
		
		System.out.println(cir.area(3, 2));
	}

}
