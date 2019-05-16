import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class EasySumSetProblem {
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		int mina=Integer.MAX_VALUE,maxa=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			a.add(s.nextInt());
			if(a.get(i)<mina)
			{
				mina=a.get(i);
			}
			if(a.get(i)>maxa)
			{
				maxa=a.get(i);
			}
		}
		int m=s.nextInt();
		ArrayList<Integer>c=new ArrayList<Integer>();
		HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
		int minc=Integer.MAX_VALUE,maxc=Integer.MIN_VALUE;
		for(int i=0;i<m;i++)
		{
			int val=s.nextInt();
			c.add(val);
			hash.put(val,val);
			if(c.get(i)<minc)
			{
				minc=c.get(i);
			}
			if(c.get(i)>maxc)
			{
				maxc=c.get(i);
			}
		
		}
		int small=minc-mina;
		int large=maxc-maxa;
		int arr[]=new int[(large-small)+1];
		int j=0;
		for(int i=small;i<=large;i++)
		{
			arr[j++]=i;
		}
		int result[][]=subsets(arr);
		int size=Integer.MIN_VALUE,index = 0;
		boolean flag=false;
		for(int i=0;i<result.length;i++)
		{
			if(result[i].length>=a.size())
			{
				for(int j1=0; j1<a.size();j1++)
				{
					if(hash.containsKey(a.get(j1)+result[i][j1]))
					{
						flag=true;
					}
					else
					{
						flag=false;
					}
				}
			}
			int rem=result[i].length-a.size();
			if(flag==true)
			{
				for(int k=a.size();k<rem;k++)
				{
					if(hash.containsKey(result[i][k]))
					{
						flag=true;
					}
					else
					{
						flag=false;
					}
				}
			}
			if(flag==true)
			{
				if(result[i].length>size && result[i].length<=100)
				{
					size=result[i].length;
					index=i;
				}
			}
		}
		for(int j1=0;j1<result[index].length;j1++)
		{
			System.out.print(result[index][j1]+ " ");
		}
			
	}
	public static int[][] subsets(int input[])
	{
		if(input.length==0)
		{
			int ans[][]={{}};
			return ans;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallArray[i-1]=input[i];
		}
		int number=input[0];
		int smallResult[][]=subsets(smallArray);
		int ans[][]=new int[smallResult.length*2][];
		int k = 0;
		for(int i=0;i<smallResult.length;i++)
		{
			ans[k]=new int[smallResult[i].length+1];
			ans[k][0] = number;
			for(int j=0;j<smallResult[i].length;j++)
			{
				ans[k][j+1]=smallResult[i][j];	
			}
			k++;
		}
		for(int i=0;i<smallResult.length;i++)
		{
			ans[k]=new int[smallResult[i].length];
				for(int j=0;j<smallResult[i].length;j++)
				{
					ans[k][j]=smallResult[i][j];
				}
				k++;
		}
		return ans;
	}
}
		
		/*printSubsets(arr,hash,a);
	}
	public static void printSubsets(int input[],HashMap<Integer,Integer>hash,ArrayList<Integer>a) {
		int k=0,n=input.length-1;
		int A[]=new int[input.length];
		for(int i=0;i<input.length;i++)
		{
			A[i]=0;
		}
		PrintSubsets(A,input,k,n,hash,a);
}
	public static void PrintSubsets(int A[],int input[],int k,int n,HashMap<Integer,Integer>hash,ArrayList<Integer>a) {
		if(k==n)
		{
			A[k]=0;
			print(A,input,n,hash,a);
			A[k]=1;
			print(A,input,n,hash,a);
			return;
		}
		A[k]=0;
		PrintSubsets(A,input,k+1,n,hash,a);
		A[k]=1;
		PrintSubsets(A,input,k+1,n,hash,a);
	}
	public static void print(int A[],int input[],int n,HashMap<Integer,Integer>hash,ArrayList<Integer>a) {
		ArrayList<Integer>b=new ArrayList<Integer>();
		for(int i=0;i<=n;i++)
		{
			if(A[i]==1)
			{
				b.add(input[i]);
			}
		}
		if(b.size()==a.size() && b.size()<=100)
		{
			for(int j1=0;j1<b.size();j1++)
			{
				if(hash.containsKey(a.get(j1)+b.get(j1)));
				{
					System.out.print(b.get(j1)+ " ");
				}
			}
			System.out.println();
		}
	}
}*/