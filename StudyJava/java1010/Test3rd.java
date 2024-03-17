package java1010;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.util.*;

public class Test3rd {


	String name;
	String phoneNum;
	String address;
	String path;
	
	public Test3rd(String fileName) {
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
	
	public void writeData() {
		
		String data = this.readDate();
		
		try {
			data += this.name + "," + this.phoneNum 
						+ "," + this.address + "/";
			Writer writer = new FileWriter(this.path);
			writer.write(data);
			writer.flush();
			writer.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void delData(String key) {
		String originData = this.readDate();
		String[] str = originData.split("/");
		String resData = new String();
		
		for(int i=0;i < str.length;i++)
			if(str[i].contains(key))
				continue;
			else
				resData += str[i] +"/";
		
			try {
				Writer writer = new FileWriter(this.path);
				writer.write(resData);
				writer.flush();
				writer.close();				
			}catch(IOException e) {
				e.printStackTrace();
			}
		System.out.println("삭제완료!!!");
		
	}
	
	public void modData(String key,int op) {
		Scanner scan = new Scanner(System.in,"x-windows-949");
		System.out.print("입력 :");
		String val = scan.next();
		String OriginData = this.readDate();
		String[] str = OriginData.split("\n");
		String resData = new String();
		String[] str2;
		
		for(int i=0;i < str.length;i++)
			if(str[i].contains(key)) {
				str2 = str[i].split(",");
				switch (op) {
				case 1 :
					str2[0] = val;
					break;
				case 2 :
					str2[1] = val;
					break;
				case 3 :
					str2[2] = val;
					break;
				}
			for(int j=0;j < str2.length;j++) {
				if(j == str2.length-1)
					resData += str2[j] +"\n";
				else
					resData += str2[j] +",";
				}
			}
				
			else
				resData += str[i] +"\n";
		
			try {
				Writer writer = new FileWriter(this.path);
				writer.write(resData);
				writer.flush();
				writer.close();				
			}catch(IOException e) {
				e.printStackTrace();
			}		
		
	}
}
