package java0927;

import java.util.*;

public class VectorMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String input2 = sc.next();
		VectorMachine vc = new VectorMachine(input);
		VectorMachine unit = new VectorMachine(vc.vector.length);  
		VectorMachine vc2 = new VectorMachine(input2);
		VectorMachine resVec = new VectorMachine(vc.vector.length);
		
//		
//		vc.showVector();
//		System.out.println(vc.getVectorLen()); // 제곱근
//	
//		
//		unit.setVector(vc.getUnitVector());
//		unit.showVector();
//		
//		
//		vc2 = vc.multiVector(3);
//		vc2.showVector();
//		
		resVec.setVector(vc.projection(vc2));
		resVec.showVector();
	}

}
