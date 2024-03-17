package java0915;

public class ObjectArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInfo[] bi = new BookInfo[5];	// String은 메모상에 참조로 저장되어있다. 참조를 넣어주는 것 
		
		for(int i = 0; i < bi.length; i++) // 하나씩 참조를 명시해줘야 함 
			bi[i] = new BookInfo();
		
		bi[0].bookName = "개미와 배짱이";
		bi[1].bookName = "냠냠람쥐";
		
		System.err.println(bi[0].bookName);
		System.err.print(bi[1].bookName);
	}

}
