package java0921;



public class CandyBuget {
	
	private int TotalAcc = 100000;
	private int cntPerDay = 0;
	
	private static CandyBuget cb = new CandyBuget();
	
	public void setCntPerDay(int cnt) {
		cntPerDay += cnt;
	}
	
	public int getCntPerDay() {
		return cntPerDay;
	}
	
	private CandyBuget() {
		
	}
	
	public static CandyBuget getBuget() {
		return cb;
	}
	
	public void doDeposit(int m) {
		this.TotalAcc += m;
	}
	
	public void doWithDraw(int m) {
		this.TotalAcc -= m;
	}
	
	public int getBalance() {
		return this.TotalAcc;
	}
	

}
