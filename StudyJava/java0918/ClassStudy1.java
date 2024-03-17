package java0918;

public class ClassStudy1 {
	////// 필드 선언 필드만 있으면 자동으로 생성자 만듦 
	String bookName;
	String authorName;
	String publisher = "고누아이 출판사"; // 출판사 이름 초기화
	String translator;
	String pubDate;
	int price;
	
	
	/* 
	   생성자 오버로딩: 매개변수를 달리하는 생성자를 여러 개 선언하는 것 
	   형이 같고 갯수마저 같으면 컴파일 에러가 난다  
	   객체마다 동일한 값을 갖고 있다면 필드 선언 시 초기값을 대입하는 것이 좋고,
	   객체마다 다른 값을 가져야 한다면 생성자에서 필드를 초기화하는 것이 좋다.
	   this.() 를 사용하면 내 클래스 놈과 밖의 놈을 구분해줌 그래서 변수명이 같아도 사용 가능
	   중복된 생성자를 반복해서 쓰니깐 정말 비효율적 -> 다른 생성자를 호출하여 처리 
	   
	   메서드  : 클래스 내에 선언된 함수 구성요소 : 메소드의 이름, 파라미터, 리턴 타입
	*/

	
/* 	////////////////////////// 컴파일 에러 //////////////////
	public ClassStudy1(String author, boolean t) {
		if(t)
			this.authorName = author;
		else
			this.authorName = "[고전]" + author;
		
	}
*/
	
	
	
	// 생성자 똑같은 이름으로 : 오버 로딩
	public ClassStudy1(String name) {
		
		this.bookName = name;
		
	}
	
	
	public ClassStudy1(String name, boolean t) {
		if(t)
			this.bookName = name;
		else
			this.bookName = "[고전]" + name;
		
	}
	
		
	public ClassStudy1(String name, String author) {
		/* this.bookName = name;
		this.authorName = author; */
		this(name, author,"","","",0);

	}
	
	
	public ClassStudy1(String name, String author, String pub) {
	 /* this.bookName = name;
		this.authorName = author;
		this.publisher = pub;
		*/
		this(name, author,pub,"","",0);
	}
	
	
	public ClassStudy1(String name, String author, String translator, String pubD) {
/*		this.bookName = name;
		this.authorName = author;
		this.translator = translator;  // this.을 써서 중복으로 사용가능
		this.pubDate = pubD;
*/		
		this(name, author, translator, pubD,"",0);  // 다른 생성자를 호출 재귀함수와 비슷 (나 자신 호출)
	}
	
	
	public ClassStudy1(String name, String author, String pub, String translator, String pubD, int price) {
		this.bookName = name;
		this.authorName = author;
		this.translator = translator;  // this.을 써서 중복으로 사용가능
		this.publisher = pub;
		this.pubDate = pubD;
		this.price = price;		
	}
	
	
	
	//////////////////////// 메소드 영역 ///////////////////////
	
	void showBookName() {
		System.out.println(this.bookName);
	}
	
	void showBookAllInfo() {
		System.out.println("책이름 : " + this.bookName);
		System.out.println("저자 : " + this.authorName);
		System.out.println("번역 : " + this.translator);
		System.out.println("출판 : " + this.publisher);
		System.out.println("출판일 : " + this.pubDate);
		System.out.println("가격 : " + this.price + "원");
		
	}
	
}
