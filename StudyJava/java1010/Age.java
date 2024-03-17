package java1010;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Age {
	
	String path;
	
	public Age(String fileName) {
		this.path = new String(fileName);
	}
	
	public String readDate() {
		String valStr = new String();
	
		try {
			Reader reader = new FileReader(this.path);
			while(true) {
				int data = reader.read();
				if(data == -1)
					break;
				valStr += (char)data;
				
			
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return valStr;
}

}
