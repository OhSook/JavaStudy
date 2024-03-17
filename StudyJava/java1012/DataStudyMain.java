package java1012;
import java.text.*;
import java.util.*;

public class DataStudyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		String strNow = now.toString();
		
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.HH.dd HH:mm:ss");
		strNow = sdf.format(now);
		System.out.println(strNow);
	}

}
