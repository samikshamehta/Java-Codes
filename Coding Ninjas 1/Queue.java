
public class Queue<T> {
	private T[] dataArray;
	int size;
	int front ;
	int rear;
	public Queue(int n) 
	{
		this.dataArray = (T[])new Object[n];
		this.size = 0;
		this.front = -1;
		this.rear = -1;
		
	}
	
	void enqueue(T data) throws QueueOverFlowException
	{
		if(size==dataArray.length)
		{
			throw new QueueOverFlowException();
		}
		if(size==0)
		{
			front = 0;
		}
		size++;
		rear = (rear+1)%dataArray.length;
		dataArray[rear] = data;
	}
	T dequeue() throws QueueUnderFlowException
	{
		if(front==-1)
		{
			throw new QueueUnderFlowException();
		}
		T temp = dataArray[front];
		front= (front+1)%dataArray.length;
		size--;
		if(size==0)
		{
			front = -1;
			rear=-1;
		}
		return temp;
	}
}
