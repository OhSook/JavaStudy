package java0918;

import java.util.Scanner;

public class MatrixMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixMachine mm1;
		MatrixMachine mm2;
        MatrixMachine mSum;
        MatrixMachine mMul;
        MatrixMachine mScalar;
        MatrixMachine mTrans;
        
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		
		System.out.print("1. 행렬의 합\n" +"2. 행렬의 곱\n"+"3. 행렬의 스칼라 곱\n"+"4. 전치행렬\n");
		System.out.print("선택: " );
		int op = sc.nextInt();
		
		
		switch(op) {
		case 1:
			
			System.out.print("행렬을 입력하시오: ");
			mm1 = new MatrixMachine(scc.nextLine());
	        System.out.print("행렬을 입력하시오: ");
	        mm2 = new MatrixMachine(scc.nextLine());
	        
	        mSum = new MatrixMachine(mm1.sumMat(mm2));
	           
	        mSum.showMatrix();
	        break;
	        
		case 2:
			
			System.out.print("행렬을 입력하시오: ");
			mm1 = new MatrixMachine(scc.nextLine());	
	        System.out.print("행렬을 입력하시오: ");
	        mm2 = new MatrixMachine(scc.nextLine());
	        
	        mMul = new MatrixMachine(mm1.multiMat(mm2));
	        
	        mMul.showMatrix();
	        break;
	      
		case 3:
			
			System.out.print("행렬을 입력하시오: ");
			mm1 = new MatrixMachine(scc.nextLine()); // 이때 생성하면서 생성자를 호출하며 String 을 int 로 
	        System.out.print("스칼라를 입력하시오: ");
	        int a = scc.nextInt();
	        
	        mScalar = new MatrixMachine(mm1.scMat(a));
	    

	        mScalar.showMatrix();
	        break;
	        
		case 4:
			
			System.out.print("행렬을 입력하시오: ");
			mm1 = new MatrixMachine(scc.nextLine());
			mTrans = new MatrixMachine(mm1.transMat(mm1));
			mTrans.showMatrix();
			break;
			
		}
		
	
	
		// [123  14
		//  456  25
		//       36
        
//		
//        mm1.showMatrix();
//        mm2.showMatrix();
//        
//        //mSum = new MatrixMachine(mm1.sumMat(mm2));
//       // mSum.showMatrix(); 
//	
//        mMul = new MatrixMachine(mm1.multiMat(mm2));
//        mMul.showMatrix();
	}

}
