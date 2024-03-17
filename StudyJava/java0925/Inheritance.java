package java0925;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 작은 형에서 큰 형으로 변환할 때 자동형변환이 일어남 그것의 성질,,@@
		Child child = new Child();
		
		Parent parent = child;
		
	//	Parent child - new Parent();
		
	//	Parent parent = (Child)child; 부모를 자식에게 넣으려고 하면 형변환 X 에러가 남 
		
		parent.method1();
		parent.method2();
	//	parent.method3(); 부모한테 없는 메소드는 실행 X 
		
	}

}
