import java.util.Scanner;


public class SpiralPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int array[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[i][j]=s.nextInt();
			}
		}
		spiralPrint(array);
	}
	public static void spiralPrint(int matrix[][]){
		int r=matrix.length;
		int c=matrix[0].length;
		int i=0,j=0,s=0;
		while(r>0 && c>0)
		{
			System.out.println("r"+" "+r+ " "+"c"+" "+c);
			while(c>j)
			{
				System.out.println("c"+" "+matrix[i][j]+ " "+i+" "+j);
				j=(j+1);
			}
			j=(j-1);
			i=(i+1);
			System.out.println("i"+" "+i+" "+"j"+" "+j);
			while(r>i)
			{
				System.out.println("r"+" "+matrix[i][j]+ " "+i+" "+j);
				i=(i+1);
			}
			r=r-1;
			c=c-1;
			j=j-1;
			i=i-1;
			System.out.println("r"+" "+r+ " "+"c"+" "+c+" "+"i"+" "+i+" "+"j"+" "+j);
			while(s<=j)
			{
				System.out.println("c"+" "+matrix[i][j]+ " "+i+" "+j);
				j=(j-1);
			}
			j=(j+1);
			i=(i-1);
			System.out.println("i"+" "+i+" "+"j"+" "+j);
			while(s+1<=i)
			{
				System.out.println("r"+" "+matrix[i][j]+ " "+i+" "+j);
				i=(i-1);
			}
			r=r-1;
			c=c-1;
			j=j+1;
			i=i+1;
			s=s+1;
			System.out.println("r"+" "+r+ " "+"c"+" "+c+" "+"i"+" "+i+" "+"j"+" "+j+" "+"s"+" "+s);

		}
	}
}