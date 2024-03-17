package java0920;

// 접근 제한자: public , default
// get은 output
// set은 input 

public class GetSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSetStudy gs = new GetSetStudy();
				
		//gs.x = 2;
		//gs.y = 3; // private 필드에 접근하기 위해서 
	
		gs.setX(3); // 이렇게 접근해서 값을 넣는다
		gs.setY(1); 
		
		// 값을 받아와서 접근
		System.out.println(gs.getX());
		System.out.println(gs.getY());
		
	}

}
