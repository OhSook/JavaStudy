package java1006;
import java.io.*;

public class WriteByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			OutputStream os = new FileOutputStream("C:\\java\\study2.db");
			
			byte[] arr = {10,20,30};
			
			os.write(arr);
			os.flush();
			os.close();
			
		} catch (Exception e) {
			
		}
	}

}
