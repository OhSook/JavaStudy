package java0921;

public class SingletoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	SingletoneStudy ss = new SingletoneMain();
	
		// private에 접근하려면 메소드를 통해서 접근해라 ,,,,
		SingletoneStudy ss1 = SingletoneStudy.getInstace();
		SingletoneStudy ss2 = SingletoneStudy.getInstace();
		
		if(ss1 == ss2)
			System.out.println("same");
		else
			System.out.println("diff");
	}

}
