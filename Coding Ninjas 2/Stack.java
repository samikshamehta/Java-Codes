
public class Stack<T>
	{
		private T[] dataArray;
		private int top;
		public Stack(int n)
		{
			this.dataArray=(T[])new Object[n];
			this.top=-1;
		}
		public int size()
		{
			return top + 1;
		}
		public boolean isFull()
		{
			return size() == dataArray.length;
		}
		public boolean isEmpty()
		{
			return size() == 0;
		}
		public void push(T data)throws StackOverFlowException
		{
			if (isFull())
			{
				throw new StackOverFlowException();
			}
			top++;
			dataArray[top] = data;
			System.out.println(data);
		}
		public <T> T pop() throws StackUnderFlowException
		{
			if (top == -1) 
			{
				throw new StackUnderFlowException();
			}
			T temp=(T)dataArray[top];
			top--;
			return temp;
		}

	}



