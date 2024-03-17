package java1006;
import java.io.*;

public class ReadByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			InputStream is = new FileInputStream("C:\\java\\study2.db"); // Input이 부모
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break; //파일의 끝이 되면
				
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
					
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
