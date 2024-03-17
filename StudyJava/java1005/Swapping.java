package java1005;
import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x , y, t;
		System.out.println("x : ");
		x = sc.nextInt();
		System.out.println("y : ");
		y = sc.nextInt();
		
		t = x;
		x = y;
		y = t;
		
		System.out.println("x: " + x + " y: " + y);
	
	
	}

}
