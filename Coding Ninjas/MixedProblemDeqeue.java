import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Dequeue
{
	private LinkedList deque;
	int size;
	public Dequeue(int i) 
	{
		deque=new LinkedList<>();
		size=i;
	}
	public void insertFront(int item)
	{
		if(deque.size()==size)
		{
			System.out.println("-1");
		}
		deque.add(0,item);
	}
	public void insertRear(int item)
	{
		if(deque.size()==size)
		{
			System.out.println("-1");
		}
		deque.add(item);
	}
	public void deleteFront()
	{
        if(deque.isEmpty())
        {
			System.out.println("-1");
        }
        deque.remove(0);
    }
	public void deleteRear()
	{
        if(deque.isEmpty())
        {
			System.out.println("-1");
        }
        deque.remove(deque.size()-1);
	}
	public int getFront()
	{
       int item = (int) deque.get(0);
       return item;
	}
    
   public int getRear()
   {
       int item = (int) deque.get(deque.size()-1);
       return item;
   }
}
public class MixedProblemDeqeue 
{
	 public static void main(String[] args)
	 {
			Scanner s=new Scanner(System.in);
			Dequeue dq = new Dequeue(10);

			while(true)
			{
				int choice = s.nextInt(),input;
				switch (choice)
				{
					case 1:
						input = s.nextInt();
						dq.insertFront(input);
						break;
					case 2:
						input = s.nextInt();
						dq.insertRear(input);
						break;
					case 3:
						dq.deleteFront();
						break;
					case 4:
						dq.deleteRear();
						break;
					case 5:
						System.out.println(dq.getFront());
						break;
					case 6:
						System.out.println(dq.getRear());
						break;
					default:
						return ;
				}  
			}
	 }
}
	