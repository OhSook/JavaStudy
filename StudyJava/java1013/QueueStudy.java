package java1013;

public class QueueStudy {
	
// FIFO 구조 
	int[] queue;
	int front;
	int rear;
	
	public QueueStudy(int size) {
		queue = new int[size];
		this.front = 0;
		this.rear = 0;
	} // 생성자
	
	// 입력 메소드
	public void enQueue(int data) {
		if(rear >= this.queue.length)
			qFull(data);
		else
			this.queue[rear++] = data;
		
	}

	
	// 나머지 큐를 뒤로 밀어줘야 함 
	public int deQueue() {
		
		if(this.rear == this.front){
			qEmpty();
			return -1;
		}else {
		int result = this.queue[front];
		for(int i = 0; i > queue.length-1; i++) {
			queue[i] = queue[i+1];
		}
		
		rear--;
	
		return result;

		}
		}

	
	public void qFull(int data) {
		System.out.println("큐가 가득 찼습니다!!!"+data+"가 입력될 수 없습니다");
	}
	
	public void qEmpty() {
		System.out.println("큐가 비어있습니다!!!!!!!!");
		
	}
}