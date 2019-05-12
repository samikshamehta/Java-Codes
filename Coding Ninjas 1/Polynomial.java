import java.util.Scanner;


public class Polynomial
{
	static int max=0;
	public  static void arrlength(int[] degree1,int[] degree2)
	{
		int max1=0,max2=0;
		for(int i=0;i<degree1.length;i++)
		{
			if(degree1[i]>=max1)
			{
				max1=degree1[i];
			}
		}
		for(int i=0;i<degree2.length;i++)
		{
			if(degree2[i]>=max2)
			{
				max2=degree2[i];
			}
		}
		if(max1>=max2)
		{
			max=max1;
		}
		else
		{
			max=max2;
		}
		
	}
	int arr[]=new int[max];
	public void setCoefficient(int degree, int coeff)
	{
		arr[degree]=coeff;	
	}
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+"x"+i+" ");
			}
		}
	}
	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p)
	{
		for(int i=0;i<arr.length;i++)
		{
			this.arr[i]+=p.arr[i];
		}
		return this;		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p)
	{
		for(int i=0;i<arr.length;i++)
		{
			this.arr[i]-=p.arr[i];
		}
		return this;	
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p)
	{
		Polynomial c = new Polynomial();
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr.length/2;j++)
			{
				 c.arr[i+j]+=(this.arr[i])*(p.arr[j]);
			}
		}
		return c;	
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			coeff1[i] = s.nextInt();
		}
		int n1 = s.nextInt();
		int degree2[] = new int[n1];
		for(int i = 0; i < n1; i++)
		{
			degree2[i] = s.nextInt();
		}
		int coeff2[] = new int[n1];
		for(int i = 0; i < n1; i++)
		{
			coeff2[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		arrlength(degree1,degree2);
		for(int i = 0; i < n; i++)
		{
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++)
		{
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice)
		{
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
}

