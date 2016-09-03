
public class PriorityQueue {

	private int[] data;
	private int size;

	public PriorityQueue(int size) {
		super();
		data = new int[size];
		this.size = 0;
	}

	public void push(int insert) throws Exception {

		if (size == data.length) {

			throw new Exception("Queue is full");

		}

		if (size == 0) {
			data[0] = insert;
		} else {
			int i = size - 1;
			for (; i >= 0; i--) {
				if (data[i] < insert)
					data[i + 1] = data[i];
				else
					break;
			}
			data[i + 1] = insert;
		}

		size++;
	}

	public int pop() throws Exception {

		if (size == 0)
			throw new Exception("Queue is empty");
		return data[--size];
	}

	public int peek() throws Exception {

		if (size == 0)
			throw new Exception("Queue is empty");
		return data[size - 1];
	}

	public boolean isEmpty() {

		return (size == 0);
	}
	
	public boolean isFull(){
		
		return (size == data.length);
	}
}
