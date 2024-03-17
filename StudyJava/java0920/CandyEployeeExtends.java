package java0920;

import java0921.CandyBuget;

public class CandyEployeeExtends extends CandyData {

	private static int empCnt = 0;
	private int cmpNum;
	private String position; //직책
	private String respon;  //담당업무
	private int salePerform = 0; //판매실적
	
	CandyBuget budget = CandyBuget.getBuget();

	public void setInfo(String name, String date, String tel, int age,
						String acc, String position, String respon) {
		this.cmpNum = ++empCnt;
		this.setName(name);		
		this.setJoinDate(date);
		this.setTelNum(tel);
		this.setAge(age);
		this.setAccNum(acc);
		this.position = position;
		this.respon = respon;
	}
	
	public String getAllInfo() {
		String outputData = this.cmpNum + "\t" + this.getName() + "\t"
				+ this.getJoinDate() + "\t" + this.getTelNum() + "\t" 
				+ this.getAge() + "\t" + this.getAccNum() + "\t" 
				+ this.position + "\t" + this.respon;
		
		return outputData;
	}
	
	public void doSale() {
		this.salePerform++;
		System.out.println(this.getName() + "가 판매하였습니다.");
	}
	public int getSalePerform() {
		return this.salePerform;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void showSalePerform() {
		System.out.println(this.getName() + "는 " + this.salePerform + "개 판매하였습니다.");
	}
	
	public void giveSalary() {
		if(this.position.equals("부장")) 
			this.checkBalance(50000);
		else if(this.position.equals("대리")) {
			this.checkBalance(30000);			
		}else if(this.position.equals("직원")) {
			this.checkBalance(15000);
		}
	}
	
	public void setPosition(String x) {
		this.position = x;
	}
	
	private void checkBalance(int x) {
		budget.doWithDraw(x);
		if(budget.getBalance() > 0)
			System.out.println(this.getName() + "에게 월급 지급 완료!!");
		else {
			System.out.println("지급 실패 : 잔액부족");
			budget.doDeposit(x);
		}		
	}
	
}
	
