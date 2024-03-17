package java1004;

public class Triangle implements Figure {

	@Override
	public int area(int x, int y) {
		// TODO Auto-generated method stub
		
		return (x*y)/2;
	}

	@Override
	public int round(int x, int y, int t) {
		// TODO Auto-generated method stub
		return x+y+t;
	}

	
}
