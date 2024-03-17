package java1006;
import java.io.FileWriter;
import java.io.Writer;

public class WriteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Writer wr = new FileWriter("C:/java/study3.txt");
			
			char a = 'A';
			wr.write(a);
			char b = 'B';
			wr.write(b);
			
			char[] arr = {'C','D','E'};
			wr.write(arr);
			
			wr.write("FVG");
			
			wr.flush();
			wr.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
