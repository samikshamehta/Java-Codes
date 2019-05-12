import java.util.Scanner;


public class StackUsingLL<T> {
	private Node<T> head;
  	int size;
	public StackUsingLL() {
      size=0;
      head=null;
	}
	
	public int size() {
      return size;
	}
	
	public void push(T data) {
      Node<T> temp=head;
      Node<T> newnode=new Node<>(data);
      newnode.next=temp;
      head=newnode;
      size++;
	}
	
	public boolean isEmpty() {
      if(size==0)
        return true;
      else
        return false;
	}
	
	public T pop() throws StackEmptyException {
      if(size==0)
      {
        throw new  StackEmptyException();
      }
      Node<T> temp=head;
      head=head.next;
      size--;
      temp.next=null;
      return temp.data;
	}
	public T top() throws StackEmptyException {
       if(size==0)
      {
         throw new  StackEmptyException ();
      }
      return head.data;
	}
public static void main(String[] args) throws StackEmptyException 
{
      		Scanner s = new Scanner(System.in);

      		StackUsingLL<Integer> st = new StackUsingLL<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
    }

}
	class Node<T> {
		T data;
		Node<T> next;
	
		public Node(T data) {
			this.data = data;
		}
	}
