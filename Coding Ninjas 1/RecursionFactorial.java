import java.util.Scanner;
public class RecursionFactorial {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int num=s.nextInt();
	int sum=factorial(num);
	System.out.println(sum);
	}
	public static int factorial(int num){
		if(num==1)
		{
			return 1;
		}
		int smallAns=factorial(num-1);
		return smallAns*num;
	}
}

