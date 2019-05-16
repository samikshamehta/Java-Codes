import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class DataType {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
	    int n = s.nextInt();
	    int arr[]=new int[n+1];
	    ArrayList<Integer> prime=new ArrayList<>();
	    prime.add(0, 0);
	    prime.add(1,0);
	    for(int i=1;i<=n;i++)
	    {
	    	arr[i]=s.nextInt();
	    	prime=PrimeNumber(prime,arr[i]); 	
	    }
	    for(int i=1;i<=n;i++)
	    {
	    	if(arr[i]!=prime.get(arr[i]))
	    	{
	    		int j=i+k;
	    		if(j<=n)
	    		{
	    			prime=PrimeNumber(prime,arr[i]+arr[j]);
	    		}
	    	}
	    }
	    int count=0;
	    while(count<2)
	    {
		    for(int i=1;i<=n;i++)
		    {
		    	if(count!=0)
		    	{
			    	if(prime.get(i)!=0)
			    	{
			    		i++;
			    	}
			    	else
			    	{
			    		int j=i+k;
				    	if(j<=n)
				    	{
					    	int sum=arr[i]+arr[j];
					    	if(!(prime.get(arr[i])!=0 && prime.get(arr[j])!=0))
					    	{
						    	for(int l=2;l<sum;l++)
						    	{
						    		int result=sum-prime.get(l);
						    		if(prime.get(result)!=0 && prime.get(l)!=0)
						    		{
						    			arr[i]=result;
						    			arr[j]=l;
						    			break;
						    		}
						    	}
					    	}
				    	}
				    }
		    	}
		    	else
		    	{
		    		int j=i+k;
			    	if(j<=n)
			    	{
				    	int sum=arr[i]+arr[j];
				    	if(!(prime.get(arr[i])!=0 && prime.get(arr[j])!=0))
				    	{
					    	for(int l=2;l<sum;l++)
					    	{
					    		int result=sum-prime.get(l);
					    		if(prime.get(result)!=0 && prime.get(l)!=0)
					    		{
					    			arr[i]=result;
					    			arr[j]=l;
					    			break;
					    		}
					    	}
				    	}
			    	}
		    	}
		    }
		    count++;
	    }
	    int flag=0;
	    for(int i=1;i<=n;i++)
	    {
	    	if(prime.get(arr[i])!=0)
	    	{
	    		flag=1;
	    	}
	    	else
	    	{
	    		flag=0;
	    		break;
	    	}
	    }
	    if(flag==1)
	    {
	    	System.out.println("1");
	    }
	    else
	    {
	    	System.out.println("-1");
	    }
	}
	public static ArrayList<Integer>PrimeNumber(ArrayList<Integer>prime,int value)
	{
		int size=prime.size();
    	for(int j=0+size;j<=value;j++)
        {
    		prime.add(j, j);
        }
        for(int p = 2; p*p <=value; p++)
        {
        	if(prime.get(p) != 0)
            {
                for(int j= p*2; j <= value; j += p)
                {
                    prime.set(j,0);
                }
            }
         }
		return prime;
	}
}