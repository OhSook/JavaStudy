package java1013;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueStudy qs = new QueueStudy(5);
		
		qs.enQueue(3);
		qs.enQueue(5);
		qs.enQueue(7);
		qs.enQueue(7);
		qs.enQueue(7);
		qs.enQueue(7);
		
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
	}

}
