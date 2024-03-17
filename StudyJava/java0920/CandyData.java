package java0920;

import java0921.*;

public class CandyData {
	
	private int cusNum;
	private String name;
	private String joinDate;
	private String telNum;
	private int age;
	private String accNum;	
	
	private static int cusCnt = 0;
	
	public void setCusInfo(String name, String date, String tel, int age, String acc) {
		this.cusNum = ++cusCnt;
		this.name = name;
		this.joinDate = date;
		this.telNum = tel;
		this.age = age;
		this.accNum = acc;
	}
	
	public String getAllCusInfo() {
		String outputData = this.cusNum + "\t" + this.name + "\t" + this.joinDate
				+ "\t" + this.telNum + "\t" + this.age + "\t" + this.accNum;
		return outputData;
	}
	
	public int getCusNum() {
		return this.cusNum;
	}
	
	public void setCusNum(int cusNum) {
		this.cusNum = cusNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJoinDate() {
		return this.joinDate;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getTelNum() {
		return this.telNum;
	}
	
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAccNum() {
		return this.accNum;
	}
	
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
}
