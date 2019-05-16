import java.util.Scanner;

public class StackOperation {
	public static void main(String args[])
    {
		Scanner s= new Scanner(System.in);
		StackOp st = new StackOp();
        int n=s.nextInt();
        int k=s.nextInt();
        int max=Integer.MIN_VALUE,index = 0;
        for(int i=0;i<n;i++)
        {
        	int data=s.nextInt();
        	st.push(data);
        	if(i<k)
        	{
        		if(max<data)
        		{
        			max=data;
        			index=i;
        		}
        	}
        }
        System.out.println(k+index);
    }
}
class StackOp
{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    StackOp()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= (MAX-1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
}
