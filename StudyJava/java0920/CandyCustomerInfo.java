package java0920;

import java0921.CandyBuget;

public class CandyCustomerInfo extends CandyData {

	private int point=0;
	private String CusLevel = "일반";
//	CandyBuget budget = CandyBuget.getBuget();
	
	public void doPurchase() {
		this.point += 10;
		System.out.println("구매완료");
		if(point > 100)
			this.CusLevel = "VIP";
	}

	
	public void ShowLevel(String key) {
		if(this.getName().equals(key))
			System.out.println(this.CusLevel);
	}
	
	
	
	public int getPoint() {
		return this.point;
	}
	
	
	public String getLevel() {
		return this.CusLevel;
	}


	
}
	

