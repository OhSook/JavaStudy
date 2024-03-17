package java0921;

public class CandyInven {


	private int stawberry = 0;
	private int shineMusket = 0;
	private int grape = 0;
	private int tangerine = 0;
	
	CandyBuget budget = CandyBuget.getBuget();
	private static CandyInven inven = new CandyInven();
	
	private CandyInven() {
		
	}
	
	public void store(String fruit, int num) {
		switch (fruit) {
		case "딸기" :
			//if(checkBalance(num))
				this.stawberry += num;			
			break;
		case "샤인머스킷" :
			//if(checkBalance(num))
				this.shineMusket += num;
			break;
		case "포도" :
			//if(checkBalance(num))
				this.grape += num;
			break;
		case "귤" :
			//if(checkBalance(num))
				this.tangerine += num;
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	
	public void sale(String fruit, int num) {
		switch (fruit) {
		case "딸기" :
			//if(checkBalance(num))
				this.stawberry -= num;			
			break;
		case "샤인머스킷" :
			//if(checkBalance(num))
				this.shineMusket -= num;
			break;
		case "포도" :
			//if(checkBalance(num))
				this.grape -= num;
			break;
		case "귤" :
			//if(checkBalance(num))
				this.tangerine -= num;
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public boolean isSoldOut(String fruit) {
	    switch (fruit) {
	        case "딸기" :
	            return this.stawberry <= 0;
	        case "샤인머스킷" :
	            return this.shineMusket <= 0;
	        case "포도" :
	        	return this.grape <= 0;
	        case "귤" :
	            return this.tangerine <= 0;
	        default :
	            return true; // 다른 과일이면 항상 품절 상태로 처리
	    }
	}
	
	public int getstawberry() {
		return this.stawberry;
	}
	public int getShineMusket() {
		return this.shineMusket;
	}
	public int getGrape() {
		return this.grape;
	}
	public int getTangerine() {
		return this.tangerine;
	}
	
	public static CandyInven getInstance() {
		return inven;
	}
	

}
