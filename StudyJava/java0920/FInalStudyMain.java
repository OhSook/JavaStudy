package java0920;

public class FInalStudyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalStudy fs = new FinalStudy("철수");
		
		System.out.println(fs.name);
		System.out.println(fs.name2);
		
		fs.name2 = "순희";
		System.out.println(fs.name2);
		// fs.name = "민수"; // final로 선언해놓은 건 바꾸지 못 함 
		

	}

}
