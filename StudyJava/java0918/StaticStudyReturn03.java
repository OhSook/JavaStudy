package java0918;

public class StaticStudyReturn03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticStudy03.info);
		
		StaticStudy03.company = "LG";
		
		StaticStudy03 ss3 = new StaticStudy03();
		
		System.out.println(StaticStudy03.company); 
		System.out.println(StaticStudy03.info);
	}

}
