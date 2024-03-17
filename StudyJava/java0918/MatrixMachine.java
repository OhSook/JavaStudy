package java0918;

import java.util.*;

public class MatrixMachine {
	
	int[][] matrix;
	int row = 0;
	int col = 0;
	final int[][] idenMat;
	
	
	/// 생성자 String -> int[][]
	MatrixMachine(String inputStr){
		this.matrix = new int[this.rowNum(inputStr)][this.colNum(inputStr)];
		String[] str = inputStr.replaceAll("[^0-9,-]", "").split(",");
		int k=0;
		for(int i=0;i < this.matrix.length;i++)
			for(int j=0;j < this.matrix[0].length;j++)
				this.matrix[i][j] = Integer.parseInt(str[k++]);
		
		this.idenMat = new int[this.row][this.col];
		for(int i = 0; i < this.idenMat.length; i++)
			for(int j = 0; j < this.idenMat[0].length; j++) {
				if(i==j)
					this.idenMat[i][j] = 1;
				else 
					this.idenMat[i][j] = 0;
				
			}
	}
	
	
	
	// 배열 보여주는 메소드
	void showMatrix(int[][] x) {
		
		for(int i=0;i < matrix.length;i++) {
			this.marLeftShape(i);
			for(int j=0;j < matrix[0].length;j++)
				System.out.printf("%d\t", this.matrix[i][j]);
			
			this.matRightShape(i);
			

		}
	}
	
	
	MatrixMachine(int[][] inputArr){
		
		this.matrix = new int[inputArr.length][inputArr[0].length];
		System.arraycopy(inputArr, 0, this.matrix, 0, inputArr.length);
		
		this.idenMat = new int[this.row][this.col];
		for(int i = 0; i < this.idenMat.length; i++)
			for(int j = 0; j < this.idenMat[0].length; j++) {
				if(i==j)
					this.idenMat[i][j] = 1;
				else 
					this.idenMat[i][j] = 0;
				
			}
	}
	
	
	// 행의 수 세기 메소드
	
	int rowNum(String str) {
		char[] arrCharAt = new char[str.length()];
		
		for(int i=0;i < arrCharAt.length;i++)
			arrCharAt[i] = str.charAt(i);
		
		for(int i=0;i < arrCharAt.length;i++)
			if(arrCharAt[i] == '[')
				this.row++;
			
		if(this.row != 1)
			this.row -= 1; // 행의 길이 계산해서 [ 기준으로 
			
		return this.row;	
	}
	
	
	// 열의 수 세기 메호드 인자값: 입력한 str 값 
	
	int colNum(String str) {
		char[] arrCharAt = new char[str.length()];
		boolean colFlag = true; // 상태값
		int comma = 0;
		
		for(int i=0;i < arrCharAt.length;i++)
			arrCharAt[i] = str.charAt(i);
		
		for(int i=0; i < arrCharAt.length;i++) {
			if(arrCharAt[i] == ',' && colFlag)
				comma++;
			else if(arrCharAt[i] == ']')
				colFlag = false;
		}
		col = comma + 1;
		
		return this.col;
	}
	
	
	
	// 왼 쪽에 모양 찍어주는 메소드
	
	void marLeftShape(int i) {
		if(i==0) {
			System.out.println("---------------결과---------------");
			System.out.print("┌\t");
		}
		else if(i == matrix.length - 1)
			System.out.print("└\t");
		else
			System.out.print("│\t");
	}
	
	
	// 오른 쪽에 모양 찍어주는 메소드
	void matRightShape(int i) {
		
		if(i==0)
			System.out.print("┐");
		else if(i == matrix.length - 1)
			System.out.print("┘");
		else
			System.out.print("│");
		System.out.println();
	}
	
	// 덧셈 메소드
	
	int[][] sumMat(MatrixMachine x) {
	
		if(this.row !=  x.row || this.col != x.col) {
			System.out.print("두 행렬의 크기가 다르므로 연산 불가.");
			// return; // 바로 종료되는 의미로 넣음 
		}
		
		int[][] arr = new int[x.row][x.col];
		for(int i=0;i < matrix.length;i++) 
			for(int j=0;j < matrix[0].length;j++)
				arr[i][j] = this.matrix[i][j]+x.matrix[i][j];
		return arr;	
	}
	
	
	
	int[][] multiMat(MatrixMachine x) {
		
		if(this.col != x.row ) {
			System.out.print("두 행렬의 열의 크기가 다르므로 연산 불가.");
			 // 바로 종료되는 의미로 넣음 
		}
		
		int[][] arr = new int[this.row][x.col];
		// [12   1     1*1+2*4  a[i] b[j]  [0,0] [0,1]  [0] i = 0 
		//  34   2 	   3*1+4*2  			[1,0] [1,1  [1]
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) 
				for(int z = 0; z < this.row; z++) 
					arr[i][j] += this.matrix[i][z] * x.matrix[z][j];		
	}
		return arr;
		
		
	}
	
	int[][] scMat(int x){
		
		int[][] arr = new int[this.row][this.col];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++)
				arr[i][j] = this.matrix[i][j] * x;
		}
		
		return arr;
		
	}
	
	int[][] transMat(MatrixMachine x){
		int[][] arr = new int[this.col][this.row];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; i < arr[0].length; j++) 
				arr[j][i] = this.matrix[i][j];
				
			}
			return arr;
			
		}
		
	}



			
			
			
			

	
	
	
