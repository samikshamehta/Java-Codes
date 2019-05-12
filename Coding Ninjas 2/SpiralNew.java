import java.util.Scanner;
public class SpiralNew {
	public static void main(String[] args) {
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
		int left=0,top=0;
		int right=matrix[0].length-1;
		int bottom=matrix.length-1;
		while(left<right && top<bottom)
		{
			for(int j=left;j<=right;j++)
			{
				System.out.print(matrix[left][j]+" ");
			}
			top=top+1;
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(matrix[i][right]+" ");
			}
			right=right-1;
			for(int j=right;j>=left;j--)
			{
				System.out.print(matrix[bottom][j]+" ");
			}
			bottom=bottom-1;
			for(int i=bottom;i>=top;i--)
			{
				System.out.print(matrix[i][left]+" ");
			}
			left=left+1;
		}
	}
}