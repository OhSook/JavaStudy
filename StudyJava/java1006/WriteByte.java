package java1006;
import java.io.*;

public class WriteByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			OutputStream os = new FileOutputStream("C:/java/study1.db");
			
			byte a = 20;
			byte b = 10;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); // stream 전송시 버퍼 메모리에 남아있는 것들을 한 번에 넣어줌
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace(); // 에러의 종류를 알려줌 
			
		}
		
	}

}
