package cameraShop;

public class Queue {

	private int size;
	private int front = -1;
	private int rear = -1;
	private Integer[] queueArray;

	public Queue(int size) {
		this.size = size;
		queueArray = new Integer[size];
	}

	//Push items to arrayQueue
	public void push(int item) {
		if (rear == size - 1) {
			System.out.println("Queue is too small, item " + item + " is not pushed to queue" );

		} else if (front == -1) {
			//Push first item to queue
			rear++;
			queueArray[rear] = item;
			front = rear;
			System.out.println("Pushed item " + item + " to queue");

		} else {
			//Push all other items to queue
			rear++;
			queueArray[rear] = item;
			System.out.println("Pushed item " + item + " to queue");
		}
	}

	//Pop items from arrayQueue
	public void pop() {
		if (front == -1) {
			System.out.println("Queue is empty");

		} else if (front == rear) {
			//Remove last remaining item from queue
			System.out.println("Removed item " + queueArray[front]);
			queueArray[front] = null;
			front--;
			rear--;

		} else {
			//Remove item from queue
			System.out.println("Removed item " + queueArray[front]);
			queueArray[front] = null;
			for (int i = front + 1; i <= rear; i++) {
				queueArray[i-1] = queueArray[i];
			}
			rear--;

		}
	}

	//Display complete array
	public void showQueue() {
		if (front == -1)
			System.out.println("Queue is empty");
		else {
			System.out.println("Complete queue is:");
			for (int i = front; i <= rear; i++) {
				System.out.print(queueArray[i] + ", ");
			}
			System.out.println();
		}

	}

}
