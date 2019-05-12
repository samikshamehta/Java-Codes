import java.math.*;
import java.util.Scanner;
public class RecursiveGeometricSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		double ans= findGeometricSum(k);
		System.out.println(ans);
	}
	public static double findGeometricSum(int k){
		if(k==0)
		{
			return 1;
		}
		double ans=findGeometricSum(k-1);
		return ans+1/(Math.pow(2, k));
	}

}
