import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MarchCircuitBreakingEdges {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer>arrList=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);
		divideInEqualSums (arrList);
	}
	static ArrayList<Integer>DP1=new ArrayList<>();
	static ArrayList<Integer>DP2=new ArrayList<>();
	public static void divideInEqualSums(ArrayList<Integer>arrList) 
    {
        int pos1=0;
        int pos2=0;
        
        int i=arrList.size()-1;
        
        int sum1 = 0;
        int sum2 = 0;
        while (i>=0)
        {
            if (sum1 < sum2)
            {
                DP1.add(pos1, arrList.get(i));
                pos1++;
                sum1 |= arrList.get(i);
            }
            else
            {
            	DP2.add(pos2, arrList.get(i));
                pos2++;
                sum2 |= arrList.get(i);
            }
            i--;
        }
        
        /*while (i>=0)
        {
            if (pos1 < setSize)
                set1[pos1++] = arr[i];
            else
                set2[pos2++] = arr[i];
            i--;
        }*/
        
        printArrayWithSum(DP1);
        printArrayWithSum(DP2);
    }
	static void printArrayWithSum (ArrayList<Integer>DP)
    {
        int sum = 0;
        for (int i=0; i<DP.size(); i++)
        {
            sum += DP.get(i);
            System.out.print(DP.get(i)+",");
        }
        System.out.println(" = " + sum);
    }
    
}