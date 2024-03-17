package java1004;

public class Combination implements Percent1 {
	int nFac = 1;
	int nrFac = 1;
	int rFac = 1;
	int result;
	
	public int oper(int x, int y) {
		
		for(int i = 1; i <= x; i++ ) {
			nFac *= i;
		}
		
		for(int i = 1; i <= x-y; i++) {
			nrFac *= i;
		}
		
		for(int i = 1; i <= y; i++) {
			rFac *= i;
			
		}
		
		result = nFac/(nrFac*rFac);
		
		return result;
	}
}
