package java1006;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

public class Readtxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Reader rd = null;
			
			rd = new FileReader("C:\\java\\study3.txt");
			
			while(true) {
				int data = rd.read();
				if(data == -1)
					break;
				System.out.print((char)data);
				
			}
			
			rd.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
