package java0927;

import java.util.*;
import java0918.MatrixMachine;

public class VectorMachine {

    double[] vector;
    
    VectorMachine(int size){
    	this.vector = new double[size];
    }
    
    
    VectorMachine(String str) {      // 클래스 생성자 '문자열'로 입력 받는다.
       
       String[] strV = str.split("\\D+");      // "\\D" : 숫자가 아닌 문자를 기준으로 분할 -> 숫자만 추출하여 배열에 저장
       this.vector = new double[strV.length -1];
       
       for(int i = 0; i < this.vector.length; i++)
          this.vector[i] = Double.parseDouble(strV[i+1]);      // 문자열 배열 strV를 정수형으로 반환하여 배열에 저장
       
    }
    
    
    public void setVector(VectorMachine x) {
    	System.arraycopy(x.vector, 0, this.vector, 0, x.vector.length);
    }
    
    
    void showVector() {
       for(int i = 0; i < this.vector.length; i++)
          System.out.print(this.vector[i] + " ");
       System.out.println();
    }
    
    
    double getVectorLen() {
    	int sum = 0;
    	for(int i = 0; i < this.vector.length; i++)
    		sum += this.vector[i] * this.vector[i];
    	
    	return Math.sqrt(sum);
       
    }
    
    
    VectorMachine getUnitVector() { // 단위 벡터 구함 
    	VectorMachine result = new VectorMachine(this.vector.length);
    	
    	for(int i = 0; i < this.vector.length; i++) {
    		result.vector[i] = this.vector[i] / this.getVectorLen();
    	} 
    	
    	return result;
		
	}
    

    public double getDotProduct(VectorMachine vm) {      // 벡터내적
        
        double result = 0;
        for(int i = 0; i < this.vector.length; i++)
           result += this.vector[i] * vm.vector[i];
        
        return result;
     }
     
     public double getAngle(VectorMachine vm) {      //두 벡터의 사잇각
        
        double result = this.getDotProduct(vm) 
                 / (this.getVectorLen() * vm.getVectorLen());   // 두 벡터의 내적 / 두 벡터의 크기
  
        return Math.toDegrees(Math.acos(result));
     }
     
     
     VectorMachine multiVector(double v) {
    	 VectorMachine result = new VectorMachine(this.vector.length);
    	 
    	 for(int i = 0; i < result.vector.length; i++) {
    		 result.vector[i] = this.vector[i] * v;
    		 
    	 }
    	 
    	 return result;
    	 
     }
     
     
     // 정사영 
     VectorMachine projection(VectorMachine vm) {
    	 return vm.multiVector(this.getDotProduct(vm)/vm.getDotProduct(vm));
    	 }
 }