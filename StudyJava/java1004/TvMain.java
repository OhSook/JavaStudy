package java1004;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new BeanFactory();
		
		TV tv= (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();		

	}

}
