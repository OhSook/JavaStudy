package java0918;

public class StaticStudyReturn02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticStudy02 ss2_1 = new StaticStudy02(4,5);
		StaticStudy02 ss2_2 = new StaticStudy02(3,6);
		StaticStudy02 ss2_3 = new StaticStudy02(6,7);
		
		System.out.println(ss2_1.sum());
		System.out.println(ss2_1.sum());
		System.out.println(ss2_2.sum());
		System.out.println(ss2_2.sum());
		System.out.println(ss2_3.sum());
		System.out.println(ss2_3.sum());
		
		System.out.println(StaticStudy02.plusCount);
		
	}

}
