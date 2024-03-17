package java0925;

public class SmartPhone extends Phone{
	
	SmartPhone(String owner){
		super(owner); // 부모 거 갖고 올 때 super 내 건 this
		
		
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 함");
	}
}
