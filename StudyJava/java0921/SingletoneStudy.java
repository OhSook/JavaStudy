package java0921;

public class SingletoneStudy {
	
	private static SingletoneStudy ss = new SingletoneStudy();
	
	private SingletoneStudy(){
		
	}
	
	public static SingletoneStudy getInstace() {
		return ss;
	}

}
