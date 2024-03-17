package java0918;


public class ClassStudyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/////////// 생성자 정의 , 다형성

		ClassStudy1 cs = new ClassStudy1("토끼와 거북이", "미상");
		ClassStudy1 cs2 = new ClassStudy1("흥부와 놀부");
		ClassStudy1 cs3 = new ClassStudy1("흥부와 놀부","홍길동","머시기출판사");
		ClassStudy1 cs4 = new ClassStudy1("어린왕자", false);
		ClassStudy1 cs5 = new ClassStudy1("홍김동전", "박냠냠","람쥐출판","김땡모","2022-04-03",140000);
		
		System.out.println("----------------------생성자 호출---------------------------------");
		System.out.println(cs.bookName+ " "+cs.authorName+ " " + cs.publisher);
		System.out.println(cs2.bookName+ " "+cs2.publisher+cs2.price);
		System.out.println(cs3.bookName+ " "+cs3.authorName+ " "+cs3.publisher);
		System.out.println(cs4.bookName+ " "+cs4.authorName+ " "+cs4.publisher);
		System.out.println("----------------------메소드 호출---------------------------------");
		cs.showBookName();
		cs2.showBookName();
		cs5.showBookAllInfo();
		
		
		
	}

}
