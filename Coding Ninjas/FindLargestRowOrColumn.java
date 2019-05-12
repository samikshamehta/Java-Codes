import java.util.Scanner;


public class FindLargestRowOrColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=s.nextInt();
			}
		}
		findLargest(array);
	
	}
	public static void findLargest(int input[][]){
		int sumrow=0,sumcolumn=0,i,j,count=0,row=0,column=0;
		for(i=0;i<input.length;i++)
		{
			for(j=0;j<input[0].length;j++)
			{
				count=count+input[i][j];
			}
			if(sumrow<count)
			{
				sumrow=count;
				row=i;
			}
			count=0;
		}
		for(j=0;j<input[0].length;j++)
		{
			for(i=0;i<input.length;i++)
			{
				count=count+input[i][j];
			}
			if(sumcolumn<count)
			{
				sumcolumn=count;
				column=j;
			}
			count=0;
		}
		if(sumrow>sumcolumn)
		{
			System.out.println("row"+ " "+row+ " "+sumrow);
		}
		else
		{
			System.out.println("column"+ " "+column+ " "+sumcolumn);

		}
	}

}
